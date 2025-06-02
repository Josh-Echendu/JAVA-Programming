from selenium import webdriver
import time

driver = webdriver.Chrome()

driver.get("https://www.whoscored.com/")

driver.execute_script("alert('Hello josh')")

time.sleep(5)

driver.execute_script("prompt('Enter your name')")

time.sleep(5)

driver.execute_script("confirm('Are you sure?')")

time.sleep(5)

driver.quit()
