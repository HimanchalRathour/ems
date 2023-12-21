create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_61F14392 on employeeDetails (email[$COLUMN_LENGTH:75$]);
create index IX_DF0E1EE on employeeDetails (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_54850BF0 on employeeDetails (uuid_[$COLUMN_LENGTH:75$], groupId);