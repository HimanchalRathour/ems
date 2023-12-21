package com.adjecti.user.portlet;

import com.adjecti.user.constants.UserPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Himanchal(Himmu)
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=User",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/userlist.jsp",
		"javax.portlet.name=" + UserPortletKeys.USER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UserPortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
	System.out.println("Step:1 this is a portlet page");	// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}
	
	
}