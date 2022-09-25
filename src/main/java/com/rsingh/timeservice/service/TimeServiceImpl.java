package com.rsingh.timeservice.service;

import com.rsingh.timeservice.client.TimeClient;
import com.rsingh.timeservice.model.Time;
import com.rsingh.timeservice.model.TimeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeServiceImpl implements TimeService {
    @Autowired
    TimeClient timeClient;

    @Override
    public TimeDto getTime(String timezone) {
        Time time = timeClient.getTime(timezone);
        return new TimeDto(time);
    }
}
