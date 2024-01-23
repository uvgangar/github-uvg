package com.marsRover.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.marsRover.tasks.Rover;

public class stepDefinitions {
    Rover rover;

    @Given("Rover's position at initialisation point")
    public void roverSPositionAtInitialisationPoint() {
        rover = new Rover();
        rover.setPosition(5, 5, Rover.N);
        }

    @When("Rover's direction is facing coordinates")
    public void theRoverSDirectionIsFacingCoordinatesN() {
        rover.setPosition(1, 2, Rover.N);

    }

    @When("Rover's moving to {int} {int} {string} {string}")
    public void rover_s_moving_to(Integer int1, Integer int2, String  facing, String movingDir) {

        switch (facing) {
            case "N":
                rover.setPosition(int1,int2, Rover.N);
            break;
            case "E":
                rover.setPosition(int1,int2, Rover.E);
                break;
            case "S":
                rover.setPosition(int1,int2, Rover.S);
                break;
            case "W":
                rover.setPosition(int1,int2, Rover.W);
                break;
        }
        rover.process(movingDir);
    }


    @Then("Rover's position will be")
    public void roverSPositionWillBeE() {
        rover.printPosition(); // prints 5 1 E
    }
}
