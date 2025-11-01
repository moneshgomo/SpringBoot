package com.gomo.ProBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProBeansApplication.class, args);
	}



	/*
	  {{{ email in app.yml file }}}

	PS C:\Users\ASUS\OneDrive\Documents\Desktop\SpringBoot\ProBeans> http :8090/api/messages
	HTTP/1.1 200
	Connection: keep-alive
	Content-Type: application/json
	Date: Sat, 01 Nov 2025 05:35:01 GMT
	Keep-Alive: timeout=60
	Transfer-Encoding: chunked

	{
		"message": "📧 Email Message Sent at 2025-11-01T11:05:01.832837800",
		"serviceType": "Email"
	}


	PS C:\Users\ASUS\OneDrive\Documents\Desktop\SpringBoot\ProBeans>


  {{{ sms in app.yml file }}}
	PS C:\Users\ASUS\OneDrive\Documents\Desktop\SpringBoot\ProBeans> http :8090/api/messages
	HTTP/1.1 200
	Connection: keep-alive
	Content-Type: application/json
	Date: Sat, 01 Nov 2025 05:37:15 GMT
	Keep-Alive: timeout=60
	Transfer-Encoding: chunked

	{
		"message": "📞 SMS Message send at  2025-11-01T11:07:15.624425",
		"serviceType": "SMS"
	}


	PS C:\Users\ASUS\OneDrive\Documents\Desktop\SpringBoot\ProBeans>






	 */
}
