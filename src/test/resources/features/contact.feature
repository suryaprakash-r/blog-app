Feature: Contact Form
  Scenario: User submits the contact form
    Given I open the contact page
    When I fill in the form
    And I click submit
    Then I see a success message
