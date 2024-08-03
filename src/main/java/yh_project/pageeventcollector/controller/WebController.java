package yh_project.pageeventcollector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("Hello", "World");
        return "index";
    }
    @GetMapping("/index*")
    public String indexTemplate(Model model) {
        model.addAttribute("Hello", "World");
        return "index-template";
    }

    /**
     * 개발하는 동안 보면서 차용할 템플릿 페이지 경로 매핑
     */
    @GetMapping("/ui-elements*")
    public String uiElements() {
        return "ui-elements";
    }
    @GetMapping("/chart*")
    public String chart() {
        return "chart";
    }
    @GetMapping("/empty*")
    public String empty() {
        return "empty";
    }
    @GetMapping("/form*")
    public String form() {
        return "form";
    }
    @GetMapping("/tab-panel*")
    public String tabPanel() {
        return "tab-panel";
    }
    @GetMapping("/table*")
    public String table() {
        return "table";
    }
}
