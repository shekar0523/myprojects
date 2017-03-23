*** Settings ***
Documentation  This is basic info about suite
Library  Selenium2Library


*** Variables ***
${variable1}  hello world
${variable2}  1234


*** Test Cases ***
user must sign in to checkout
    [Documentation]  this is info about testcase
    [Tags]  Smoke
    open browser  http://www.amazon.com  gc
    sleep  3s
    wait until page contains  Your Amazon.com
    input text  id=twotabsearchtextbox  Ferrari 458
    click button  xpath=//*[@id="nav-search"]/form/div[2]/div/input
    wait until page contains  results for "Ferrari 458"
    click link   xpath=.//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/a
    wait until page contains  Back to search results
    click button  id=add-to-cart-button
    wait until page contains  Added to Cart
    click link  Proceed to checkout (1 item)
    wait until page contains  Sign in
    log  ${variable1}

    close browser




*** Keywords ***