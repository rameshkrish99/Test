package OniechainPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OnieChainApp.OnieChain;

public class ChangeAdminimage {

	 public static WebDriver driver=null;
		
		
		public static void main(String[] args) throws Throwable {

			 driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				driver.get("http://98.70.48.123:8000/");
				
				OnieChain Oniechainadmin = new OnieChain(driver);
				Oniechainadmin.
				enterLoginEmail("superadmin@oniesoft.com")
				.enterLoginPassword("OnieChain@111")
				.clickOnNextButton()
				.enterVerificationCode("123456")
				.clickonSuperAdminAndSeeUserDetails()
				.clickonChangePassword()
				.enterVerificationCode("123456")
				.addOldPassworAndNewPassword("OnieChain@111", "OnieChain@123", "OnieChain@123")
				.eyeIconShowpass(0)
				.eyeIconShowpass(1)
				.eyeIconShowpass(0)
				.eyeIconHidePass(0)
				.eyeIconHidePass(1)
				.eyeIconHidePass(0);
				
				
				
				
				
      }
             }