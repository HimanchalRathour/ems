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
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    immediate = true,
	    property = {
	    		"javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
				"mvc.command.name=addEmployee"
	    },
	    service = MVCActionCommand.class
	)


public class CreateAndSaveEmployee  extends BaseMVCActionCommand {

	@Reference
	CounterLocalService counterLocalService;
            
	@Reference
	EmployeeLocalService employeeLocalService;

	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
			System.out.println("----------------");
			long employeeId = ParamUtil.getLong(actionRequest, "employeeId");
			System.out.println(employeeId);
          System.out.println();
			String id = ParamUtil.getString(actionRequest, "employeeId");

			System.out.println("IPOP: " + id + ", " + ParamUtil.getString(actionRequest, "firstName"));

			if (Validator.isNotNull(id)) {
			    long employeeId1 = Long.parseLong(id);
			    Employee existingEmployee = employeeLocalService.getEmployee(employeeId1);
			    System.out.println("Not jhdshdjsi");
			    existingEmployee.setEmployeeId(employeeId1);

			    String firstName = ParamUtil.getString(actionRequest, "firstName");
			    String lastName = ParamUtil.getString(actionRequest, "lastName");
			    String email = ParamUtil.getString(actionRequest, "email");
			    String password = ParamUtil.getString(actionRequest, "password");
			    String address = ParamUtil.getString(actionRequest, "address");
			    String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");

			    existingEmployee.setFirstName(firstName);
			    existingEmployee.setLastName(lastName);
			    existingEmployee.setEmail(email);
			    existingEmployee.setPassword(password);
			    existingEmployee.setAddress(address);
			    existingEmployee.setPhoneNumber(phoneNumber);

			    employeeLocalService.updateEmployee(existingEmployee);
			} else {
			    long newEmployeeId = counterLocalService.increment(Employee.class.getName());
			    System.out.println("ID is null");
			    String firstName = ParamUtil.getString(actionRequest, "firstName");
			    String lastName = ParamUtil.getString(actionRequest, "lastName");
			    String email = ParamUtil.getString(actionRequest, "email");
			    String password = ParamUtil.getString(actionRequest, "password");
			    String address = ParamUtil.getString(actionRequest, "address");
			    String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");

			    Employee newEmployee = employeeLocalService.createEmployee(newEmployeeId);
			    newEmployee.setFirstName(firstName);
			    newEmployee.setLastName(lastName);
			    newEmployee.setEmail(email);
			    newEmployee.setPassword(password);
			    newEmployee.setAddress(address);
			    newEmployee.setPhoneNumber(phoneNumber);

			    employeeLocalService.addEmployee(newEmployee);

			    actionRequest.setAttribute("newEmployeeCreated", true);
			}


	}
}
