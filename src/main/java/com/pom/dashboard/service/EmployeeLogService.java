package com.pom.dashboard.service;

import java.util.List;

import com.pmo.dashboard.entity.EmployeeLog;
import com.pmo.dashboard.entity.EmployeeLogPageCondition;

/**
 * 员工日志
 * @author Devin
 *
 */
public interface EmployeeLogService extends BaseLogService{
	
	
	List<EmployeeLog> getLogByEmployeeID(String id);
	int countEmployeeLogList(EmployeeLogPageCondition employeeLogPageCondition);
	List<EmployeeLog> queryEmployeeLogList(EmployeeLogPageCondition employeeLogPageCondition);
	

}
