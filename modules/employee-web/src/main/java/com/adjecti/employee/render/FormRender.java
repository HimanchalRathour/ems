package com.adjecti.employee.render;

import com.adjecti.employee.constants.EmployeePortletKeys;
import com.adjecti.employee.model.Employee;
import com.adjecti.employee.service.EmployeeLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
		"mvc.command.name=/add_Employee" }, service = MVCRenderCommand.class)
public class FormRender implements MVCRenderCommand {
	@Reference
	EmployeeLocalService employeeLocalService;

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String id = ParamUtil.getString(renderRequest, "employeeId");
		renderRequest.setAttribute("employeeId", id);
		//sssssSystem.out.println("render..." + id);
		try {
			Employee employee = employeeLocalService.getEmployee(Long.parseLong(id));
			renderRequest.setAttribute("employeeId", id);
			renderRequest.setAttribute("employee", employee);
			System.out.println("Update buuton click");
		} catch (NumberFormatException e) {

			e.getLocalizedMessage();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Form  aa jaye");
		return "/view.jsp";
	}

}
