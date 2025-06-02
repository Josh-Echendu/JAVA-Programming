from selenium.webdriver.common.by import By
from selenium import webdriver
import time


driver = webdriver.Chrome()
driver.get("https://tutorialsninja.com/demo/")

page_title = driver.execute_script("return document.title")
print(str(page_title))