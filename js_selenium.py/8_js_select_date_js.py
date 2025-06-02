from selenium.webdriver.common.by import By
from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html")

date_field = driver.find_element(By.ID, "datepicker")
date_v = "11/05/2026"
driver.execute_script("arguments[0].value=arguments[1]", date_field, date_v)

time.sleep(3)


driver.quit()