Feature: Add two roman numerals
  Scenario: Add two simple roman numerals
    Given I have a roman calculator
    When I add "I" and "I"
    Then I expect "II"

  Scenario: Add two more simple roman numerals
    Given I have a roman calculator
    When I add "II" and "I"
    Then I expect "III"

  Scenario: Add two complicated Roman numerals
    Given I have a roman calculator
    When I add "IV" and "IV"
    Then I expect "VIII"

  Scenario: Add two Roman numerals with subtractive result
    Given I have a roman calculator
    When I add "III" and "VI"
    Then I expect "IX"

  # Scenario: Gracefully handle when a non-Roman numeral is entered