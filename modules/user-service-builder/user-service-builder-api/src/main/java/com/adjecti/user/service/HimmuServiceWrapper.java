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

package com.adjecti.user.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HimmuService}.
 *
 * @author Brian Wing Shun Chan
 * @see HimmuService
 * @generated
 */
public class HimmuServiceWrapper
	implements HimmuService, ServiceWrapper<HimmuService> {

	public HimmuServiceWrapper() {
		this(null);
	}

	public HimmuServiceWrapper(HimmuService himmuService) {
		_himmuService = himmuService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _himmuService.getOSGiServiceIdentifier();
	}

	@Override
	public HimmuService getWrappedService() {
		return _himmuService;
	}

	@Override
	public void setWrappedService(HimmuService himmuService) {
		_himmuService = himmuService;
	}

	private HimmuService _himmuService;

}