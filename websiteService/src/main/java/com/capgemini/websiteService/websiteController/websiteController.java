package com.capgemini.websiteService.websiteController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class websiteController {

	@Autowired
	private RestTemplate template;
	
	   @RequestMapping("/name")
	   public ModelAndView home() {
//		   String response = template.exchange("http://hello-service/hello",
//                   HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
		   String responseOne = template.getForObject("http://hello-service/hello", String.class);
		   
		   return new ModelAndView("hello","message",responseOne);
	   }
}
