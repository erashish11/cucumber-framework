package stepdefinations;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  {

    @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }

    @After
    public void afterScenario(){

    }
}