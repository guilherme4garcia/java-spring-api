package topicos.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

  @GetMapping("/")
  public String index() {
    return "Hello (:";
  }
}
