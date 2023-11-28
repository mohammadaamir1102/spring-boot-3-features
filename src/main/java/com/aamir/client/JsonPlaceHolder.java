package com.aamir.client;

import com.aamir.dto.JsonPlaceHolerRecord;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange("https://jsonplaceholder.typicode.com")
public interface JsonPlaceHolder {


    @GetExchange("/posts")
    public JsonPlaceHolerRecord[] getAllPost();


}
