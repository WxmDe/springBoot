package com.wxm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wxm.dao.ITableaDao;
import com.wxm.domain.Tablea;
import com.wxm.service.ITestService;

@Service
public class TestServiceImpl implements ITestService{
	@Resource
	private ITableaDao tableDao;
	
	@Override
	public Tablea selectByPrimaryKey(Long id) {
		System.out.println("srevice");
		return tableDao.selectByPrimaryKey(id);
	}

}
