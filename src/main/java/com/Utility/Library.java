 package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Library {

	public static void Custom_sendKeys(WebElement element,String value) {
		try {
		element.sendKeys("value");
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	public static void custom_click (WebElement element1) {
		try {
			element1.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		public static void  custom_HandleDropDown(WebElement element2,String text) {
			try {
			Select sel=new Select(element2);
			sel.selectByVisibleText(text);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	

	
	
	
}
