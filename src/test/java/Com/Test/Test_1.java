package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.Baseclass;
import com.Utility.Library;

public class Test_1 extends Baseclass {
	@Test
	public void VerifyTC_001() {
	LoginPom login=PageFactory.initElements(driver, LoginPom.class);
	Library.Custom_sendKeys(login.getTxt_email(),excel.getStringData("Sheet1", 0, 0));
	Library.Custom_sendKeys(login.getTxt_pass(),excel.getStringData("Sheet1", 0, 1));
	}
	
	
	
	
	
}
