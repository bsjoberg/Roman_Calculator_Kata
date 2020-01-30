Feature: Add two roman numerals
  Scenario: Add two simple roman numerals
    Given I have a roman calculator
    When I add "I" and "I"
    Then I expect "II"