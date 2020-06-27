Feature: test

  Scenario Outline: test Orange
    Given Login to url "https://opensource-demo.orangehrmlive.com/"
    When enter the "<username>" and "<password>"
      
    And click login
    Then conform the login page

   Examples:
			|username|password|
      | Admin | admin123 |
			
    