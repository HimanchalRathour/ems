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

package com.adjecti.user.model.impl;

import com.adjecti.user.model.Himmu;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Himmu in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HimmuCacheModel implements CacheModel<Himmu>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HimmuCacheModel)) {
			return false;
		}

		HimmuCacheModel himmuCacheModel = (HimmuCacheModel)object;

		if (himmuId == himmuCacheModel.himmuId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, himmuId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", himmuId=");
		sb.append(himmuId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", dateOfbirth=");
		sb.append(dateOfbirth);
		sb.append(", contactNumber=");
		sb.append(contactNumber);
		sb.append(", email=");
		sb.append(email);
		sb.append(", streetAddress=");
		sb.append(streetAddress);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append(", country=");
		sb.append(country);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Himmu toEntityModel() {
		HimmuImpl himmuImpl = new HimmuImpl();

		if (uuid == null) {
			himmuImpl.setUuid("");
		}
		else {
			himmuImpl.setUuid(uuid);
		}

		himmuImpl.setHimmuId(himmuId);
		himmuImpl.setGroupId(groupId);
		himmuImpl.setCompanyId(companyId);
		himmuImpl.setUserId(userId);

		if (userName == null) {
			himmuImpl.setUserName("");
		}
		else {
			himmuImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			himmuImpl.setCreateDate(null);
		}
		else {
			himmuImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			himmuImpl.setModifiedDate(null);
		}
		else {
			himmuImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			himmuImpl.setFirstName("");
		}
		else {
			himmuImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			himmuImpl.setLastName("");
		}
		else {
			himmuImpl.setLastName(lastName);
		}

		if (dateOfbirth == null) {
			himmuImpl.setDateOfbirth("");
		}
		else {
			himmuImpl.setDateOfbirth(dateOfbirth);
		}

		if (contactNumber == null) {
			himmuImpl.setContactNumber("");
		}
		else {
			himmuImpl.setContactNumber(contactNumber);
		}

		if (email == null) {
			himmuImpl.setEmail("");
		}
		else {
			himmuImpl.setEmail(email);
		}

		if (streetAddress == null) {
			himmuImpl.setStreetAddress("");
		}
		else {
			himmuImpl.setStreetAddress(streetAddress);
		}

		if (city == null) {
			himmuImpl.setCity("");
		}
		else {
			himmuImpl.setCity(city);
		}

		if (state == null) {
			himmuImpl.setState("");
		}
		else {
			himmuImpl.setState(state);
		}

		if (zipCode == null) {
			himmuImpl.setZipCode("");
		}
		else {
			himmuImpl.setZipCode(zipCode);
		}

		if (country == null) {
			himmuImpl.setCountry("");
		}
		else {
			himmuImpl.setCountry(country);
		}

		himmuImpl.resetOriginalValues();

		return himmuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		himmuId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		dateOfbirth = objectInput.readUTF();
		contactNumber = objectInput.readUTF();
		email = objectInput.readUTF();
		streetAddress = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		zipCode = objectInput.readUTF();
		country = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(himmuId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (dateOfbirth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dateOfbirth);
		}

		if (contactNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactNumber);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (streetAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(streetAddress);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (zipCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zipCode);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}
	}

	public String uuid;
	public long himmuId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public String dateOfbirth;
	public String contactNumber;
	public String email;
	public String streetAddress;
	public String city;
	public String state;
	public String zipCode;
	public String country;

}