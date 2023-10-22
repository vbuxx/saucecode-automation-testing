Feature: Login Page Saucedemo

  Scenario: Success Login
    Given Halaman login saucedemo
    When Input username
    And Input password
    And Click login button
    Then User in on dashboard page


  Scenario: Failed Logins with invalid password
    Given Halaman login saucedemo
    When Input username
    And Input Invalid password
    And Click login button
    Then User get error message

  Scenario: Failed Logins with invalid username
    Given Halaman login saucedemo
    When Input Invalid username
    And Input password
    And Click login button
    Then User get error message