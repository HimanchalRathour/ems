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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Himmu}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Himmu
 * @generated
 */
public class HimmuWrapper
	extends BaseModelWrapper<Himmu> implements Himmu, ModelWrapper<Himmu> {

	public HimmuWrapper(Himmu himmu) {
		super(himmu);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("himmuId", getHimmuId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("dateOfbirth", getDateOfbirth());
		attributes.put("contactNumber", getContactNumber());
		attributes.put("email", getEmail());
		attributes.put("streetAddress", getStreetAddress());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("zipCode", getZipCode());
		attributes.put("country", getCountry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long himmuId = (Long)attributes.get("himmuId");

		if (himmuId != null) {
			setHimmuId(himmuId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String dateOfbirth = (String)attributes.get("dateOfbirth");

		if (dateOfbirth != null) {
			setDateOfbirth(dateOfbirth);
		}

		String contactNumber = (String)attributes.get("contactNumber");

		if (contactNumber != null) {
			setContactNumber(contactNumber);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String streetAddress = (String)attributes.get("streetAddress");

		if (streetAddress != null) {
			setStreetAddress(streetAddress);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String zipCode = (String)attributes.get("zipCode");

		if (zipCode != null) {
			setZipCode(zipCode);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}
	}

	@Override
	public Himmu cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the city of this himmu.
	 *
	 * @return the city of this himmu
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this himmu.
	 *
	 * @return the company ID of this himmu
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact number of this himmu.
	 *
	 * @return the contact number of this himmu
	 */
	@Override
	public String getContactNumber() {
		return model.getContactNumber();
	}

	/**
	 * Returns the country of this himmu.
	 *
	 * @return the country of this himmu
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this himmu.
	 *
	 * @return the create date of this himmu
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date ofbirth of this himmu.
	 *
	 * @return the date ofbirth of this himmu
	 */
	@Override
	public String getDateOfbirth() {
		return model.getDateOfbirth();
	}

	/**
	 * Returns the email of this himmu.
	 *
	 * @return the email of this himmu
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the first name of this himmu.
	 *
	 * @return the first name of this himmu
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this himmu.
	 *
	 * @return the group ID of this himmu
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the himmu ID of this himmu.
	 *
	 * @return the himmu ID of this himmu
	 */
	@Override
	public long getHimmuId() {
		return model.getHimmuId();
	}

	/**
	 * Returns the last name of this himmu.
	 *
	 * @return the last name of this himmu
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the modified date of this himmu.
	 *
	 * @return the modified date of this himmu
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this himmu.
	 *
	 * @return the primary key of this himmu
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the state of this himmu.
	 *
	 * @return the state of this himmu
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the street address of this himmu.
	 *
	 * @return the street address of this himmu
	 */
	@Override
	public String getStreetAddress() {
		return model.getStreetAddress();
	}

	/**
	 * Returns the user ID of this himmu.
	 *
	 * @return the user ID of this himmu
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this himmu.
	 *
	 * @return the user name of this himmu
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this himmu.
	 *
	 * @return the user uuid of this himmu
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this himmu.
	 *
	 * @return the uuid of this himmu
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the zip code of this himmu.
	 *
	 * @return the zip code of this himmu
	 */
	@Override
	public String getZipCode() {
		return model.getZipCode();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the city of this himmu.
	 *
	 * @param city the city of this himmu
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this himmu.
	 *
	 * @param companyId the company ID of this himmu
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact number of this himmu.
	 *
	 * @param contactNumber the contact number of this himmu
	 */
	@Override
	public void setContactNumber(String contactNumber) {
		model.setContactNumber(contactNumber);
	}

	/**
	 * Sets the country of this himmu.
	 *
	 * @param country the country of this himmu
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this himmu.
	 *
	 * @param createDate the create date of this himmu
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date ofbirth of this himmu.
	 *
	 * @param dateOfbirth the date ofbirth of this himmu
	 */
	@Override
	public void setDateOfbirth(String dateOfbirth) {
		model.setDateOfbirth(dateOfbirth);
	}

	/**
	 * Sets the email of this himmu.
	 *
	 * @param email the email of this himmu
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the first name of this himmu.
	 *
	 * @param firstName the first name of this himmu
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this himmu.
	 *
	 * @param groupId the group ID of this himmu
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the himmu ID of this himmu.
	 *
	 * @param himmuId the himmu ID of this himmu
	 */
	@Override
	public void setHimmuId(long himmuId) {
		model.setHimmuId(himmuId);
	}

	/**
	 * Sets the last name of this himmu.
	 *
	 * @param lastName the last name of this himmu
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the modified date of this himmu.
	 *
	 * @param modifiedDate the modified date of this himmu
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this himmu.
	 *
	 * @param primaryKey the primary key of this himmu
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the state of this himmu.
	 *
	 * @param state the state of this himmu
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the street address of this himmu.
	 *
	 * @param streetAddress the street address of this himmu
	 */
	@Override
	public void setStreetAddress(String streetAddress) {
		model.setStreetAddress(streetAddress);
	}

	/**
	 * Sets the user ID of this himmu.
	 *
	 * @param userId the user ID of this himmu
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this himmu.
	 *
	 * @param userName the user name of this himmu
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this himmu.
	 *
	 * @param userUuid the user uuid of this himmu
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this himmu.
	 *
	 * @param uuid the uuid of this himmu
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the zip code of this himmu.
	 *
	 * @param zipCode the zip code of this himmu
	 */
	@Override
	public void setZipCode(String zipCode) {
		model.setZipCode(zipCode);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected HimmuWrapper wrap(Himmu himmu) {
		return new HimmuWrapper(himmu);
	}

}