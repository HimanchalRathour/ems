package com.adjecti.employee.action;

import com.adjecti.employee.constants.EmployeePortletKeys;
import com.adjecti.employee.service.EmployeeLocalService;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
	    immediate = true,
	    property = {
	    		"javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
				"mvc.command.name=deleteEmployee"
	    },
	    service = MVCActionCommand.class
	)

public class DeleteEmployee extends BaseMVCActionCommand  {

  
	
	@Reference
	EmployeeLocalService employeeLocalService;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long employeeId = ParamUtil.getLong(actionRequest, "empId", GetterUtil.DEFAULT_LONG);
		System.out.println("empId genrated " + employeeId);
       System.out.println("Hello guys delete successfully");
		try {
			 employeeLocalService.deleteEmployee(employeeId); 
		} catch (Exception e) {
			e.getMessage();
		}


		
	}

}
