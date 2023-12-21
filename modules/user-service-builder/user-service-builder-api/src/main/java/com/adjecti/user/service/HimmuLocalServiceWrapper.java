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
 * Provides a wrapper for {@link HimmuLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HimmuLocalService
 * @generated
 */
public class HimmuLocalServiceWrapper
	implements HimmuLocalService, ServiceWrapper<HimmuLocalService> {

	public HimmuLocalServiceWrapper() {
		this(null);
	}

	public HimmuLocalServiceWrapper(HimmuLocalService himmuLocalService) {
		_himmuLocalService = himmuLocalService;
	}

	/**
	 * Adds the himmu to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HimmuLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param himmu the himmu
	 * @return the himmu that was added
	 */
	@Override
	public com.adjecti.user.model.Himmu addHimmu(
		com.adjecti.user.model.Himmu himmu) {

		return _himmuLocalService.addHimmu(himmu);
	}

	/**
	 * Creates a new himmu with the primary key. Does not add the himmu to the database.
	 *
	 * @param himmuId the primary key for the new himmu
	 * @return the new himmu
	 */
	@Override
	public com.adjecti.user.model.Himmu createHimmu(long himmuId) {
		return _himmuLocalService.createHimmu(himmuId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _himmuLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the himmu from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HimmuLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param himmu the himmu
	 * @return the himmu that was removed
	 */
	@Override
	public com.adjecti.user.model.Himmu deleteHimmu(
		com.adjecti.user.model.Himmu himmu) {

		return _himmuLocalService.deleteHimmu(himmu);
	}

	/**
	 * Deletes the himmu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HimmuLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param himmuId the primary key of the himmu
	 * @return the himmu that was removed
	 * @throws PortalException if a himmu with the primary key could not be found
	 */
	@Override
	public com.adjecti.user.model.Himmu deleteHimmu(long himmuId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _himmuLocalService.deleteHimmu(himmuId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _himmuLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _himmuLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _himmuLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _himmuLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _himmuLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.user.model.impl.HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _himmuLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.user.model.impl.HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _himmuLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _himmuLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _himmuLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.adjecti.user.model.Himmu fetchHimmu(long himmuId) {
		return _himmuLocalService.fetchHimmu(himmuId);
	}

	/**
	 * Returns the himmu matching the UUID and group.
	 *
	 * @param uuid the himmu's UUID
	 * @param groupId the primary key of the group
	 * @return the matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	@Override
	public com.adjecti.user.model.Himmu fetchHimmuByUuidAndGroupId(
		String uuid, long groupId) {

		return _himmuLocalService.fetchHimmuByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _himmuLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _himmuLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the himmu with the primary key.
	 *
	 * @param himmuId the primary key of the himmu
	 * @return the himmu
	 * @throws PortalException if a himmu with the primary key could not be found
	 */
	@Override
	public com.adjecti.user.model.Himmu getHimmu(long himmuId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _himmuLocalService.getHimmu(himmuId);
	}

	/**
	 * Returns the himmu matching the UUID and group.
	 *
	 * @param uuid the himmu's UUID
	 * @param groupId the primary key of the group
	 * @return the matching himmu
	 * @throws PortalException if a matching himmu could not be found
	 */
	@Override
	public com.adjecti.user.model.Himmu getHimmuByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _himmuLocalService.getHimmuByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the himmus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.user.model.impl.HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @return the range of himmus
	 */
	@Override
	public java.util.List<com.adjecti.user.model.Himmu> getHimmus(
		int start, int end) {

		return _himmuLocalService.getHimmus(start, end);
	}

	/**
	 * Returns all the himmus matching the UUID and company.
	 *
	 * @param uuid the UUID of the himmus
	 * @param companyId the primary key of the company
	 * @return the matching himmus, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.user.model.Himmu>
		getHimmusByUuidAndCompanyId(String uuid, long companyId) {

		return _himmuLocalService.getHimmusByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of himmus matching the UUID and company.
	 *
	 * @param uuid the UUID of the himmus
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching himmus, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.user.model.Himmu>
		getHimmusByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.adjecti.user.model.Himmu> orderByComparator) {

		return _himmuLocalService.getHimmusByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of himmus.
	 *
	 * @return the number of himmus
	 */
	@Override
	public int getHimmusCount() {
		return _himmuLocalService.getHimmusCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _himmuLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _himmuLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _himmuLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the himmu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HimmuLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param himmu the himmu
	 * @return the himmu that was updated
	 */
	@Override
	public com.adjecti.user.model.Himmu updateHimmu(
		com.adjecti.user.model.Himmu himmu) {

		return _himmuLocalService.updateHimmu(himmu);
	}

	@Override
	public HimmuLocalService getWrappedService() {
		return _himmuLocalService;
	}

	@Override
	public void setWrappedService(HimmuLocalService himmuLocalService) {
		_himmuLocalService = himmuLocalService;
	}

	private HimmuLocalService _himmuLocalService;

}