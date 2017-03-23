'''
Created on Oct 22, 2016

@author: yr68
'''
# open firefox and navigate to google
from selenium import webdriver
#driver=webdriver.Firefox()
#iebrowser="E:/QA/jars/IEDriverServer.exe"
#driver=webdriver.Ie(iebrowser)
chromedriver = "E:/QA/jars/chromedriver.exe"
driver = webdriver.Chrome(chromedriver)
driver.get("http://www.google.com")
#browser specific methods
print (driver.current_url)
print (driver.title)
driver.get("http://gmail.com")
print (driver.title)
driver.back()
print (driver.title)
driver.forward()
print (driver.title)
driver.refresh()
driver.maximize_window()
driver.get("http://www.facebook.com")
driver.find_element_by_name("firstname").send_keys("yuva")
#Xpath ".//tagname[@attribute='value']"
driver.find_element_by_xpath(".//input[@name='firstname']").send_keys("theja")
#CSS "tagname[attribute='value']"
driver.find_element_by_css_selector("input[name='lastname']").send_keys("simha")
driver.find_element_by_link_text("Forgot account?").click()


#driver.close() #current window closes
#driver.quit() #all the windows closes