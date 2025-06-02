from selenium.webdriver.common.by import By
from selenium import webdriver
import time

driver = webdriver.Chrome()

driver.get("http://omayo.blogspot.com/")

# button = driver.find_element(By.XPATH, "//span[text()='Accept all']")
# driver.execute_script("arguments[0].click()", button)

driver.find_element("document.getElementById('alert1)").click()

time.sleep(300)

driver.quit()