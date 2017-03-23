'''
Created on Oct 22, 2016

@author: yr68
'''
from selenium import webdriver
from selenium.webdriver.support.ui import Select

chromedriver = "E:/QA/jars/chromedriver.exe"
driver = webdriver.Chrome(chromedriver)
driver.get("http://gmail.com")
driver.find_element_by_id("Email").send_keys("yuvatheja")
driver.find_element_by_id("Email").clear()
driver.find_element_by_id("Email").send_keys("yuva")
driver.implicitly_wait(4) #wait time 

#dropdown = Select(driver.find_element_by_xpath("xpath"))
#dropdown.select_by_index(4)
print(driver.find_element_by_xpath("xpath").text)
print(driver.find_element_by_xpath("parentxpath/child_tagname").text)
radio= driver.find_element_by_id("id")
if radio.is_selected():
    print ("true")
else :
    print ("false")






