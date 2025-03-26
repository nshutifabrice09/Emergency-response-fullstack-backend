package com.nshuti.Emergency_response_fullstack_backend.controller;

import com.nshuti.Emergency_response_fullstack_backend.exception.NotificationNotFoundException;
import com.nshuti.Emergency_response_fullstack_backend.exception.ResponderNotFoundException;
import com.nshuti.Emergency_response_fullstack_backend.model.Responder;
import com.nshuti.Emergency_response_fullstack_backend.repository.ResponderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ResponderController {

    @Autowired
    private ResponderRepository responderRepository;

    @PostMapping("/register/responder")
    Responder newResponder(@RequestBody Responder newResponder){
        return responderRepository.save(newResponder);
    }

    @GetMapping("/list/responders")
    List<Responder> getAllResponders(){
        return responderRepository.findAll();
    }

    @GetMapping("/find/responder/{responderId}")
    Responder getResponderById(@PathVariable Long responderId){
        return responderRepository.findById(responderId)
                .orElseThrow(()-> new NotificationNotFoundException(responderId));

    }

    @PutMapping("/edit/responder/{responderId}")
    Responder updateResponder(@RequestBody Responder newResponder, @PathVariable Long responderId){
        return responderRepository.findById(responderId)
                .map(responder->{
                    responder.setResponderId(newResponder.getResponderId());
                    responder.setName(newResponder.getName());
                    responder.setPhone(newResponder.getPhone());
                    responder.setType(newResponder.getType());
                    responder.setLatitude(newResponder.getLatitude());
                    responder.setLongitude(newResponder.getLongitude());
                    responder.setAvailable(newResponder.isAvailable());
                    return responderRepository.save(responder);
                }).orElseThrow(()->new ResponderNotFoundException(responderId));
    }

    @DeleteMapping("/delete/responder/{responderId}")
    String deleteResponder (@PathVariable Long responderId){
        if(!responderRepository.existsById(responderId)){
            throw new ResponderNotFoundException(responderId);
        }
        responderRepository.deleteById(responderId);
        return "Booking with id "+responderId+" has been deleted successfully.";
    }
}
