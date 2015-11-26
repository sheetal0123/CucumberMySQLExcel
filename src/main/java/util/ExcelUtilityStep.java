package util;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ExcelUtilityStep {
	
	 @Given("^I am connected to database using \"([^\"]*)\" and password \"([^\"]*)\"$")
     public void ConnectToDatabase(String username, String password) {                     
		 DBUtilities.getConnection(username, password); 
     }
          
     @Then("^I logged in database \"([^\"]*)\" and connected to table \"([^\"]*)\"$")
     public void FetchDataAndWriteIntoExcel(String db,String table){
    	 DBUtilities.getDataAndWriteExcel(db, table);
     }

}
