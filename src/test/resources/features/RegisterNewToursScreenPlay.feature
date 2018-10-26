#Author: didier.email@Osorio.domain.com.co
@Register
Feature: New Tours Register
  As a Web User
  I want to use New Tours
  To register in the platform

  Scenario Outline: Autentication User
    Given Nairobi open the browser in the register session
    When She enters the dates for the register
      | firstname   | lastname   | phone   | email   | address   | addres2   | city   | state   | postalcode   | country   | username   | password   | confirmpassword   |
      | <firstname> | <lastname> | <phone> | <email> | <address> | <addres2> | <city> | <state> | <postalcode> | <country> | <username> | <password> | <confirmpassword> |
    When She should press the Submit Button.
    Then she should be registered

    Examples: 
      | firstname | lastname | phone   | email              | address      | addres2         | city     | state     | postalcode | country | username  | password  | confirmpassword |
      | Raquel    | Beltran  | 8472881 | Raquel34@gmail.com | Llano Grande | Cll12Sur34Num45 | Medellin | Antioquia |       0560 |      42 | Raquel123 | Raquel123 | Raquel123       |
#Underscore:that susan wants...
#CamelCase:ThatSusanWantsTo...
