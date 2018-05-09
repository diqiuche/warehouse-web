package com.warehouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.warehouse.bean.Log;
import com.warehouse.common.WMessage;
import com.warehouse.mapper.LogMapper;
import com.warehouse.service.LogService;
import com.warehouse.utils.TimeUtil;

@Service
@RequestMapping("/log")
public class LogServiceImpl implements LogService {

	@Autowired
	private LogMapper logMapper;

	@Override
	public Integer insertLog(Log log) {
		return logMapper.insertSelective(log);
	}

	@Override
	public Log createLog(String operator, String operationType, String operationDetail) {
		Log log=new Log();
		log.setOperatorName(operator);
		log.setOperationType(operationType);
		log.setOperationDetail(operationDetail);
		return log;
	}
	
	
}
