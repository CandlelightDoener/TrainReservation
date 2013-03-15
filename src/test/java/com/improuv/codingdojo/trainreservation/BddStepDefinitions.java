package com.improuv.codingdojo.trainreservation;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Defining the steps from our Cucumber feature files.
 * The tests which are defined in the feature files are run using {@link BddTest}.
 */
public class BddStepDefinitions {

    @Given("^there is a counter$")
    public void there_is_a_counter() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Given("^they know about a train called \"([^\"]*)\"$")
    public void they_know_about_a_train_called(String knownTrainName) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I make a reservation for (\\d+) persons in the train \"([^\"]*)\"$")
    public void I_make_a_reservation_for_persons_in_the_train(int numberOfPeople, String trainName) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I get the following reservation receipt$")
    public void I_get_the_following_reservation_receipt(String receipt) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

}
