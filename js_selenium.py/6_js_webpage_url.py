from selenium.webdriver.common.by import By
from selenium import webdriver
import time


driver = webdriver.Chrome()
driver.get("https://tutorialsninja.com/demo/")


page_url = driver.execute_script("return document.URL")
print(str(page_url))