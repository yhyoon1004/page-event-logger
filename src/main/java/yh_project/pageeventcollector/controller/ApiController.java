package yh_project.pageeventcollector.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class ApiController {

    @GetMapping("test")
    public String test() {

        return "test";
    }
}
