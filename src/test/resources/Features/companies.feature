@tag
Feature: Companies functionality

  @tag1
  Scenario Outline: Create company and verify
    Given User opens browser
    And User logged in to the site
    When Using "<cName>" and "<cWeb>" and "<Address>" and "<City>" and "<State>" and "<Zip>" user create company

    Examples: 
      | cName       | cWeb        | Address | City      | State     | Zip    |
      | GNR Company | www.gnr.com | Road 15 | Hyderabad | Telangana | 500035 |
