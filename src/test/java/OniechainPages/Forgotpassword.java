package OniechainPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OnieChainApp.OnieChain;

public class Forgotpassword {


	 public static WebDriver driver=null;
		
		
		public static void main(String[] args) throws Throwable {

			 driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				driver.get("http://98.70.48.123:8000/");
				OnieChain Oniechainadmin = new OnieChain(driver);
				
				Oniechainadmin
				.clickOnForgotpass()
				.enterLoginEmail("superadmin@oniesoft.com")
				.clickOnNextButton()
				.enterVerificationCode("123456")
				.enternewpasswordinforgotpass("OnieChain@9", "OnieChain@9")
				.eyeIconShowpass(0)
				.eyeIconShowpass(0)
				.eyeIconHidePass(0)
				.eyeIconHidePass(0);
	}

}
