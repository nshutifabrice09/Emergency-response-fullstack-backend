package com.nshuti.Emergency_response_fullstack_backend.controller;

import com.nshuti.Emergency_response_fullstack_backend.repository.ResponderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponderController {

    @Autowired
    private ResponderRepository responderRepository;
}
