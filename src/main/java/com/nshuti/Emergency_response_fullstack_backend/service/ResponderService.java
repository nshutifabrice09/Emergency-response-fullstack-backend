package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.Responder;

import java.util.List;

public interface ResponderService {
    Responder saveResponder (Responder responder);
    List<Responder> getAllResponder ();
    Responder findById (Long responderId);
    Responder updateById (Long responderId, Responder responder);
    void removeById (Long responderId);
}
