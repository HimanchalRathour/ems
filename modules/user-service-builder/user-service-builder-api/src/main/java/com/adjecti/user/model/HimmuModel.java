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

package com.adjecti.user.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Himmu service. Represents a row in the &quot;Himmu_Himmu&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.adjecti.user.model.impl.HimmuModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.adjecti.user.model.impl.HimmuImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Himmu
 * @generated
 */
@ProviderType
public interface HimmuModel
	extends BaseModel<Himmu>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a himmu model instance should use the {@link Himmu} interface instead.
	 */

	/**
	 * Returns the primary key of this himmu.
	 *
	 * @return the primary key of this himmu
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this himmu.
	 *
	 * @param primaryKey the primary key of this himmu
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this himmu.
	 *
	 * @return the uuid of this himmu
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this himmu.
	 *
	 * @param uuid the uuid of this himmu
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the himmu ID of this himmu.
	 *
	 * @return the himmu ID of this himmu
	 */
	public long getHimmuId();

	/**
	 * Sets the himmu ID of this himmu.
	 *
	 * @param himmuId the himmu ID of this himmu
	 */
	public void setHimmuId(long himmuId);

	/**
	 * Returns the group ID of this himmu.
	 *
	 * @return the group ID of this himmu
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this himmu.
	 *
	 * @param groupId the group ID of this himmu
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this himmu.
	 *
	 * @return the company ID of this himmu
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this himmu.
	 *
	 * @param companyId the company ID of this himmu
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this himmu.
	 *
	 * @return the user ID of this himmu
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this himmu.
	 *
	 * @param userId the user ID of this himmu
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this himmu.
	 *
	 * @return the user uuid of this himmu
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this himmu.
	 *
	 * @param userUuid the user uuid of this himmu
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this himmu.
	 *
	 * @return the user name of this himmu
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this himmu.
	 *
	 * @param userName the user name of this himmu
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this himmu.
	 *
	 * @return the create date of this himmu
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this himmu.
	 *
	 * @param createDate the create date of this himmu
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this himmu.
	 *
	 * @return the modified date of this himmu
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this himmu.
	 *
	 * @param modifiedDate the modified date of this himmu
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the first name of this himmu.
	 *
	 * @return the first name of this himmu
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this himmu.
	 *
	 * @param firstName the first name of this himmu
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this himmu.
	 *
	 * @return the last name of this himmu
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this himmu.
	 *
	 * @param lastName the last name of this himmu
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the date ofbirth of this himmu.
	 *
	 * @return the date ofbirth of this himmu
	 */
	@AutoEscape
	public String getDateOfbirth();

	/**
	 * Sets the date ofbirth of this himmu.
	 *
	 * @param dateOfbirth the date ofbirth of this himmu
	 */
	public void setDateOfbirth(String dateOfbirth);

	/**
	 * Returns the contact number of this himmu.
	 *
	 * @return the contact number of this himmu
	 */
	@AutoEscape
	public String getContactNumber();

	/**
	 * Sets the contact number of this himmu.
	 *
	 * @param contactNumber the contact number of this himmu
	 */
	public void setContactNumber(String contactNumber);

	/**
	 * Returns the email of this himmu.
	 *
	 * @return the email of this himmu
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this himmu.
	 *
	 * @param email the email of this himmu
	 */
	public void setEmail(String email);

	/**
	 * Returns the street address of this himmu.
	 *
	 * @return the street address of this himmu
	 */
	@AutoEscape
	public String getStreetAddress();

	/**
	 * Sets the street address of this himmu.
	 *
	 * @param streetAddress the street address of this himmu
	 */
	public void setStreetAddress(String streetAddress);

	/**
	 * Returns the city of this himmu.
	 *
	 * @return the city of this himmu
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this himmu.
	 *
	 * @param city the city of this himmu
	 */
	public void setCity(String city);

	/**
	 * Returns the state of this himmu.
	 *
	 * @return the state of this himmu
	 */
	@AutoEscape
	public String getState();

	/**
	 * Sets the state of this himmu.
	 *
	 * @param state the state of this himmu
	 */
	public void setState(String state);

	/**
	 * Returns the zip code of this himmu.
	 *
	 * @return the zip code of this himmu
	 */
	@AutoEscape
	public String getZipCode();

	/**
	 * Sets the zip code of this himmu.
	 *
	 * @param zipCode the zip code of this himmu
	 */
	public void setZipCode(String zipCode);

	/**
	 * Returns the country of this himmu.
	 *
	 * @return the country of this himmu
	 */
	@AutoEscape
	public String getCountry();

	/**
	 * Sets the country of this himmu.
	 *
	 * @param country the country of this himmu
	 */
	public void setCountry(String country);

	@Override
	public Himmu cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}