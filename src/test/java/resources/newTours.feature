Feature: new tours
  Scenario:  User should be able to Register successfully
    Given user is on homepage
    When selects Register
    And enters all the required registration information
    And selects submit
    Then user should successfully register

    Scenario: User should be able to view Cruise itinerary
      Given user is on homepage
      When user selects Cruises
      Then user should be  able to view CRUISE SPECIAL page

