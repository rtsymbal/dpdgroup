Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter a credentials for Login
      | UserName | Password  |
      | admin    | adminpass |
    And I click login button
    Then I should see the userform page

#  Scenario Template: Login with correct credentials
#    Given I navigate to the login page
#    And I enter a "<UserName>" and "<Password>"
#    And I click login button
#    Then I should see the userform page
#
#    Examples:
#      | UserName | Password   |
#      | admin1   | adminpass1 |
#      | admin2   | adminpass2 |
#      | admin3   | adminpass3 |

