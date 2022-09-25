package com.rsingh.timeservice.service;

import com.rsingh.timeservice.model.TimeDto;

public interface TimeService {
    TimeDto getTime(String timezone);
}
