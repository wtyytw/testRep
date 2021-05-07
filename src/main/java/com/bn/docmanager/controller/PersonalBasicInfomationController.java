package com.bn.docmanager.controller;

import com.bn.docmanager.model.PersonalBasicInformation;
import com.bn.docmanager.service.PersonalBasicInformationService;
import com.bn.docmanager.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wty
 * @date 2020/11/29 15:01
 */
@RequestMapping( "/baseInfo" )
@RestController
public class PersonalBasicInfomationController {
	@Autowired
	private PersonalBasicInformationService personalBasicInformationService;
	@GetMapping("/list")
	public Result< List< PersonalBasicInformation > > list( PersonalBasicInformation record ) {
		return personalBasicInformationService.list( record );
	}
	
	@GetMapping("/findOne/{id}")
	public Result<  PersonalBasicInformation  > list(@PathVariable("id") Long id ) {
		return personalBasicInformationService.findOne( id );
	}
	@PostMapping("/add")
	public Result<  PersonalBasicInformation  > add(@RequestBody PersonalBasicInformation record ) {
		return personalBasicInformationService.add( record );
	}
}
