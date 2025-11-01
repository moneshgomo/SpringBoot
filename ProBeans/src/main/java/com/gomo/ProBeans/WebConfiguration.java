package com.gomo.ProBeans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MessageServiceRegister.class)
public class WebConfiguration  {


//
//    @Bean
//    public EmailMessageService emailMessageService(){  not required
//        return new EmailMessageService();
//    }
}
