package com.bn.docmanager.service.impl;

import com.bn.docmanager.mapper.PersonalBasicInformationMapper;
import com.bn.docmanager.model.PersonalBasicInformation;
import com.bn.docmanager.service.PersonalBasicInformationService;
import com.bn.docmanager.util.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author wty
 * @date 2020/11/29 14:52
 */
@Service
public class PersonalBasicInformationServiceImpl implements PersonalBasicInformationService {
	@Autowired
	private PersonalBasicInformationMapper personalBasicInformationMapper;
	
	@Override
	public Result< PersonalBasicInformation > findOne( Long id) {
		Result< PersonalBasicInformation > objectResult = new Result<>( );
		objectResult.setData( personalBasicInformationMapper.selectByPrimaryKey( id ) );
		return objectResult;
	}
	
	@Override
	public Result< PersonalBasicInformation > add(PersonalBasicInformation record ) {
		Result result = new Result();
		personalBasicInformationMapper.insertSelective( record );
		result.setCode( 200 );
		return result;
	}
	
	@Override
	public Result< PersonalBasicInformation > update(PersonalBasicInformation record  ) {
		return null;
	}
	
	@Override
	public Result< List< PersonalBasicInformation > > list( PersonalBasicInformation record ) {
		Result< List< PersonalBasicInformation >  > objectResult = new Result<>( );
		Example example = new Example( PersonalBasicInformation.class );
		example.orderBy( "id" ).desc();
		Example.Criteria criteria = example.createCriteria();
		PageHelper.startPage(record.getIndex(), record.getSize());
		List< PersonalBasicInformation > personalBasicInformations = personalBasicInformationMapper.selectByExample( example );
		PageInfo page = new PageInfo(personalBasicInformations);
		// criteria
		objectResult.setData( page.getList());
		objectResult.setTotal( page.getTotal() );
		return objectResult;
	}
}
