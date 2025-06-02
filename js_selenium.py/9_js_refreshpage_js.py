from selenium.webdriver.common.by import By
from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://tutorialsninja.com/demo/")

time.sleep(3)

driver.execute_script("history.go(0)")

time.sleep(5)

driver.quit()