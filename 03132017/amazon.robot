*** Settings ***
Documentation  This is basic info about suite
Library  Selenium2Library


*** Variables ***



*** Test Cases ***
user must sign in to checkout
    [Documentation]  this is info about testcase
    [Tags]  Smoke
    open browser  http://www.amazon.com  gc
    close browser




*** Keywords ***
