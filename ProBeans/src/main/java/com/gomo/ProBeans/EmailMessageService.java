package com.gomo.ProBeans;

import java.time.LocalDateTime;

public class EmailMessageService implements MessageService {


    String email = "\uD83D\uDCE7";

    @Override
    public String getMessage() {
        return  email + " " + " Email Message Sent at " + LocalDateTime.now();

    }

    @Override
    public String getServiceType() {
        return "Email";
    }
}
