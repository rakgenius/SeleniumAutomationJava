#!/usr/bin/python

from selenium import webdriver

driver = webdriver.Chrome()

driver.get("https://www.facebook.com")

driver.find_element_by_id("email").send_keys('')
driver.find_element_by_id("pass").send_keys("")
driver.find_element_by_id("loginbutton").click()

