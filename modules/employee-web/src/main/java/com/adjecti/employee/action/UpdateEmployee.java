package com.adjecti.employee.action;

import com.adjecti.employee.constants.EmployeePortletKeys;
import com.adjecti.employee.model.Employee;
import com.adjecti.employee.service.EmployeeLocalService;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
	    immediate = true,
	    property = {
	    		"javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
				"mvc.command.name=updateEmployee"
	    },
	    service = MVCActionCommand.class
	)


public class UpdateEmployee  extends BaseMVCActionCommand {


	@Reference
	CounterLocalService counterLocalService;
            
	@Reference
	EmployeeLocalService employeeLocalService;

	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		  long employeeId = ParamUtil.getLong(actionRequest, "employeeId");
		  actionResponse.setRenderParameter("employeeId", String.valueOf(employeeId));
		  actionResponse.setRenderParameter("mvcRenderCommandName","/add_Employee" );
		  System.out.println(employeeId);
		  
		  System.out.println("Hello everyone this a updte page");
		 
	/*	long employeeId = ParamUtil.getLong(actionRequest, "employeeId");
		System.out.println(employeeId);
		
		System.out.println(employeeId);
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String email = ParamUtil.getString(actionRequest, "email");
		String password = ParamUtil.getString(actionRequest, "password");
		String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");
		String address = ParamUtil.getString(actionRequest, "address");
		Employee employee = null;
		try {
			employee = employeeLocalService.getEmployee(employeeId);
			
			if(Validator.isNotNull(employee)) {
		
				System.out.println("alert");	
			employee.setFirstName(firstName);
				employee.setLastName(lastName);
				employee.setEmail(email);
				
				employee.setPassword(password);
				employee.setPhoneNumber(phoneNumber);
				employee.setAddress(address);
				employeeLocalService.updateEmployee(employee);
				System.out.println("THis Is Update page");
				
			}
		} catch (Exception e) {
	    e.getMessage();
		}
		
		
	*/	
	}

}
