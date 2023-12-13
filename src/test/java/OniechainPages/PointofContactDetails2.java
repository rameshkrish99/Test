package OniechainPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OnieChainApp.OnieChain;

public class PointofContactDetails2 {


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
				.selectBusinessByStatus(0)            //select application in list page
		    //	.clickOnAddContactofPrimary()
			//	.addDetailsSameInPrimaryContact()
				
			/*  .clickoncreatenew()
			 * 	.enterdetails("ram", "krishna")
				.enterLoginEmail("ramesh123@gmail.com")
				.addMobilecode("ind")
		    	.addMobileNumber("8677736882")
				.ClickOnAddButton()  */
	     /*	 	.clickOnAddContactOfTechnical()
	     	   .addDetailsSameInPrimaryContact()
			    .clickOnAddContactOfFinal()
			    .addDetailsSameInPrimaryContact()
			    .clickonNextButttonInPages() */
				.clickOn3DotstoEditOrRemove(1, 0)    //select list and select eit or remove
				.enterdetails("ram", "krishna")
				.enterLoginEmail("ramesh123@gmail.com")
				.addMobilecode("ind")
		    	.addMobileNumber("8677736882")
				.ClickOnAddButton();
	//		  	.clickonCancleButton()
	//		   .clickonSuperAdminAndLogout()				
  		     			  	   
/*// business Documents page
		//		.clickonAddDocumentButton()
		//		.UplodeDocument("C:\\Users\\ECS\\Downloads")
		//		.addBusinessdocumetname("business");
				.ClickonEditButtoninSummary(0)
				.addCity("gfhvhj")
				.addMobileNumber("0000000000")
				.clickonNextButttonInPages();*/
			

	}

}
