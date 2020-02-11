package com.group.project.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/** 
 * Index Controller 
*/
@Controller
public class IndexController {

  @GetMapping({ "/", "index" }) 
  public String index (Model model)  {
    return "index/index";
  }
  
}