Feature: Development environment is working
  Scenario: Hello World application says hi
    Given Hello World exists
    When I say hi
    Then I hear "Hello World!"