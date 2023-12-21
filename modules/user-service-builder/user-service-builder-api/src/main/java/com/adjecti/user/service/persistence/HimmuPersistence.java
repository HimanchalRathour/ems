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

import com.adjecti.user.exception.NoSuchHimmuException;
import com.adjecti.user.model.Himmu;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the himmu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HimmuUtil
 * @generated
 */
@ProviderType
public interface HimmuPersistence extends BasePersistence<Himmu> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HimmuUtil} to access the himmu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the himmus where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching himmus
	 */
	public java.util.List<Himmu> findByUuid(String uuid);

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
	public java.util.List<Himmu> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Himmu> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

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
	public java.util.List<Himmu> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first himmu in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public Himmu findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Himmu>
				orderByComparator)
		throws NoSuchHimmuException;

	/**
	 * Returns the first himmu in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public Himmu fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

	/**
	 * Returns the last himmu in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public Himmu findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Himmu>
				orderByComparator)
		throws NoSuchHimmuException;

	/**
	 * Returns the last himmu in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public Himmu fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

	/**
	 * Returns the himmus before and after the current himmu in the ordered set where uuid = &#63;.
	 *
	 * @param himmuId the primary key of the current himmu
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next himmu
	 * @throws NoSuchHimmuException if a himmu with the primary key could not be found
	 */
	public Himmu[] findByUuid_PrevAndNext(
			long himmuId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Himmu>
				orderByComparator)
		throws NoSuchHimmuException;

	/**
	 * Removes all the himmus where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of himmus where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching himmus
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the himmu where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHimmuException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public Himmu findByUUID_G(String uuid, long groupId)
		throws NoSuchHimmuException;

	/**
	 * Returns the himmu where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public Himmu fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the himmu where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public Himmu fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the himmu where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the himmu that was removed
	 */
	public Himmu removeByUUID_G(String uuid, long groupId)
		throws NoSuchHimmuException;

	/**
	 * Returns the number of himmus where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching himmus
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the himmus where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching himmus
	 */
	public java.util.List<Himmu> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Himmu> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Himmu> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

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
	public java.util.List<Himmu> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first himmu in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public Himmu findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Himmu>
				orderByComparator)
		throws NoSuchHimmuException;

	/**
	 * Returns the first himmu in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public Himmu fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

	/**
	 * Returns the last himmu in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public Himmu findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Himmu>
				orderByComparator)
		throws NoSuchHimmuException;

	/**
	 * Returns the last himmu in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public Himmu fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

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
	public Himmu[] findByUuid_C_PrevAndNext(
			long himmuId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Himmu>
				orderByComparator)
		throws NoSuchHimmuException;

	/**
	 * Removes all the himmus where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of himmus where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching himmus
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the himmus where email = &#63;.
	 *
	 * @param email the email
	 * @return the matching himmus
	 */
	public java.util.List<Himmu> findByemail(String email);

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
	public java.util.List<Himmu> findByemail(String email, int start, int end);

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
	public java.util.List<Himmu> findByemail(
		String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

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
	public java.util.List<Himmu> findByemail(
		String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first himmu in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public Himmu findByemail_First(
			String email,
			com.liferay.portal.kernel.util.OrderByComparator<Himmu>
				orderByComparator)
		throws NoSuchHimmuException;

	/**
	 * Returns the first himmu in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public Himmu fetchByemail_First(
		String email,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

	/**
	 * Returns the last himmu in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu
	 * @throws NoSuchHimmuException if a matching himmu could not be found
	 */
	public Himmu findByemail_Last(
			String email,
			com.liferay.portal.kernel.util.OrderByComparator<Himmu>
				orderByComparator)
		throws NoSuchHimmuException;

	/**
	 * Returns the last himmu in the ordered set where email = &#63;.
	 *
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himmu, or <code>null</code> if a matching himmu could not be found
	 */
	public Himmu fetchByemail_Last(
		String email,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

	/**
	 * Returns the himmus before and after the current himmu in the ordered set where email = &#63;.
	 *
	 * @param himmuId the primary key of the current himmu
	 * @param email the email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next himmu
	 * @throws NoSuchHimmuException if a himmu with the primary key could not be found
	 */
	public Himmu[] findByemail_PrevAndNext(
			long himmuId, String email,
			com.liferay.portal.kernel.util.OrderByComparator<Himmu>
				orderByComparator)
		throws NoSuchHimmuException;

	/**
	 * Removes all the himmus where email = &#63; from the database.
	 *
	 * @param email the email
	 */
	public void removeByemail(String email);

	/**
	 * Returns the number of himmus where email = &#63;.
	 *
	 * @param email the email
	 * @return the number of matching himmus
	 */
	public int countByemail(String email);

	/**
	 * Caches the himmu in the entity cache if it is enabled.
	 *
	 * @param himmu the himmu
	 */
	public void cacheResult(Himmu himmu);

	/**
	 * Caches the himmus in the entity cache if it is enabled.
	 *
	 * @param himmus the himmus
	 */
	public void cacheResult(java.util.List<Himmu> himmus);

	/**
	 * Creates a new himmu with the primary key. Does not add the himmu to the database.
	 *
	 * @param himmuId the primary key for the new himmu
	 * @return the new himmu
	 */
	public Himmu create(long himmuId);

	/**
	 * Removes the himmu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param himmuId the primary key of the himmu
	 * @return the himmu that was removed
	 * @throws NoSuchHimmuException if a himmu with the primary key could not be found
	 */
	public Himmu remove(long himmuId) throws NoSuchHimmuException;

	public Himmu updateImpl(Himmu himmu);

	/**
	 * Returns the himmu with the primary key or throws a <code>NoSuchHimmuException</code> if it could not be found.
	 *
	 * @param himmuId the primary key of the himmu
	 * @return the himmu
	 * @throws NoSuchHimmuException if a himmu with the primary key could not be found
	 */
	public Himmu findByPrimaryKey(long himmuId) throws NoSuchHimmuException;

	/**
	 * Returns the himmu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param himmuId the primary key of the himmu
	 * @return the himmu, or <code>null</code> if a himmu with the primary key could not be found
	 */
	public Himmu fetchByPrimaryKey(long himmuId);

	/**
	 * Returns all the himmus.
	 *
	 * @return the himmus
	 */
	public java.util.List<Himmu> findAll();

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
	public java.util.List<Himmu> findAll(int start, int end);

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
	public java.util.List<Himmu> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator);

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
	public java.util.List<Himmu> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himmu>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the himmus from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of himmus.
	 *
	 * @return the number of himmus
	 */
	public int countAll();

}