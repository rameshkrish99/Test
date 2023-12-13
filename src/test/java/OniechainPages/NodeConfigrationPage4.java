package OniechainPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OnieChainApp.OnieChain;

public class NodeConfigrationPage4 {

	 public static WebDriver driver=null;
		
		
		public static void main(String[] args) throws Throwable {

			 driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				driver.get("http://98.70.48.123:8000/");
				
				OnieChain Oniechainadmin = new OnieChain(driver);
				Oniechainadmin.
				enterLoginEmail("superadmin@oniesoft.com")
				.enterLoginPassword("OnieChain@123")
				.clickOnNextButton()
				.enterVerificationCode("123456")
				.selectBusinessByStatus(2)             //applying through click on status
				
				.selectNodeConfiguration(1);
			//	.goBackButtonInPages();
			//	.clickonNextButtonInPointOfContactPage();
				
	}

}
