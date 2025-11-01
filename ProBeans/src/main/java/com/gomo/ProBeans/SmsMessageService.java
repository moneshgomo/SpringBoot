package com.gomo.ProBeans;

import java.time.LocalDateTime;

public class SmsMessageService implements  MessageService{


    String call = "\uD83D\uDCDE";



    @Override
    public String getMessage() {
        return call+ " " +"SMS Message send at  " + LocalDateTime.now();
    }

    @Override
    public String getServiceType() {
        return "SMS";
    }
}
