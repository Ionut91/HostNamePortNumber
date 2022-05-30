package it.develhope.fouthApi.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;


@RestController
public class HeadController {
    @GetMapping(value = "/")
    public String getHeader(@RequestHeader HttpHeaders headers){

       InetSocketAddress host = headers.getHost();
        return "Host : "+ host.getHostName() + "Port : "+host.getPort();
    }
}
