package com.aamir.service;

import com.aamir.client.JsonPlaceHolder;
import com.aamir.dto.JsonPlaceHolerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HttpExchangeService {
    @Autowired
    private JsonPlaceHolder jsonPlaceHolder;

    public List<JsonPlaceHolerRecord> getAllPost() {
        JsonPlaceHolerRecord[] allPost = jsonPlaceHolder.getAllPost();
        return Arrays.asList(allPost);
    }
}
