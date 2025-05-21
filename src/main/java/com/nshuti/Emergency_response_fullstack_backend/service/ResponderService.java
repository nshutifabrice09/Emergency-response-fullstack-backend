package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.Responder;

import java.util.List;

public interface ResponderService {
    Responder saveResponder (Responder responder);
    List<Responder> getAllResponder ();
    Responder findById (Long id);
    Responder updateById (Long id, Responder responder);
    void removeById (Long id);
}
