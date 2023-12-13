package OniechainPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OnieChainApp.OnieChain;

public class Adddetailsinallpages {

	static WebDriver driver=null;
	
	
	public static void main(String[] args) throws Throwable {

		 driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("http://98.70.48.123:8000/");
			
			OnieChain Oniechainadmin = new OnieChain(driver);
		
			
			Oniechainadmin.
                                                         //login page		
			enterLoginEmail("superadmin@oniesoft.com")
			.enterLoginPassword("OnieChain@123")
			.clickonPasswordHideorShow()
			.clickonPasswordHideorShow()
			.clickOnNextButton()
			.enterVerificationCode("123456")
                                                      //business list page			
			.clickAddBusinessButton()
                                                   //	Business Information page		
			.addcompanyname("oniesoft")
			.addBusinessEntity()
			.selectBusinesslistInEdit(3)
		//	.SsnRadiobutton()
			.addEINnumberOrTIN("6517345678")
			
			.addBusinessStartedDate("11/2020")
			.addCompanyEmail("Oniesofi1@gmail.com")
			.addMobilecode("ind")
		
			.addMobileNumber("9999999999")
			.addCompanyAddress1("near IKEA opposit ")
			.addCompanyAddress2("lulu mall near KPHB")
			.addCity("Hydrabad")
			.addState("telangana")
			.addZipCode("456886")
			.selectContry("ind");
			
			String checkbox="accept" ; 
					               //do you use business address check box in business application !
			
			if (checkbox =="accept" ) {
				Oniechainadmin.ifDoBusinessByCmpnyname();
			}
			else {				
	    	Oniechainadmin .addDbaName("ramesh")
			.addDbaAdd1("9-4-4,flat.no-")
			.addDbaAdd2("9-5-5,flat.no-523")
			.addDbaCountry("ind")
			.addDbaState("andhra")
			.addDbaCity("vijayawada")
			.addDbaZipCode("767637");
			}
			
			Oniechainadmin.clickoneyeIconinEINTextbox()
			               .clickonNextButttonInPages()
			                                                  //point of contact page 
	 //    	.selectBusinessByStatus(2)               //select application by application index
			.clickOnAddContactofPrimary()
    		.addDetailsSameInPrimaryContact()
			.enterdetails("ram", "krishna")
			.enterLoginEmail("ramesh123@gmail.com")
			.addMobilecode("ind")
			.addMobileNumber("8677736882")
			.ClickOnAddButton()   
			.clickOnAddContactOfTechnical()
			.addDetailsSameInPrimaryContact()
			.clickOnAddContactOfFinal()
			.addDetailsSameInPrimaryContact();
			
			
	}

}
