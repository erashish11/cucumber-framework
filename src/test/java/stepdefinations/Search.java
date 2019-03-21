package stepdefinations;

import actions.search.SearchActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Search {

    SearchActions searchActions = new SearchActions();

    @Given("user has search text as {string}")
    public void user_has_search_text_as(String string) throws Exception {
        searchActions.openApplication("http://www.google.co.in").thenenterSearchText(string);
    }

    @When("user perform the search")
    public void user_perform_the_search() throws Exception {
        searchActions.performSearch();
    }

    @Then("relevant search result are displayed in the screen")
    public void relevant_search_result_are_displayed_in_the_screen() {

    }

}
