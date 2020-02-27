package com.group.project.guide_api.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group.project.common.dto.CommonResponseDTO;
import com.group.project.guide_api.dto.GuideApiDTO;
import com.group.project.guide_api.service.GuideApiService;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuideController {

  private static final Logger logger = LoggerFactory.getLogger(GuideController.class);

  private final GuideApiService guideApiService;

  public GuideController(GuideApiService guideApiService) {
    this.guideApiService = guideApiService;
  }

  @RequestMapping(value = "/api/guide", method = { RequestMethod.GET, RequestMethod.POST })
  public CommonResponseDTO getApiData(HttpServletRequest request, HttpServletResponse response, @RequestParam String param1, Model model) {
    GuideApiDTO guideApiDTO = new GuideApiDTO();
    CommonResponseDTO commonResponseDTO = new CommonResponseDTO();

    try {
      commonResponseDTO.setStatus(HttpStatus.SC_OK);
      commonResponseDTO.setMessage("SUCCESS");
      commonResponseDTO.setData(guideApiService.getGuideApiData("", guideApiDTO));
    } catch (Exception e) {
      commonResponseDTO.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
      commonResponseDTO.setMessage(e.getMessage());
      commonResponseDTO.setData(null);
    }

    return commonResponseDTO;
  }
  
}