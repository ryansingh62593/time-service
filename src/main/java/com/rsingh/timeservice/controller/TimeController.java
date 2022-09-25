package com.rsingh.timeservice.controller;

import com.rsingh.timeservice.model.TimeDto;
import com.rsingh.timeservice.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/time-service")
public class TimeController {
    @Autowired
    TimeService timeService;

    @GetMapping("/time/**")
    public TimeDto getTime(HttpServletRequest request) {
        String timezone = request
                .getRequestURI()
                .split(request.getContextPath() + "/time/")[1];
        return timeService.getTime(timezone);
    }
}
