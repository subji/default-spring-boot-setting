package com.group.project.guide.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.group.project.common.dto.CommonResponseDTO;
import com.group.project.guide.dto.GuideMapperDTO;
import com.group.project.guide.entity.Guide;
import com.group.project.guide.entity.User;
import com.group.project.guide.service.GuideService;
import com.group.project.httpClient.service.CallAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuideController {
  
  private static final Logger logger = LoggerFactory.getLogger(GuideController.class);

  @Value("${test.url}")
  private String testUrl;

  private final CallAPI callApi;
  private final GuideService guideService;
  
  public GuideController (CallAPI callApi, GuideService guideService) {
    this.callApi = callApi;
    this.guideService = guideService;
  }

  @RequestMapping(value = "/api/guide.json", method = { RequestMethod.GET, RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<CommonResponseDTO> getGuide (@RequestParam Map<String, Object> parameter, HttpServletRequest request, HttpSession session) {
    ResponseEntity<CommonResponseDTO> result = null;
    CommonResponseDTO commonResponseDTO = new CommonResponseDTO();

    try {
      commonResponseDTO.setMessage("OK");
      commonResponseDTO.setStatus("200");
      commonResponseDTO.setData(callApi.get(testUrl, parameter));

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.OK);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);

      commonResponseDTO.setStatus("400");
      commonResponseDTO.setMessage(e.getMessage());

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.BAD_REQUEST);
    }

    return result;
  }

  @RequestMapping(value = { "/api/guide2.json" }, method = { RequestMethod.GET, RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<CommonResponseDTO> getGuideMapper (HttpServletRequest request, HttpSession session) {
    ResponseEntity<CommonResponseDTO> result = null;
    CommonResponseDTO commonResponseDTO = new CommonResponseDTO();

    try {

      GuideMapperDTO guideMapperDTO = new GuideMapperDTO();
      guideMapperDTO.setUserName("test");

      commonResponseDTO.setMessage("OK");
      commonResponseDTO.setStatus("200");
      commonResponseDTO.setData(guideService.selectGuideMapper(guideMapperDTO));

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.OK);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);

      commonResponseDTO.setStatus("400");
      commonResponseDTO.setMessage(e.getMessage());

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.BAD_REQUEST);
    }

    return result;
  }

  @RequestMapping(value = { "/api/guide3.json" }, method = { RequestMethod.GET, RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<CommonResponseDTO> getGuideJpa (HttpServletRequest request, HttpSession session) {
    ResponseEntity<CommonResponseDTO> result = null;
    CommonResponseDTO commonResponseDTO = new CommonResponseDTO();

    try {

      String userSeq = "107";

      List<Guide> guide = guideService.findByUserSeq(userSeq);

      commonResponseDTO.setStatus("200");
      commonResponseDTO.setMessage("OK");
      commonResponseDTO.setData(guide);

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.OK);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);

      commonResponseDTO.setStatus("400");
      commonResponseDTO.setMessage(e.getMessage());

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.BAD_REQUEST);
    }

    return result;
  }

}