package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;



import net.bytebuddy.asm.Advice.Return;

@RestController
public class Nomor2 {
	
	private static final Logger logger = LoggerFactory.getLogger(Nomor2.class);
	OutputModel outputModel = new OutputModel() ;
	
	@PostMapping("/nomor2/{language}")
	public ResponseEntity<?> nomor2(@PathVariable String language, @RequestBody BodyModel bodyvalue){
	    
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
		        .getRequest();

		String ip = request.getRemoteAddr();
		
		outputModel.setCounter(bodyvalue.getCounter());
	    outputModel.setRandom(language);
	    logger.info("Success: POST http://" + ip+" "+ outputModel.toString());
	    return new ResponseEntity<>("code : 201", HttpStatus.CREATED);
		}

	}

	