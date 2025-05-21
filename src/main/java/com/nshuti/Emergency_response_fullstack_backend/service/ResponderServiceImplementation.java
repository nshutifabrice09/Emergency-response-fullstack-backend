package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.Responder;
import com.nshuti.Emergency_response_fullstack_backend.repository.ResponderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponderServiceImplementation implements ResponderService{

    private final ResponderRepository responderRepository;

    @Autowired
    public ResponderServiceImplementation(ResponderRepository responderRepository) {
        this.responderRepository = responderRepository;
    }

    @Override
    public Responder saveResponder(Responder responder) {
        return responderRepository.save(responder);
    }

    @Override
    public List<Responder> getAllResponder() {
        return responderRepository.findAll();
    }

    @Override
    public Responder getById(Long id) {
        return ;
    }

    @Override
    public Responder updateById(Long id, Responder responder) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
