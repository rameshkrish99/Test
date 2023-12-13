package OniechainPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OnieChainApp.OnieChain;

public class Editinsummarypage5 {

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
				.selectBusinessByStatus(0);
				
		String  index ="edit1";  //(edit0 (business),edit1(point),edit2(document) ,edit3(node))
				
			if (index=="edit0") {                 //edit business info page                 
					Oniechainadmin
					.ClickonEditButtoninSummary(0)
				.addCity("gfhvhj")
				.addMobileNumber("0000000000");
				}
			
    	else if (index=="edit1") {               //edit point of contact  
					Oniechainadmin
					.ClickonEditButtoninSummary(1);
					
					String str="edit";             //(add,remov,edit)
					
					if (str=="add") {	
						Oniechainadmin.clickOnAddContactofPrimary()
						                                     //	.addDetailsSameInPrimaryContact()
						.clickOnAddContactofPrimary()
						.clickoncreatenew()
						.enterdetails("ram", "krishna")
						.enterLoginEmail("ramesh123@gmail.com")
						.addMobilecode("ind")
				    	.addMobileNumber("8677736882")
						.ClickOnAddButton()   
			     	 	.clickOnAddContactOfTechnical()
			    	    .addDetailsSameInPrimaryContact()
					    .clickOnAddContactOfFinal()
					    .addDetailsSameInPrimaryContact();
					  //  .clickonNextButttonInPages();
					}
					
					else if (str=="edit") {
						Oniechainadmin
						.toEditinSummary(1)
						.enterdetails("ramraju", "krish")
						.enterLoginEmail("ramesh1@gmail.com")
						.addMobilecode("ind")
				    	.addMobileNumber("867773685574")
						.ClickOnAddButton() 
						.clickonNextButttonInPages();
					}
					else if (str=="remov") {
						Oniechainadmin
						.toRemoveDetailsinSummary(0)
						
						.toRemoveDetailsinSummary(1)
						.toRemoveDetailsinSummary(0);
											
					}
					
				}
		else if (index=="edit2") {         //edit busines document
					Oniechainadmin
					.ClickonEditButtoninSummary(2);	
				}
		else if (index=="edit3") {         //edit node configuration
					Oniechainadmin
					.ClickonEditButtoninSummary(3)
					.selectNodeConfiguration(1)
					.selectNodeConfiguration(1)
					.selectNodeConfiguration(0)
					.clickonNextButttonInPages();	
				}

				
				Oniechainadmin.clickonAddbusinessInSummary();
				

	}

}
