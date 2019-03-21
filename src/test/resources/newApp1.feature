Feature: Should able to search on google search engine

  Scenario: user should allowed to perform a search
    Given user has search text as "UFT"
    When user perform the search
    Then relevant search result are displayed in the screen
