package com.aamir.client;

import com.aamir.dto.JsonPlaceHolerRecord;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("//jsonplaceholder.typicode.com")
public interface JsonPlaceHolderClient {


    @GetExchange("/posts")
    public JsonPlaceHolerRecord[] getAllPost();


}
