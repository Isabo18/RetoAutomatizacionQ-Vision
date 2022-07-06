Feature: Login SawgLabs Pages

  @LoginSuccessful
  Scenario: successful login scenario
    Given login to swaglabs page
    When correct username and password
      | user       | password        |
      | standard_user | secret_sauce |
    Then The entry to the page is successful and I can see the products section

  @LoginFailed
  Scenario: login failed
    Given login to swaglabs page
    When wrong username and password
      | user         | password        |
      | locked_out_user | secret_sauce |
    Then login must be failed showing message "Epic sadface: Sorry, this user has been locked out."

