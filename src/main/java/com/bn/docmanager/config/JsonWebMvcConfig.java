package com.bn.docmanager.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @author wty
 * @date 2020/5/1 21:11
 */
@Configuration
public class JsonWebMvcConfig {
	@Bean
	ObjectMapper getObjectMapper(){
		ObjectMapper objectMapper = new ObjectMapper( );
		objectMapper.setDateFormat( new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss" ) );
		return objectMapper;
	}
	
}
