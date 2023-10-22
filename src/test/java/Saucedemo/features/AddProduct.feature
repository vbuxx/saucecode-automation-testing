Feature: Shoping Product

  Scenario: Success add product
    Given Halaman login saucedemo_
    When Input username_
    And Input password_
    And Click login button_
    And User in on dashboard page_
    And User klik add to cart
    And User klik cart increment
    Then User in payment cart

  Scenario: Success delete product in cart
    Given Halaman login saucedemo_
    When Input username_
    And Input password_
    And Click login button_
    And User in on dashboard page_
    And User klik add to cart
    And User klik cart increment
    And User klik remove product
    Then User in payment cart


