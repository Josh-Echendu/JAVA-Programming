from selenium.webdriver.common.by import By
from selenium import webdriver
import time


driver = webdriver.Chrome()
driver.get("https://tutorialsninja.com/demo/")

def flash_element(element):

    # Get the original background color
    original_bg_color = element.value_of_css_property('background-color') #Extract a css property

    for i in range(1,10):
        driver.execute_script("arguments[0].style.background = 'green'", element)
        time.sleep(0.5)
        driver.execute_script('arguments[0].style.background="red"', element)
        time.sleep(0.5)

        driver.execute_script(f"arguments[0].style.background='{original_bg_color}'", element)

button1 = driver.find_element(By.XPATH, '(//button[@type="button"])[5]')
flash_element(button1)


time.sleep(5)

driver.quit()