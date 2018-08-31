#Author: your.email@your.domain.com
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given The user want to Login Demoqa page
    
    When The user have to enter Login Details
    	| Hemavi | Konakala | Belgium | 8 | 29 | 1989 | 7893526544 | Hemavi | Hemavi@gmail.com | Abt Yourself | 123abc | 123abc |
    			
    
    Then The user want to verify entered values
    
 @tag2
 Scenario: Title of my scenario
 	  Given The user want to Login page
    When The user have to enter Login Credentials
 			|fname|Hemavi|
 			|lname|Konakala|
 			|country|Belgium|
 			|month|8|
 			|date|29|
 			|year|1989|
 			|phone|7893526544|
 			|username|Hemavi|
 			|email|Hemavi@gmail.com|
 			|Abt|Abt Yourself|
 			|pass|123abc|
 			|cpwd|123abc|
 		Then The user want to verify entered credentials	
 			
 
