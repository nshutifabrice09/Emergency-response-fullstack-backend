package com.nshuti.Emergency_response_fullstack_backend.controller;
import com.nshuti.Emergency_response_fullstack_backend.model.Responder;
import com.nshuti.Emergency_response_fullstack_backend.service.ResponderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ResponderController {

    private final ResponderService responderService;


    @Autowired
    public ResponderController(ResponderService responderService) {
        this.responderService = responderService;
    }

    @PostMapping("/responder")
    public Responder saveResponder(@RequestBody Responder responder){
        return responderService.saveResponder(responder);
    }

    @GetMapping("/responders")
    public List<Responder> responderList(){
        return responderService.getAllResponders();
    }

    @GetMapping("/responder/{id}")
    public Responder getResponder(@PathVariable ("id") Long id){
        return responderService.getResponderById(id);
    }

    @PutMapping("/update/responder/{id}")
    public Responder updateResponder(@PathVariable ("id") Long id, @RequestBody Responder responder){
        return responderService.updateById(id, responder);
    }

    @DeleteMapping("/delete/responder/{id}")
    public void removeResponder(@PathVariable ("id") Long id){
        responderService.removeById(id);
    }
}
