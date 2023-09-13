Feature: Check Every Field in FaceBook

  Scenario: Check Login Field
    When user enter the username and password using 1D datatable with heading
      | username | vivek  |
      | password | v12345 |
    When click login button
    And navigate back to previous url

  Scenario: Check Forgot Field
    When click the forgotButton

  Scenario: Check the create page Field
    When click the create page button
    And choose the community
    Then back to login page

  Scenario: Check the Create Account Page Field
    When click the create new account button using
    Then user enter the firstname and surname using 2D datatable with heading
      | firstname | surname |
      | vivek     | v       |
    And user enter the email and password using 2D datatable
      | abc@gmail.com | a78945 |
    Then user enter the DOB and select gender
