#Author: didier.email@Osorio.domain.com
@Login
Feature: New Tours
  As a Web User
  I want to use New Tours
  To log in the platform

  Scenario Outline: Autentication User
    Given Nairobi open the browser in the start session
    When She enters the username and the password
      | user   | password   |
      | <user> | <password> |
    When She press the Submit button
    Then She should enter <Message>

    Examples: 
      | user    | password | Message         |
      | Zeus123 | Zeus123  | Enter correctly |
      | Didier  | Sophos   | No Login        |
#Underscore:that susan wants...
#CamelCase:ThatSusanWantsTo...
