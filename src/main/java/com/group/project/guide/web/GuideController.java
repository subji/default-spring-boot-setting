package com.group.project.guide.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.group.project.common.dto.CommonResponseDTO;
import com.group.project.guide.dto.GuideDTO;
import com.group.project.guide.service.GuideService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuideController {
  
  private static final Logger logger = LoggerFactory.getLogger(GuideController.class);

  @Value("${TM2.URL}")
  private String testUrl;

  private final GuideService guideService;
  
  public GuideController (GuideService guideService) {
    this.guideService = guideService;
  }

  @GetMapping(path = "/api/tm2", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CommonResponseDTO> getGuide(@RequestParam Map<String, Object> parameter, HttpServletRequest request, HttpSession session) {
    ResponseEntity<CommonResponseDTO> result = null;
    CommonResponseDTO commonResponseDTO = new CommonResponseDTO();

    try {
      commonResponseDTO.setMessage("OK");
      commonResponseDTO.setStatus("200");
      commonResponseDTO.setData(guideService.getTm2Api(testUrl, parameter));

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.OK);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);

      commonResponseDTO.setStatus("400");
      commonResponseDTO.setMessage(e.getMessage());

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.BAD_REQUEST);
    }

    return result;
  }

  @GetMapping(path = "/api/mybatis/{withdrawalCodeSeq}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CommonResponseDTO> getGuideMapper(HttpServletRequest request, HttpSession session, @PathVariable(required = false, name = "withdrawalCodeSeq") Long withdrawalCodeSeq) {
    ResponseEntity<CommonResponseDTO> result = null;
    CommonResponseDTO commonResponseDTO = new CommonResponseDTO();

    GuideDTO guideDTO = new GuideDTO();
    guideDTO.setWithdrawalCodeSeq(withdrawalCodeSeq);
    
    try {
      commonResponseDTO.setMessage("OK");
      commonResponseDTO.setStatus("200");
      commonResponseDTO.setData(guideService.selectGuideMapper(guideDTO));

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.OK);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);

      commonResponseDTO.setStatus("400");
      commonResponseDTO.setMessage(e.getMessage());

      result = new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.BAD_REQUEST);
    }

    return result;
  }

  @GetMapping(path = "/api/jpa/{withdrawalCodeSeq}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CommonResponseDTO> getGuideJpa(HttpServletRequest request, HttpSession session, @PathVariable(required = false, name = "withdrawalCodeSeq") Long withdrawalCodeSeq) {
    ResponseEntity<CommonResponseDTO> result = null;
    CommonResponseDTO commonResponseDTO = new CommonResponseDTO();

    GuideDTO guideDTO = new GuideDTO();
    guideDTO.setWithdrawalCodeSeq(withdrawalCodeSeq);

    try {
      commonResponseDTO.setStatus("200");
      commonResponseDTO.setMessage("OK");
      commonResponseDTO.setData(guideService.findByWithdrawalCodeSeq(guideDTO));

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