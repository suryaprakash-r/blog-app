package com.example.blog.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ContactFormSteps {

    @Given("I open the contact page")
    public void i_open_the_contact_page() {
        System.out.println("Opening the contact page...");
    }

    @When("I fill in the form")
    public void i_fill_in_the_form() {
        System.out.println("Filling in the contact form...");
    }

    @When("I click submit")
    public void i_click_submit() {
        System.out.println("Clicking submit button...");
    }

    @Then("I see a success message")
    public void i_see_a_success_message() {
        System.out.println("Success message displayed.");
    }
}
