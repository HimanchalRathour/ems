package com.adjecti.user.render;


import com.adjecti.user.constants.UserPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;



@Component(
		immediate = true,
		property = { "javax.portlet.name=" + UserPortletKeys.USER,
		"mvc.command.name=formRender" }, service = MVCRenderCommand.class
		)
public class FormRender implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		 System.out.println("hello.............");
		return "/FormView.jsp";
	
	}
	
	

}
