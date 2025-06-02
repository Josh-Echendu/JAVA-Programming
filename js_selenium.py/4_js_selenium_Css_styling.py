from selenium.webdriver.common.by import By
from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://tutorialsninja.com/demo/")

def highlight_element(element):
    driver.execute_script("arguments[0].style.border='2px solid pink'", element)

search_button_field = driver.find_element(By.NAME, "search")
highlight_element(search_button_field)

time.sleep(5)

driver.quit()