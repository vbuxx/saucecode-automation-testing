Feature: Payment saucedemo

  Scenario: Success checkout
    Given Halaman login saucedemo1
    When Input username1
    And Input password1
    And Click login button1
    And User in on dashboard page1
    And User klik add to cart1
    And User klik cart increment1
    Then User in payment cart1
    And User klik button chekout
    Then User in checkout information
    And User Input firstname
    And User Input lastname
    And User Input postalcode
    Then User klik button continue
    Then User in overview checkout
    Then User klik finish
    Then User on page success checkout

