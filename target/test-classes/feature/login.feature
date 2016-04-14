Feature:As a customer, I would like to login and use the aplication

  Scenario: go to login page
    Given I am on the homepage of the website
    When I select the login button
    Then I am on the login page

  Scenario: valid login
    Given I am on the login page
    When I enter valid credentials
    Then I am logged in
    And on my home page