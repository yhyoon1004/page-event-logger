package yh_project.pageeventcollector.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yh_project.pageeventcollector.repository.mongo.collection.pageEvent.PageEvent;
import yh_project.pageeventcollector.service.MongoService;

import java.time.LocalDateTime;

@RequestMapping("/rest")
@RestController
@RequiredArgsConstructor
public class ApiController {

    private final MongoService mongoService;
    @GetMapping("/hit")
    public void eventHit(HttpServletRequest request,
                         @RequestParam(defaultValue = "-") String section,
                         @RequestParam(defaultValue = "-") String element) {

        String remoteIP = request.getRemoteAddr();
        LocalDateTime requestDate = LocalDateTime.now();

        PageEvent event = PageEvent.builder()
                .section(section)
                .element(element)
                .eventTime(requestDate)
                .requestIP(remoteIP)
                .build();

        mongoService.insertPageEvent(event);

    }




    @GetMapping("test")
    public String test() {
        return "test";
    }
}
