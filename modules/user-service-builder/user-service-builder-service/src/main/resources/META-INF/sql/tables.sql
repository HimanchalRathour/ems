create table Himmu_Himmu (
	uuid_ VARCHAR(75) null,
	himmuId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	dateOfbirth VARCHAR(75) null,
	contactNumber VARCHAR(75) null,
	email VARCHAR(75) null,
	streetAddress VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	zipCode VARCHAR(75) null,
	country VARCHAR(75) null
);