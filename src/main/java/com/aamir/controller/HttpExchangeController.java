package com.aamir.controller;

import com.aamir.client.JsonPlaceHolder;
import com.aamir.dto.JsonPlaceHolerRecord;
import com.aamir.service.HttpExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/httpExchange")
public class HttpExchangeController {

    @Autowired
    private HttpExchangeService httpExchangeService;

    @GetMapping("/getPosts")
    public List<JsonPlaceHolerRecord> getAllPost(){
        return httpExchangeService.getAllPost();
    }
}
