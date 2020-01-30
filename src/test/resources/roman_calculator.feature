Feature: Add two roman numerals
  Scenario: Add two simple roman numerals
    Given I have a roman calculator
    When I add "I" and "I"
    Then I expect "II"

#  Scenario: Add two more simple roman numerals
#    Given I have a roman calculator
#    When I add "II" and "I"
#    Then I expect "III"