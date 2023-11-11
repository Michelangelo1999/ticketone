package com.example.ticketone.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;

@Service
public class BigliettiService {

    public Object getBiglietti() {
        // request url
        String url = "https://api.eventim.com/seatmap/api/SeatMapHandler";

        // create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // create headers
        HttpHeaders headers = new HttpHeaders();

        // set `Content-Type` and `Accept` headers
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity request = new HttpEntity(headers);

        String smcVersion = "v5.2";
        String version = "v5.7.0";
        String cType = "SETA";
        String cId = "13002";
        String evId = "48514";
        String selectedSeats = "";
        String a_holds = "1";
        String a_SystemID = "90600215";
        String a_OperatorID = "30297";
        String key = "eventAvailabilityRefresh_48514_30297";
        String fun = "json";
        String areaId = "0";
        String a_seatViewInfos = "1";

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("smcVersion", smcVersion)
                .queryParam("version", version)
                .queryParam("cType", cType)
                .queryParam("cId", cId)
                .queryParam("evId", evId)
                .queryParam("selectedSeats", selectedSeats)
                .queryParam("a_holds", a_holds)
                .queryParam("a_SystemID", a_SystemID)
                .queryParam("a_OperatorID", a_OperatorID)
                .queryParam("key", key)
                .queryParam("fun", fun)
                .queryParam("areaId", areaId)
                .queryParam("a_seatViewInfos", a_seatViewInfos)
                .encode()
                .toUriString();

        // make an HTTP GET request with headers
        ResponseEntity<Object> response = restTemplate.exchange(urlTemplate, HttpMethod.GET, request, Object.class, 1);

        // check response
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Successful.");
            return response.getBody();
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
            return null;
        }
    }

    public Object getBigliettiAlt() {
        // request url
        String url = "https://sport.ticketone.it/api/event/getpricesoptimized/48514/90600215";

        // create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // create headers
        HttpHeaders headers = new HttpHeaders();

        // set `Content-Type` and `Accept` headers
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request

        HttpEntity request = new HttpEntity(headers);

        /*
        String smcVersion = "v5.2";
        String version = "v5.7.0";
        String cType = "SETA";
        String cId = "13002";
        String evId = "48514";
        String selectedSeats = "";
        String a_holds = "1";
        String a_SystemID = "90600215";
        String a_OperatorID = "30297";
        String key = "eventAvailabilityRefresh_48514_30297";
        String fun = "json";
        String areaId = "0";
        String a_seatViewInfos = "1";

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("smcVersion", smcVersion)
                .queryParam("version", version)
                .queryParam("cType", cType)
                .queryParam("cId", cId)
                .queryParam("evId", evId)
                .queryParam("selectedSeats", selectedSeats)
                .queryParam("a_holds", a_holds)
                .queryParam("a_SystemID", a_SystemID)
                .queryParam("a_OperatorID", a_OperatorID)
                .queryParam("key", key)
                .queryParam("fun", fun)
                .queryParam("areaId", areaId)
                .queryParam("a_seatViewInfos", a_seatViewInfos)
                .encode()
                .toUriString(); */

        // make an HTTP GET request with headers
        ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET, request, Object.class, 1);

        // check response
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Successful.");
            return response.getBody();
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
            return null;
        }
    }
}
