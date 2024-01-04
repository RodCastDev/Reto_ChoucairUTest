#Author: Rodrigo Castiblanco Pardo

@Test
Feature: UTest Challenge
  I want to test on the UTest page to validate the correct functioning of a new user's login.

  Scenario Outline: As a new user I would like to register on the UTest website to have my account enabled.
    Given i go to the UTest site
    And select Join Today
    When fill out the form about me
      | name | lastName | email      | month    | day | year |
      | Juan | Leon     | <strEmail> | November | 25  | 1999 |
    And fill out the form about my address
      | city   | zip    | country  |
      | Bogota | 123456 | Colombia |
    And fill out the form about my devices
      | computer | version    | language | brand | model  | system   |
      | Windows  | Windows 10 | English  | Apple | iPhone | iOS 14.8 |
    And complete the form with a new password
      | password     |
      | 03012Gold52# |
    Then validate the successful creation of the account with the <title>
    Examples:
      | strEmail                | title                                                                   |
      | JuaLen023Luis@gmail.com | Welcome to the world's largest community of freelance software testers! |
      | JuaLen054Luis@gmail.com | Welcome to the world's largest community of freelance software testers! |