from selenium.webdriver.common.by import By
from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://tutorialsninja.com/demo/")

element = driver.find_element(By.NAME, "search")
text_w = "HP"

value_u = driver.execute_script("return arguments[0].value=arguments[1]", element, text_w)
print(value_u)

time.sleep(3)

driver.quit()
