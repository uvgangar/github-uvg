Feature: Defining Rover's Position
  Description: According to the coordinates specified

  Scenario Outline: Rover's Location
    Given Rover's position at initialisation point
    Then  Rover's position will be
    When  Rover's direction is facing coordinates
    Then  Rover's position will be
    When  Rover's moving to <x> <y> "<f>" "<position>"
    Then  Rover's position will be
    Examples:
    |x|y|f|position  |
    |1|2|N|LMLMLMLMM |
    |3|3|E|MMRMMRMRRM|
