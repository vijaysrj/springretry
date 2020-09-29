package com.example.retry;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private RetryService retryService;
	
	@PostMapping(value="/post")
	public void post(@RequestBody Map<String,String> request) throws Exception{
		
		retryService.retry(request);
	}

}
