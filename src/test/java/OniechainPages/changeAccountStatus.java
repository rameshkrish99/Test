package OniechainPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OnieChainApp.OnieChain;

public class changeAccountStatus {

	 public static WebDriver driver=null;
		
		
		public static void main(String[] args) throws Throwable {

			 driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				driver.get("http://98.70.48.123:8000/");
				
				OnieChain Oniechainadmin = new OnieChain(driver);
				Oniechainadmin
                .enterLoginEmail("superadmin@oniesoft.com")
				.enterLoginPassword("OnieChain@123")
				.clickonPasswordHideorShow()
				.clickonPasswordHideorShow()
				.clickOnNextButton()
				.enterVerificationCode("123456")
				.selectBusinessByStatus(1) 
				.accountStatusDropdowntochangeState(1, "he is in active")
				.clickonApplyChangesForStatus()
				.clickonBusinessProfilsButton();   //to verify status is change or not
				                                         

}
		
	}


