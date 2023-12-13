package OniechainPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OnieChainApp.OnieChain;

public class WelcomePage {


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
			   .toOpentheMenuBar();
				
				String menubar ="ryvyl";   //(to open menubar an clickon the icons present)  
			
				if (menubar=="businssprofils") {
					Oniechainadmin.clickonBusinessProfilsButton();
				}
				else if (menubar =="ryvyl") {
					Oniechainadmin .clickonRyvylEmployeeButton()
					.clickOnDoneButtoninRyvyl();
				} 	
				else if (menubar=="export") {
					Oniechainadmin.clickOnExportMenuButton();
					
				}
				Oniechainadmin
				
				.clickondropdwnlist() 
				.dropdownForStatsus(1)      //select status in the dropdown by index
				.clickonStatusKeyButton()
				.CancleButtonX()
		//		.searchWithcmpnyNameORID("onie")
				.selectBusinessByStatus(0);
				
	}

}
