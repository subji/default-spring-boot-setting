package com.group.project.guide.web;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuidePageController {
  
  private static final Logger logger = LoggerFactory.getLogger(GuidePageController.class);

  @GetMapping(value = { "/guide" })
  public String guidePage (HttpSession session, ModelMap modelMap)  {
    return "guide/guide";
  }
  
}