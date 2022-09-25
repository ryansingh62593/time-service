package com.rsingh.timeservice.client;

import com.rsingh.timeservice.exception.InvalidTimezoneException;
import com.rsingh.timeservice.model.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Component
public class TimeClient {
    @Autowired
    WebClient webClient;

    @Value("http://worldtimeapi.org/api/timezone/{timezone}")
    String timeEndpoint;

    final String INVALID_TIMEZONE = "Invalid timezone";

    public Time getTime(String timezone) {
        Map<String, String> params = new HashMap<>();
        params.put("timezone", timezone);

        URI uri = UriComponentsBuilder.fromHttpUrl(timeEndpoint)
                .buildAndExpand(params)
                .toUri();

        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(Time.class)
                .doOnError(error -> {
                    throw new InvalidTimezoneException(INVALID_TIMEZONE);
                })
                .block();
    }
}
