package com.gomo.ProBeans;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public MessageResponse sendMessage(){
        return new MessageResponse(
                messageService.getMessage(),
                messageService.getServiceType()
        );
    }

    public record MessageResponse(String message , String serviceType){}
}
