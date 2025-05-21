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
    public List<Responder> getAllResponders() {
        return responderRepository.findAll();
    }

    @Override
    public Responder getResponderById(Long id) {
        return responderRepository.findResponderById(id);
    }

    @Override
    public Responder updateById(Long id, Responder responder) {
        Responder existResponder = responderRepository.findResponderById(id);
        if(existResponder != null){
            existResponder.setName(responder.getName());
            existResponder.setPhone(responder.getPhone());
            existResponder.setType(responder.getType());
            existResponder.setLatitude(responder.getLatitude());
            existResponder.setLongitude(responder.getLongitude());
            existResponder.setAvailable(responder.isAvailable());
            return responderRepository.save(existResponder);
        }
        return null;
    }

    @Override
    public void removeById(Long id) {
        responderRepository.deleteById(id);
    }
}
