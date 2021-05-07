package com.bn.docmanager.service;

import com.bn.docmanager.model.PersonalBasicInformation;
import com.bn.docmanager.util.Result;

import java.util.List;

/**
 * @author wty
 * @date 2020/11/29 14:51
 */
public interface PersonalBasicInformationService {
	
	Result< PersonalBasicInformation > findOne(Long id );
	
	Result< PersonalBasicInformation > add( PersonalBasicInformation record );
	
	Result< PersonalBasicInformation > update(PersonalBasicInformation record );
	
	Result< List< PersonalBasicInformation > > list(PersonalBasicInformation record );
}
