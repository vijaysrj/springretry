package com.example.retry;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RetryServiceImpl implements RetryService{
	
	Logger logger = LoggerFactory.getLogger(RetryServiceImpl.class);
	
	static int counter = 0;

	@Override
	public void retry(Map<String, String> request) throws Exception {
		
		counter++;
		
		
		logger.info("Executing retry service");
		
		
		if(counter==1) {
		throw new Exception("Testing retry");
		}else {
			
			logger.info("Retry succeeded");
		}
		
	}

}
