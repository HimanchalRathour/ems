/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.adjecti.employee.service.impl;

import com.adjecti.employee.model.Employee;
import com.adjecti.employee.service.base.EmployeeLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.adjecti.employee.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	
	public List<Employee> getEmployeesByEmail(String email){
		List<Employee> employeee = new ArrayList<>();
		List<Employee> list = employeePersistence.findByemail(email);
		
		for(Employee employee:list) {
			if(employee.getEmployeeId()>100) {
				employeee.add(employee);
			}
		}
		return employeee;
		
	}
}