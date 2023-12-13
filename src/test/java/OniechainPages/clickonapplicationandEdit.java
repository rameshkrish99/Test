package OniechainPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OnieChainApp.OnieChain;

public class clickonapplicationandEdit {

	public static WebDriver driver = null;

	public static void main(String[] args) throws Throwable {

			 driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				driver.get("http://98.70.48.123:8000/");
				
				OnieChain Oniechainadmin = new OnieChain(driver);
				Oniechainadmin.
				enterLoginEmail("superadmin@oniesoft.com")
				.enterLoginPassword("OnieChain@1")
				.clickOnNextButton()
				.enterVerificationCode("123456")
				.selectBusinessByStatus(2) ;           //select application and view the details
				
		/*		.accountStatusDropdowntochangeState(2, "gcsbcjcsbsjkmadmxbshjcsjhcjc")
				.CancleButtonX()
				.multileelementsofprofile(1)
				.clickOn3DotstoEditOrRemove(1, 1)
				.CancleButtonX()
				.clickonplusIconToCreateNewContact(1);
				
				 String edit="true";               //to edit detils
				 
				 if (edit=="true") {
					 Oniechainadmin .clickoncreatenew()
					            .enterdetails("ram", "krishna")
					          .enterLoginEmail("ramesh123@gmail.com")
					          .addMobilecode("ind")
				    	      .addMobileNumber("8677736882")
				    	     .clickonCancleToStayInDocumentPage();
				}
				 else {
					 Oniechainadmin .clickonplusIconToCreateNewContact(1);
				}*/
				
				                           
				  int index=0;  //(businesspage,pointof contact,documentuplod,node,active)
				  
		  if(index==0) {                          //business information page
					  Oniechainadmin
					  .multileelementsofprofile(index)
					   .editinBusinessinfo()
				/*	   .editCompanyName("1Esoft")
						.addBusinessEntity()
						.selectBusinesslistInEdit(1)
						.addMobilecode("ind")
						.addMobileNumber("8106554416")
						
						.editCompanyEmail("1Soft123@gmai.com")
						.editMailingAddress1("gsyujgsayugsadujs")
						.editMailingAddress2("wkjndikjsndsd")
						.editCityName("banglore")
						.editStateName("karanataka")
						.editZipCode("8738473242")
						.SelectContryInEditPage("india")
						.clickonAddDocumentButton()
						.canclinbusinessinfo()
						.clickonSuperAdminAndSeeUserDetails();  */
					   .AdddocumentinBussinfoEdit()
					   .UploadDocument("C:\\Users\\ECS\\Downloads\\1839821653.jpg")
					   .addBusinessdocumetname("business");
					   
					   
				  
				  
				  
				  } 
	  else if (index==1) {                     //point of contact page
					  Oniechainadmin
					  .multileelementsofprofile(index)
					  .clickOn3DotstoEditOrRemove(1, 1)
					  .toRemoveContact()
					  
					  .clickonplusIconToCreateNewContact(0)
					  .listofContactescreated(2);
				//		.CancleButtonX();
						
						int pointofcontact =4;
						 String addnew="true";
						 
						if(pointofcontact==0) {
							Oniechainadmin.clickonplusIconToCreateNewContact(0);
			                                                          //to add new detils primary
				 
						 if (addnew=="true") {
							 Oniechainadmin .clickoncreatenew()
							            .enterdetails("ram", "krishna")
							          .enterLoginEmail("ramesh123@gmail.com")
							          .addMobilecode("ind")
						    	      .addMobileNumber("8677736882")
						    	     .clickonCancleToStayInDocumentPage();
						}
						 else {
							 Oniechainadmin .clickonplusIconToCreateNewContact(0);
						 }
						}
						 else if (pointofcontact==1) {
						                                             //to add new technical contact 
						 Oniechainadmin.clickonplusIconToCreateNewContact(1);
						 
						 if (addnew=="true") {
							 Oniechainadmin
							 .clickoncreatenew()
							 .enterdetails("ram", "krishna")
							 .enterLoginEmail("ramesh123@gmail.com")
							 .addMobilecode("ind")
							 .addMobileNumber("8677736882");
							// .clickonCancleToStayInDocumentPage();
						}
					  else if (addnew == "editorremove") {
						 Oniechainadmin
						 .clickOn3DotstoEditOrRemove(1, 0)   //select list and select edit or remove
						 .enterdetails("ram", "krishna")
						.enterLoginEmail("ramesh123@gmail.com")
						.addMobilecode("ind")
						.addMobileNumber("8677736882")
						.ClickOnAddButton();
						}
						 else {
							 Oniechainadmin .clickonplusIconToCreateNewContact(1);
						 }
						 }         
						
		else if (pointofcontact==2) {	      //to add new financial contact =2
                Oniechainadmin
                .clickonplusIconToCreateNewContact(2);
						 
		           if (addnew=="true") {
			       Oniechainadmin .clickoncreatenew()
	             .enterdetails("ram", "krishna")
	              .enterLoginEmail("ramesh123@gmail.com")
	     		 .addMobilecode("ind")
	              .  addMobileNumber("8677736882")
	               .clickonCancleToStayInDocumentPage();
		       	  }
			     
		           else {
				 Oniechainadmin .clickonplusIconToCreateNewContact(2);
						 }
					}
					  }
		else
		  if (index==2) {                                  //configuration page index2
					   Oniechainadmin
					   .multileelementsofprofile(index)
					   .clickonIpAddressinConfigrations()
				//	   .clickOnAddIpAddress("465768464", "gjgjgyfhtefffeewd")
				//	   .clickOnNextButton()
					   .clickonApikeysinconfigratin()
					   .clickOnGenerateNewApiKey()
					   .CancleButtonX()
					   .clickonWebhooksinconfigration()
				//	   .clickonCreateEndPoint()
				//	   .addDataInWebhook("gudygyudg.com","hiudheiuhd")
				//	   .AddbuttoninWebook()
				//	   .ClickOnAddButton()
					   .editWebhook()
					   .addDataInWebhook("tujgu.com", "jskakugcaksj")
					   .clickonCancleToStayInDocumentPage()
					   
					   .clickonNodesinConfiguration()
					   
					   .clickonActivLoginConfigrations();
					   
					   } 
	else if  (index==3) {                            //active log page index3
					   Oniechainadmin
					   .multileelementsofprofile(index);
					   }


	}

}
