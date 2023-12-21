package com.adjecti.user.action;

import com.adjecti.user.constants.UserPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + UserPortletKeys.USER,
		"mvc.command.name=addUser" }, service = MVCActionCommand.class)

public class SaveUser extends BaseMVCActionCommand {
	@Reference
	CounterLocalService CounterLocalService;

	@Reference
	UserLocalService userLocalService;

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		  
		System.out.println("hello welcome Action form");
		
		  long userId = CounterLocalService.increment(User.class.getName()); String
		  firstName = ParamUtil.getString(actionRequest, "firstName"); User user =
		  userLocalService.createUser(userId); user.setFirstName(firstName);
		  userLocalService.addUser(user);
		   
	}

	
	 

}
