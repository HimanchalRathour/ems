create index IX_8BB5ABD on Himmu_Himmu (email[$COLUMN_LENGTH:75$]);
create index IX_659931E3 on Himmu_Himmu (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_527AD525 on Himmu_Himmu (uuid_[$COLUMN_LENGTH:75$], groupId);