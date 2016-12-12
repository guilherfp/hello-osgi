package br.com.pcsist.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class HelloResource {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public @ResponseBody String get() {
    return "HELLO";
  }

}
