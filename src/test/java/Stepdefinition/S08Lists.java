package Stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class S08Lists {

	@Given("Open Registration page")
	public void open_registration_page() {


		System.out.println("Open Registration page");
	}

	@When("Enter the following table data")
	public void enter_the_following_table_data(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> data=dataTable.asLists();

		System.out.println(data);



	}

	@Then("Registration should happen")
	public void registration_should_happen() {

		System.out.println("Registration happened");

	}

	@When("Enter the following datas of the table")
	public void enter_the_following_datas_of_the_table(io.cucumber.datatable.DataTable dataTable) {
	
		List<Map<String,String>> data=dataTable.asMaps();
		
		System.out.println(data);
		
	}

	@Then("Registration must happen")
	public void registration_must_happen() {
		
		System.out.println("Registration happened");
		
	}

}
