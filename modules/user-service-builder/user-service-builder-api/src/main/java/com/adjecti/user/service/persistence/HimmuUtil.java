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

package com.adjecti.user.service.persistence;

import com.adjecti.user.model.Himmu;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the himmu service. This utility wraps <code>com.adjecti.user.service.persistence.impl.HimmuPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HimmuPersistence
 * @generated
 */
public class HimmuUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Himmu himmu) {
		getPersistence().clearCache(himmu);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Himmu> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Himmu> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Himmu> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Himmu> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Himmu update(Himmu himmu) {
		return getPersistence().update(himmu);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Himmu update(Himmu himmu, ServiceContext serviceContext) {
		return getPersistence().update(himmu, serviceContext);
	}

	/**
	 * Returns all the himmus where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching himmus
	 */
	public static List<Himmu> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the himmus where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @return the range of matching himmus
	 */
	public static List<Himmu> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the himmus where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching himmus
	 */
	public static List<Himmu> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the himmus where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching himmus
	 */
	public static List<Himmu> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Himmu> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first himmu in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public static Himmu findByUuid_First(
			String uuid, OrderByComparator<Himmu> orderByComparator)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first himmu in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public static Himmu fetchByUuid_First(
		String uuid, OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last himmu in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public static Himmu findByUuid_Last(
			String uuid, OrderByComparator<Himmu> orderByComparator)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last himmu in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public static Himmu fetchByUuid_Last(
		String uuid, OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the himmus before and after the current himmu in the ordered set where uuid = &#63;.
	 *
	 * @param himmuId the primary key of the current himmu
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next himmu
	 * @throws NoSuchHimmuException if a himmu with the primary key could not be found
	 */
	public static Himmu[] findByUuid_PrevAndNext(
			long himmuId, String uuid,
			OrderByComparator<Himmu> orderByComparator)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByUuid_PrevAndNext(
			himmuId, uuid, orderByComparator);
	}

	/**
	 * Removes all the himmus where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of himmus where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching himmus
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the himmu where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHimmuException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public static Himmu findByUUID_G(String uuid, long groupId)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the himmu where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public static Himmu fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the himmu where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public static Himmu fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the himmu where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the himmu that was removed
	 */
	public static Himmu removeByUUID_G(String uuid, long groupId)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of himmus where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching himmus
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the himmus where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching himmus
	 */
	public static List<Himmu> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the himmus where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @return the range of matching himmus
	 */
	public static List<Himmu> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the himmus where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching himmus
	 */
	public static List<Himmu> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the himmus where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching himmus
	 */
	public static List<Himmu> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Himmu> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first himmu in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public static Himmu findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Himmu> orderByComparator)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first himmu in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public static Himmu fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last himmu in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public static Himmu findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Himmu> orderByComparator)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last himmu in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public static Himmu fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the himmus before and after the current himmu in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param himmuId the primary key of the current himmu
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next himmu
	 * @throws NoSuchHimmuException if a himmu with the primary key could not be found
	 */
	public static Himmu[] findByUuid_C_PrevAndNext(
			long himmuId, String uuid, long companyId,
			OrderByComparator<Himmu> orderByComparator)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByUuid_C_PrevAndNext(
			himmuId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the himmus where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of himmus where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching himmus
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the himmus where email = &#63;.
	 *
	 * @param email the email
	 * @return the matching himmus
	 */
	public static List<Himmu> findByemail(String email) {
		return getPersistence().findByemail(email);
	}

	/**
	 * Returns a range of all the himmus where email = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param email the email
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @return the range of matching himmus
	 */
	public static List<Himmu> findByemail(String email, int start, int end) {
		return getPersistence().findByemail(email, start, end);
	}

	/**
	 * Returns an ordered range of all the himmus where email = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param email the email
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching himmus
	 */
	public static List<Himmu> findByemail(
		String email, int start, int end,
		OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().findByemail(
			email, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the himmus where email = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param email the email
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching himmus
	 */
	public static List<Himmu> findByemail(
		String email, int start, int end,
		OrderByComparator<Himmu> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByemail(
			email, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first himmu in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public static Himmu findByemail_First(
			String email, OrderByComparator<Himmu> orderByComparator)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByemail_First(email, orderByComparator);
	}

	/**
	 * Returns the first himmu in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public static Himmu fetchByemail_First(
		String email, OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().fetchByemail_First(email, orderByComparator);
	}

	/**
	 * Returns the last himmu in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public static Himmu findByemail_Last(
			String email, OrderByComparator<Himmu> orderByComparator)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByemail_Last(email, orderByComparator);
	}

	/**
	 * Returns the last himmu in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public static Himmu fetchByemail_Last(
		String email, OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().fetchByemail_Last(email, orderByComparator);
	}

	/**
	 * Returns the himmus before and after the current himmu in the ordered set where email = &#63;.
	 *
	 * @param himmuId the primary key of the current himmu
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next himmu
	 * @throws NoSuchHimmuException if a himmu with the primary key could not be found
	 */
	public static Himmu[] findByemail_PrevAndNext(
			long himmuId, String email,
			OrderByComparator<Himmu> orderByComparator)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByemail_PrevAndNext(
			himmuId, email, orderByComparator);
	}

	/**
	 * Removes all the himmus where email = &#63; from the database.
	 *
	 * @param email the email
	 */
	public static void removeByemail(String email) {
		getPersistence().removeByemail(email);
	}

	/**
	 * Returns the number of himmus where email = &#63;.
	 *
	 * @param email the email
	 * @return the number of matching himmus
	 */
	public static int countByemail(String email) {
		return getPersistence().countByemail(email);
	}

	/**
	 * Caches the himmu in the entity cache if it is enabled.
	 *
	 * @param himmu the himmu
	 */
	public static void cacheResult(Himmu himmu) {
		getPersistence().cacheResult(himmu);
	}

	/**
	 * Caches the himmus in the entity cache if it is enabled.
	 *
	 * @param himmus the himmus
	 */
	public static void cacheResult(List<Himmu> himmus) {
		getPersistence().cacheResult(himmus);
	}

	/**
	 * Creates a new himmu with the primary key. Does not add the himmu to the database.
	 *
	 * @param himmuId the primary key for the new himmu
	 * @return the new himmu
	 */
	public static Himmu create(long himmuId) {
		return getPersistence().create(himmuId);
	}

	/**
	 * Removes the himmu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param himmuId the primary key of the himmu
	 * @return the himmu that was removed
	 * @throws NoSuchHimmuException if a himmu with the primary key could not be found
	 */
	public static Himmu remove(long himmuId)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().remove(himmuId);
	}

	public static Himmu updateImpl(Himmu himmu) {
		return getPersistence().updateImpl(himmu);
	}

	/**
	 * Returns the himmu with the primary key or throws a <code>NoSuchHimmuException</code> if it could not be found.
	 *
	 * @param himmuId the primary key of the himmu
	 * @return the himmu
	 * @throws NoSuchHimmuException if a himmu with the primary key could not be found
	 */
	public static Himmu findByPrimaryKey(long himmuId)
		throws com.adjecti.user.exception.NoSuchHimmuException {

		return getPersistence().findByPrimaryKey(himmuId);
	}

	/**
	 * Returns the himmu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param himmuId the primary key of the himmu
	 * @return the himmu, or <code>null</code> if a himmu with the primary key could not be found
	 */
	public static Himmu fetchByPrimaryKey(long himmuId) {
		return getPersistence().fetchByPrimaryKey(himmuId);
	}

	/**
	 * Returns all the himmus.
	 *
	 * @return the himmus
	 */
	public static List<Himmu> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the himmus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @return the range of himmus
	 */
	public static List<Himmu> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the himmus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of himmus
	 */
	public static List<Himmu> findAll(
		int start, int end, OrderByComparator<Himmu> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the himmus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HimmuModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of himmus
	 * @param end the upper bound of the range of himmus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of himmus
	 */
	public static List<Himmu> findAll(
		int start, int end, OrderByComparator<Himmu> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the himmus from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of himmus.
	 *
	 * @return the number of himmus
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HimmuPersistence getPersistence() {
		return _persistence;
	}

	private static volatile HimmuPersistence _persistence;

}