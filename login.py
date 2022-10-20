#! /usr/bin/python3
from time import sleep
from selenium import webdriver
browser = webdriver.Firefox()  #calling the firefox driver  (installed from gitub)


browser.get('http://192.168.1.1:8090/') #opens the browser and also open the given link

username_input = browser.find_element_by_css_selector("input[name='username']")  #giving the css_selector path of the username text box(or where user needs to provide input)
password_input = browser.find_element_by_css_selector("input[name='password']")  # css_selector path of the password
#username_input.send_keys("4al20ec027")					    #this will type the username and password
username_input.send_keys("4al20ec029")
#password_input.send_keys("Newpassword3#")
password_input.send_keys("Alvas@12345")
login_button = browser.find_element_by_xpath('//*[@id="loginbutton"]')		#giving the xpath if the login button
login_button.click()									#clicks the login button
browser.close()									#closes the browser
#browser=webdriver.Firefox()							#can open the browser for another session							
#browser.get('https://www.youtube.com/')

#Author-Nagarjuna GS

