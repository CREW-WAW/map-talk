package com.waw.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String test() {
    return "thymeleaf/webSocket";
  }
}
