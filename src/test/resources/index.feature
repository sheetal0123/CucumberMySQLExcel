Feature: Read data from MySQL DB and write into excel

@executeThis
Scenario: exporting data into excel
	Given I am connected to database using "root" and password "xebia@123"
	Then I logged in database "xebia" and connected to table "demotable"
