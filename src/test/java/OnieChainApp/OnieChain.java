package OnieChainApp;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import javax.swing.event.MenuKeyEvent;
import java.awt.*;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnieChain {
	
	
	WebDriver driver;
	WebDriverWait wait;
	int defaultwait = 5;
	
	//Login page
	By loginmail = By.xpath("//input[@name='email']");
	By loginpassword = By.xpath("//input[@name='password']");
	By eyeicon = By.xpath("(//button[@type='button'])[2]");
	By next = By.xpath("//button[@type='submit']");
	
	//logout from application
	
	By clickonsuperadmidropdown = By.xpath("//button[@class='Header_userNameLabel__Hzeog']");
	By logoutbutton = By.xpath("(//button[@class='Header_labelStyle__IXKLx'])[2]");
	By userdetails = By.xpath("(//button[@class='Header_labelStyle__IXKLx'])[1]"); 

	//Verifiation code page 6digits
	
	By verificationcode = By.xpath("(//input[@class='verification_input_filed false false'])[1]");
	
//Welcome page
	//side menu bar
	By toopenmenubar = By.xpath("//span[@class='icon-hamburger-right mainMenu_hamburgerIcon__Jx3Z6 ']");
	By toclosemenuebar = By.xpath("//span[@class='icon-hamburger-left mainMenu_hamburgerIcon__Jx3Z6 ']");
	
	By businesprofil = By.xpath("(//div[@class='mainMenu_customToolTip__nk9FP'])[1]");
	
	By Ryvylemployeebutton = By.xpath("(//div[@class='mainMenu_customToolTip__nk9FP'])[2]");
	By donebuttoninryvyemp = By.xpath("//button[contains(@class ,'Buttons_primaryButton__OURms')]");
	By closeXsymboleBy = By.xpath("//div[@class='icon-close text-cgy3 hover:text-cgy4 h-[16px]']");
	
	By exportbutton = By.xpath("(//div[@class='mainMenu_customToolTip__nk9FP'])[3]");
	
	By addbusiness = By.xpath("//div[@class='BusinessProfiles_btnTitle__5qvNz']");
	By export = By.xpath("(//button[@data-testid='customButton'])[1]");
	By ststuskey = By.xpath("(//button[@data-testid='customButton'])[2]");
	By searchbox = By.xpath("//input[@placeholder='Search By Name or ID']");
	
	
	
	By allstatus = By.xpath("//div[@class='h-10 rounded-[10px] px-3 flex justify-between items-center group']");
//	By selectcheckbokofststus  = By.xpath("//input[@type='checkbox']");
	By Dropdownstatus = By.xpath("(//label[@class='MultiSelectDropdown_checkbox__ECECv flex items-center text-xs cursor-pointer h-full gap-2'])");
	
	//chech status in list page 	
		By listofbusiness = By.xpath("(//div[@data-testid='chipid'])");
	
	
	
	//Add business details
	
	By companyname = By.xpath("//input[@name='companyName']");
	By businessentity = By.xpath("(//div[@class='FormField_selected_option__7Rw29 text-cgy4 cursor-pointer'])[1]");
	By businessList = By.xpath("//div[contains(@class,'flex items-center ju')]");
	
	By ssnradiobutton = By.xpath("//input[@id='ssn-radio-btw']");
	By tinradiobutton = By.xpath("//input[@id='ein-tin-radio-btn']");
	By EinorTin = By.xpath("//input[@name='entityValue']");
	By Eineyeicon = By.xpath("//button[contains(@class,'PasswordInput_view_password_')]");
	By businessstartdate = By.xpath("//input[@name='businessStartDate']");
	By companymail = By.xpath("//input[@name='companyEmail']");
	By mobilecode = By.xpath("//div[contains(@class,'FormField_phoneSelectedOpt')]");
	By Mcountrycode = By .xpath("//input[@placeholder='Search Country']");
	By serchcontrybycode = By.xpath("//div[text()='India']");
	
	By serchcontry = By.xpath("//div[@data-='India']");
	By mobilenumb = By.xpath("//input[@name='phoneNumber']");
	
	By companyaddress1 = By.xpath("//input[@name='companyAddressLine1']");
	By companyaddress2 = By.xpath("//input[@name='companyAddressLine2']");
	By cityofcompany = By.xpath("//input[@name='companyCity']");
	By stateofcompany = By.xpath("//input[@name='companyState']");
	By companyZipcode = By.xpath("//input[@name='companyZipcode']");
	By selectcontry = By.xpath("(//div[@class='FormField_selected_option__7Rw29 text-cgy4 cursor-pointer'])[2]");
	
	//contry
	
	//checkbox if you do business by companyname & address
	By checkbox = By.xpath("//input[@type='checkbox']");
	
	By dbaname = By.xpath("//input[@name='dbaName']");
	By dbaaddress1 = By.xpath("//input[@name='dbaAddressLine1']");
	By dbaaddress2 = By.xpath("//input[@name='dbaAddressLine2']");
	By dbacity = By.xpath("//input[@name='dbaCity']"); 
	By dbastate = By.xpath("//input[@name='dbaState']");
	By dbazipcode = By.xpath("//input[@name='dbaZipcode']");
	By dbacountry = By.xpath("(//div[@class='FormField_selected_option__7Rw29 text-cgy4 cursor-pointer'])[3]");

	
//point of contact page
	//1.primary contact
	
	By addcontactP = By.xpath("(//span[@class='icon-plus btn--link__icon text-lg mr-[10px] ;'])[1]");
	By firstname = By.xpath("//input[@name='firstName']");
	By lastname = By.xpath("//input[@name='lastName']");
	
	By canclebutton = By.xpath("//button[@type='submit']");
	By add = By.xpath("//button[contains(@class,'rounded-lg font-bo')]");
	
	
	
	
	//2.technical contact 
	
	By addcontactT = By.xpath("(//span[@class='icon-plus btn--link__icon text-lg mr-[10px] ;'])[2]");
	By samedetaisinprimary = By.xpath("//div[@class='PointOfContact_contactsContainer__yuMzy']");
	By createnew = By.xpath("//button[@class='PointOfContact_createContactButton__mbIKC']");
	
	
	//3.finansial or billing contact
	By addcontactF = By.xpath("(//span[@class='icon-plus btn--link__icon text-lg mr-[10px] ;'])[3]");
	
	By nextbuttoninpages = By.xpath("//button[text()='Next']");
	
//business document
	
	By adddocumntbutton = By.xpath("//span[@class='BusinessDocumentUpload_plusIcon__rwHIY icon-plus']");
	By attachdocument = By.xpath("//div[@data-testid='icon-upload']");
	By uploaddocument = By.xpath("//button[contains(@class,'FormFile_form_file__-SKGD  ')]");
	By uploaddocumentbyinputtag = By.xpath("//button[contains(@class,'FormFile_form_file__-SKGD   group BusinessInformation_addDocumen')]//preceding-sibling::input");
	By uploaddocbyinputtag1 = By.xpath("document.getElementsByTagName('input')[0]");
	By uploaddocumentbyscript = By.xpath("document.getElementsByTagName('input')[0].style.display='block'");
	By documentname = By.xpath("//input[@name='documentName']");
	
	By addbuttoindocumentpage = By.xpath("//button[@class='BusinessDocumentUpload_uploadBtn__jRtK-']");
	By canclebuttonindocuentpage = By.xpath("//button[text()='Cancel']");
	By skipdocumetpage = By.xpath("//button[text()='Skip']");
//alert 
	By skipdocumetalert = By.xpath("(//button[text()='Skip'])[2]");
	
	By alertcancletostayindocumentpage = By.xpath("//button[@class='BusinessDocumentUpload_cancelBtn__1JPsn']");

	//Node configuration	
	By selectnode = By.xpath("(//div[@class='SelectableNodes_emptyCircle__DRweS'])");
	By backtobusinessdocumetpage = By.xpath("//button[text()='Back']");
	
	//summary page
	
	By editinsummary = By.xpath("//button[@class='BusinessApplicationSummary_infoEditBtn__vrHhU']");
	By addbusinessinsummary = By.xpath("//button[text()='Add Business']");
	By backbutoninsummary =By.xpath("//button[text()='Back']");
	
	
	By removeXinPointofcontact = By.xpath("//button[contains(@class,'icon-close PointOfContact_editIcon__CAkjz')]");
    By editinpointofcontact = By.xpath("//button[contains(@class,'icon-edit PointOfCon')]");
	//edit in summary
	
	
//clickonapplication in //list page and view details 

	By clickonststusdropdown = By.xpath("//div[@class='BusinessSettingsSideMenu_optionsContainer__ikGUW false']");
	By selectstatusindropdown = By.xpath("//div[@class='BusinessSettingsSideMenu_optionsContainer__ikGUW']");
	By writeresontochange = By.xpath("//textarea[@name='reason']");
	By clickcheckboxtoapply = By.xpath("//input[@name='isStatusChange']");
	By applychanges = By.xpath("//button[text()='Apply Change']");
	                                               
	                                                         //business info page
	By elementsinappliedapplication  = By.xpath("//a[contains(@class,'      ')]");
	
	By businessinfo = By.xpath("//a[@id='business-info']");
	By editinbusinessinfo = By.xpath("//button[text()='Edit']");
	By cancleinbusinessinfo = By.xpath("//button[text()='Cancel']");
	
	                                                               //to edit in business info
	
	By editcompanyname = By.xpath("//input[@placeholder='Business Name']");
    By selectbusinessineditpage = By.xpath("//div[contains(@class,'flex items-center justify-between pr-[3px] cu')]")
;	By editcompanyemai = By.xpath("//input[@placeholder='Company Email Address']");
	By editaddress1 = By.xpath("//input[@placeholder='Mailing Address Line 1']");
	By editaddress2 = By.xpath("//input[@placeholder='Mailing Address Line 2 (optional)']");
	By editcityname = By.xpath("//input[@name='city']");
	By editstate = By.xpath("//input[@name='stateProvince']");
	By editzipcode = By.xpath("//input[@name='zipPostalCode']");
	By clickoncountrydrp = By.xpath("(//div[contains(@class,'FormField_selected_option__7Rw29 text-cgy4 cursor-pointer')])[2]");
	By sendcontryname = By.xpath("//input[@placeholder='Search']");
	By listofcountrys = By.xpath("//div[contains(@class,'flex items-center justify-betwe')]");
	By clickonsavetomodifiedchanges = By.xpath("//button[text()='Save']");
	By adddocumntinbusinessedit = By.xpath("//button[@class='BusinessInformation_addButton__4X++k']");
	
	//point of contact 
	By pointofcontact = By.xpath("//a[@id='points-of-contact']");
	By createdcontactlist = By.xpath("//div[@class='PointOfContact_contactItem__BFMKM']");
	By clickon3dotsiconbn = By.xpath("//span[@class='icon-three-dots']");
	By clickteEditorremove = By.xpath("//button[@class='PointOfContact_dropDownButton__-tcKX']");
	By remove = By.xpath("//button[text()='Remove']");
	By addnewcontact = By.xpath("//button[@data-tooltip-content='Add Contact']");
	By createnewcontct = By.xpath("//p[@class='PointOfContact_createContactText__V0vVO']");
	
	//configuration
	By configuration = By.xpath("//a[@id='configuration']");
	By nodes = By.xpath("(//button[contains(@class,'BusinessConfiguration_tab__3')])[1]");
	By apikeys = By.xpath("(//button[contains(@class,'BusinessConfiguration_tab__3Zg9')])[2]");
	By generatenewkey = By.xpath("//button[@class='ApiKeys_generateKey__A2i2m']");
	
	By webhooks = By.xpath("(//button[contains(@class,'BusinessConfiguration_tab__3')])[3]");
	By createendpoint = By.xpath("//button[@class='Buttons_primaryButton__OURms Buttons_notDisable__fVQ8Z ']");
	By addurl = By.xpath("//input[@name='url']");
	By endpointdescription = By.xpath("//textarea[@id='description']");
	By addbutton = By.xpath("//button[text()='Add']");
	By editwebhook = By.xpath("//button[@class='Webhooks_editButton__Gu5fy']");
	
	By ipaddress = By.xpath("(//button[contains(@class,'BusinessConfiguration_tab__3')])[4]");
	By addipddress = By.xpath("//button[@class='Buttons_primaryButton__OURms Buttons_notDisable__fVQ8Z ']");
	By ipaddresstext = By.xpath("//input[@name='ipAddressArray.[0].ipAddress']");
	By descriptionofipaddress = By.xpath("//textarea[@name='ipAddressArray.[0].description']");
	
	
	By activel = By.xpath("(//button[contains(@class,'BusinessConfiguration_tab__3')])[5]");
	//activelog
	By activelogb = By.xpath("//a[@id='activity-log']");
	
                          	// user profile
	
	By editimage = By.xpath("//button[@class='icon-edit AdminProfile_editIconClass__1bRKe']");
	By uploadimage = By.xpath("//button[contains(@class,'Buttons_primaryButton')]");
	By selectimage = By.xpath("//p[@class='AdminProfile_selectImage__snGTl']");
	
	By changepassword = By.xpath("//button[contains(@class,'h-9 w-[170px] rounded-full font-bol')]");
	By currntpass = By.xpath("//input[@id='oldPassword']");
	By newpass  = By.xpath("//input[@name='newPassword']");
	By conformpass = By.xpath("//input[@name='confirmNewPassword']");
	
	By eyeiconshow = By.xpath("//button[@class='PasswordInput_view_password__sHrdV icon-eye-hide']");
	By eyeiconhide = By.xpath("//button[@class='PasswordInput_view_password__sHrdV icon-eye-open']");
	
	                         //Forget password
	
	By forgetpass = By.xpath("(//button[@class='FormLogin_forgot_container_text__FJafS'])[2]");
	By enterpass = By.xpath("//input[@name='enter_password']");
	By cnfmmpass = By.xpath("//input[@name='confirm_password']");
	
	
	
	public WebElement waitToBeClick(By by) {
		return wait.until(ExpectedConditions
				.elementToBeClickable(by));
		}
	
	public  OnieChain(WebDriver driver) {

		this.driver = driver;
		driver.manage().window().maximize();
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(defaultwait) );
	}
	
	public OnieChain enterLoginEmail(String email) {
		
		WebElement mail = waitToBeClick(loginmail);
		mail.clear();
		mail.sendKeys(email);
		return this;
	}
	
	public OnieChain enterLoginPassword(String pass) {
		
		waitToBeClick(loginpassword).sendKeys(pass);
		return this;
	}
	
	public OnieChain clickonPasswordHideorShow() throws Throwable {
           WebElement element = waitToBeClick(eyeicon);
    //       JavascriptExecutor js = (JavascriptExecutor)driver;
     //      js.executeScript("arguments[o].scrollIntoView(true)", element);
           Thread.sleep(1000);
           element.click();
           return this;
		
	}
	
	public OnieChain clickOnNextButton() {
		
		waitToBeClick(next).click();
		return this;
	}
	
	public OnieChain enterVerificationCode(String num) throws Throwable {
		
		waitToBeClick(verificationcode).sendKeys(num);
		Thread.sleep(1000);
		return this;
	}
	
	                                          //  Admin details page
	
	public OnieChain clickooEditImageSymbole(String imge) throws Throwable {
		waitToBeClick(editimage).click();
		Thread.sleep(1000);
		
		waitToBeClick(uploadimage).click();
		Thread.sleep(1000);
		
		waitToBeClick(selectimage).sendKeys(imge);
		return this;
	}
	     
	
	public OnieChain clickonChangePassword() throws Throwable {
		
		waitToBeClick(changepassword).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain addOldPassworAndNewPassword(String curntpas,String newpas,String cnfmpass) throws Throwable {
		
		waitToBeClick(currntpass).sendKeys(curntpas);
				Thread.sleep(1000);
		
		waitToBeClick(newpass).sendKeys(newpas);
		Thread.sleep(1000);
		
		waitToBeClick(conformpass).sendKeys(cnfmpass);
		
		return this;
	}
	
	public OnieChain eyeIconShowpass(int showe) throws Throwable {
		
		List<WebElement> show = driver.findElements(eyeiconshow);
		show.get(showe).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain eyeIconHidePass(int hide) throws Throwable {
		
		List<WebElement> hid = driver.findElements(eyeiconhide);
		hid.get(hide).click();
		Thread.sleep(1000);
		return this;
	}
	
	                                                       //Forgot password
	
	public OnieChain clickOnForgotpass() {
		
		waitToBeClick(forgetpass).click();
		return this;
	}
	
	public OnieChain enternewpasswordinforgotpass(String newpass,String cnfmpass) throws Throwable {
		
		waitToBeClick(enterpass).sendKeys(newpass);
		Thread.sleep(1000);
		waitToBeClick(cnfmmpass).sendKeys(cnfmpass);
		Thread.sleep(1000);
		return this;
	}
	
	
	                                                            //welcome page

	public OnieChain clickAddBusinessButton() throws Throwable {
		
		waitToBeClick(addbusiness).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain addcompanyname(String cmpny) throws InterruptedException {
		
		waitToBeClick(companyname).sendKeys(cmpny);
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain addBusinessEntity() throws Throwable {
		waitToBeClick(businessentity).click();
		Thread.sleep(1000);
		
	 return this;
	}
	
	public OnieChain selectListOfBusiness(int index) throws Throwable {
		
		List<WebElement> list = driver.findElements(addbusiness);
		Thread.sleep(1000);
		list.get(index).click();
	
		waitToBeClick(businessList).click();
		return this;
		
	}
	
	public OnieChain SsnRadiobutton() {
		
		waitToBeClick(ssnradiobutton).click();
		return this;
	}
	
	public OnieChain tinradiobutton() {
		
		waitToBeClick(tinradiobutton).click();
		return this;
	}
	
	public OnieChain addEINnumberOrTIN(String numb) throws Throwable {
		
		waitToBeClick(EinorTin).sendKeys(numb);
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain clickoneyeIconinEINTextbox() throws Throwable {
		
		waitToBeClick(Eineyeicon).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain addBusinessStartedDate(String date) throws Throwable {
		
		waitToBeClick(businessstartdate).sendKeys(date);
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain addCompanyEmail(String mail) throws Throwable {
		
		waitToBeClick(companymail).sendKeys(mail);
		Thread.sleep(1000);
		return this;
		
	}
	
	public OnieChain addMobilecode(String cntrynam) throws Throwable {
		
		waitToBeClick(mobilecode).click();
		Thread.sleep(1000);
		waitToBeClick(Mcountrycode).sendKeys(cntrynam);
		Thread.sleep(1000);
		waitToBeClick(serchcontrybycode).click();
		Thread.sleep(1000);
		
		return this;
	}
	
	public OnieChain searchcountrycode(String cntrynam) throws Throwable {
		
	 WebElement cntrycod = waitToBeClick(Mcountrycode);
		cntrycod.sendKeys(cntrynam);
	 Thread.sleep(1000);
		waitToBeClick(serchcontrybycode).click();
		return this;
		
	}
	
	public OnieChain selectBusinessByStatus(int index) throws Throwable {
		
		List<WebElement> elements = driver.findElements(listofbusiness);
		Thread.sleep(1000);
		elements.get(index).click();
		Thread.sleep(1000);
		return this;
		
	}	
	public OnieChain  addMobileNumber(String num) throws Throwable  {
		
		WebElement number = waitToBeClick(mobilenumb);
		number.clear();
		Thread.sleep(1000);
		number.sendKeys(num);
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain addCompanyAddress1(String add1) {
		
	WebElement address = waitToBeClick(companyaddress1);
	address.clear();
	address.sendKeys(add1);
	return this;
	}
	
	public OnieChain addCompanyAddress2(String add2) {
		
		WebElement address = waitToBeClick(companyaddress2);
		address.clear();
		address.sendKeys(add2);
		return this;
	}
	
	public OnieChain addCity(String city) {
		
		WebElement cit = waitToBeClick(cityofcompany);
		cit.clear();
		cit.sendKeys(city);
		return this;
	}
	
	public OnieChain addState(String state) throws Throwable {
		
		WebElement st = waitToBeClick(stateofcompany);
		st.clear();
		Thread.sleep(1000);
		st.sendKeys(state);
		return this;
	}
	
	public OnieChain addZipCode(String zipcod) {
		
		WebElement zip = waitToBeClick(companyZipcode);
		zip.clear();
		zip.sendKeys(zipcod);
		return this;
		
	}
	
	public OnieChain selectContry(String cntryname) {
		
		waitToBeClick(selectcontry).click();
		waitToBeClick(Mcountrycode).sendKeys(cntryname);
		waitToBeClick(serchcontry).click();
		return this;
	}
                                                               //Check box in business info	
	public OnieChain ifDoBusinessByCmpnyname() {
		
		waitToBeClick(checkbox).click();
		return this;	
	}
	
	public OnieChain addDbaName(String name) {
		
		WebElement namee = waitToBeClick(dbaname);
		namee.clear();
		namee.sendKeys(name);
		return this;
	}
	
	public OnieChain addDbaAdd1(String add1) {
		WebElement address = waitToBeClick(dbaaddress1);
		address.clear();
		address.sendKeys(add1);
		return this;	
		}
	
	public OnieChain addDbaAdd2(String add2) {
		
		WebElement address = waitToBeClick(dbaaddress2);
		address.clear();
		address.sendKeys(add2);
		return this;
	}
	
	public OnieChain addDbaCity(String city) {
		
		WebElement cit = waitToBeClick(dbacity);
		cit.clear();
		cit.sendKeys(city);
		return this;
	}
	
	public OnieChain addDbaState(String state) {
		
		WebElement st = waitToBeClick(dbastate);
		st.clear();
		st.sendKeys(state);
		return this;
	}
	
	public OnieChain addDbaCountry(String cntryname) {
		
		waitToBeClick(dbacountry).click();
	
		waitToBeClick(Mcountrycode).sendKeys(cntryname);
		waitToBeClick(serchcontry).click();
			return this;
	}
	public OnieChain addDbaZipCode(String zipcod) {
		
		WebElement zip = waitToBeClick(dbazipcode);
		zip.clear();
		zip.sendKeys(zipcod);
		return this;
	}
	
	public OnieChain clickonSuperAdminAndLogout() {
		
		waitToBeClick(clickonsuperadmidropdown).click();
		waitToBeClick(logoutbutton).click();
		return this;
	}
	
	public OnieChain clickonSuperAdminAndSeeUserDetails() {
		
		waitToBeClick(clickonsuperadmidropdown).click();
		waitToBeClick(userdetails).click();
		return this;
	}
                                                        //point of contact	
	                                                        //1.primary contact
	
	public OnieChain clickOnAddContactofPrimary() {
		waitToBeClick(addcontactP).click();
		return this;
		
	}
	
	public OnieChain enterdetails(String email, String pass ) throws Throwable {
		
		WebElement name = waitToBeClick(firstname);
		name.clear();
		Thread.sleep(1000);
		name.sendKeys(email,Keys.TAB,pass);
		return this;
	}
	
	public OnieChain clickonCancleButton() {
		
		waitToBeClick(canclebutton).click();
		return this;
	}
	
	public OnieChain  ClickOnAddButton(){
		
		waitToBeClick(add).click();
		return this;
	} 
	                                                         //2.technical contact
	
	public OnieChain clickOnAddContactOfTechnical() {
		waitToBeClick(addcontactT).click();
		
		return this;
	}
	
	public OnieChain addDetailsSameInPrimaryContact() {
		
		waitToBeClick(samedetaisinprimary).click();
		return this;
	}
	
	public OnieChain clickonCreateNew() {
		
		waitToBeClick(createnew).click();
		return this;
	}
	
	public OnieChain clickOnAddContactOfFinal() {
		
		waitToBeClick(addcontactF).click();
		return this;
	}
	
	public OnieChain clickonNextButttonInPages() {
		
		waitToBeClick(nextbuttoninpages).click();
		return this;
	}

                                                           //business document page 
	
	public OnieChain clickonAddDocumentButton() throws Throwable {
		
		waitToBeClick(adddocumntbutton).click();
		System.out.print("sucessfully clicked");
		Thread.sleep(1000);
		
	return this;
	}
	
	public OnieChain UploadDocument(String name) throws Throwable {
	//	 WebElement upload = waitToBeClick(uploaddocument);
	//	Actions act = new Actions(driver);
	//	 act.click(upload).build().perform();
	//	WebElement upload = waitToBeClick(uploaddocumentbyinputtag);
		Thread.sleep(3000);
	
		   WebElement script = waitToBeClick(uploaddocumentbyscript);
 // 	WebElement input = waitToBeClick(uploaddocbyinputtag1);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView()",script);
		Thread.sleep(3000);
		script.sendKeys(name);

		System.out.println("file uploaded sucessfully");
		Thread.sleep(1000);
		
		return this;
		
	}
	
	public OnieChain addBusinessdocumetname(String  doc) {
		
		   waitToBeClick(documentname).sendKeys(doc); 
					return this;
	}
	
	public OnieChain cancleButtonInDocumentpage() {
		
		waitToBeClick(canclebuttonindocuentpage).click();
		return this;
	}
	
	public OnieChain clickOnSkipDocumentPage() {
		
		waitToBeClick(skipdocumetpage).click();
		return this;
	}
	
        public OnieChain AlertSkipForDocument() {
		
		waitToBeClick(skipdocumetalert).click();
		return this;
	}
	public OnieChain clickonCancleToStayInDocumentPage() throws Throwable {
		
		waitToBeClick(canclebuttonindocuentpage).click();
		Thread.sleep(1000);
		return this;
	}
	
                                                      //Node configuration page
	
	public OnieChain selectNodeConfiguration(int index) throws Throwable {
		
     List<WebElement> node = driver.findElements(selectnode);
		node.get(index).click();
		Thread.sleep(1000);
		return this;
	}
	public OnieChain goBackButtonInPages() {
		
		waitToBeClick(backtobusinessdocumetpage).click();
		return this;
	}
	
	
                                                        //summary page 
	
	public OnieChain ClickonEditButtoninSummary(int index) throws Throwable {
		
		List<WebElement> elements = driver.findElements(editinsummary);
		elements.get(index).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain clickonAddbusinessInSummary() throws Throwable {
		
		waitToBeClick(addbusinessinsummary).click();
		Thread.sleep(1000);
		return this;
	}
	
	                                               //point of contact in summary
	
	public OnieChain toRemoveDetailsinSummary(int index) {
	List<WebElement> remov = driver.findElements(removeXinPointofcontact);
	remov.get(index).click();
	return this;

	}
	
	public OnieChain toEditinSummary(int index) {
		
		List<WebElement> element = driver.findElements(editinpointofcontact);
		element.get(index).click();
		return this;
	}
	

                                                             //Welcome page
	
	public OnieChain clickondropdwnlist() {
		
		waitToBeClick(allstatus).click();
		return this;
	}
	
	public OnieChain dropdownForStatsus(int index) {
		
		List<WebElement> elements = driver.findElements(Dropdownstatus);	
		elements.get(index).click();
		return this;
	}
	
	public OnieChain toOpentheMenuBar() throws Throwable {
		
		waitToBeClick(toopenmenubar).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain toClosetheMenuBar() throws Throwable {
		
		waitToBeClick(toclosemenuebar).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain clickonBusinessProfilsButton() throws Throwable {
		
		waitToBeClick(businesprofil).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain clickonRyvylEmployeeButton() throws Throwable {
		waitToBeClick(Ryvylemployeebutton).click();
		Thread.sleep(1000);
		return this;
	}
	public OnieChain clickOnDoneButtoninRyvyl() throws Throwable {
		
		waitToBeClick(donebuttoninryvyemp).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain clickOnExportMenuButton() throws Throwable {
		
		waitToBeClick(exportbutton).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain clickonStatusKeyButton() throws Throwable {
		waitToBeClick(ststuskey).click();
		Thread.sleep(1000);
		
		return this;
	}
	
	public OnieChain CancleButtonX() throws Throwable {
		
		waitToBeClick(closeXsymboleBy).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain searchWithcmpnyNameORID(String name) throws Throwable {
		
	       waitToBeClick(searchbox)
	                         .sendKeys(name,Keys.ENTER);
	       Thread.sleep(1000);
		return this;
	}
	
	public OnieChain accountStatusDropdowntochangeState(int index, String reson) throws Throwable  {
		waitToBeClick(clickonststusdropdown).click();
		Thread.sleep(1000);
				List<WebElement> elem = driver.findElements(selectstatusindropdown);	
		elem.get(index).click();
		Thread.sleep(1000);
		waitToBeClick(writeresontochange).sendKeys(reson);
		Thread.sleep(1000);
		waitToBeClick(clickcheckboxtoapply).click();
		Thread.sleep(1000);
	//	waitToBeClick(applychanges).click();	
		
		return this;
		
	}
	
	public OnieChain clickonApplyChangesForStatus() throws Throwable {
		
		waitToBeClick(applychanges).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain multileelementsofprofile(int index) throws Throwable {
	    List<WebElement> elem = driver.findElements(By.xpath("//a[contains(@class,'      ')]"));  
	    elem.get(index).click();
	    Thread.sleep(1000);
	    return this;   
	}
	
	                                                    //business info
	
	public OnieChain editinBusinessinfo() {
		waitToBeClick(editinbusinessinfo).click();
		return this;
		}
	
	public OnieChain editCompanyName(String name) throws Throwable {
		
		 WebElement elem = waitToBeClick(editcompanyname);
			     elem .clear();
			     Thread.sleep(1000);
			     elem.sendKeys(name);
			     return this;		     
	}
	
	public OnieChain selectBusinesslistInEdit(int index) {
		 List<WebElement> elem = driver.findElements(selectbusinessineditpage);
		elem.get(index).click();
		return this;
	}
	
	public OnieChain editCompanyEmail(String name) throws Throwable {
		
		 WebElement elem = waitToBeClick(editcompanyemai);
			     elem .clear();
			     Thread.sleep(1000);
			     elem.sendKeys(name);
			     return this;		     
	}
	
	public OnieChain editMailingAddress1(String name) throws Throwable {
		
		 WebElement elem = waitToBeClick(editaddress1);
			     elem .clear();
			     Thread.sleep(1000);
			     elem.sendKeys(name);
			     return this;		     
	}
	
	public OnieChain editMailingAddress2(String name) throws Throwable {
		
		 WebElement elem = waitToBeClick(editaddress2);
			     elem .clear();
			     Thread.sleep(1000);
			     elem.sendKeys(name);
			     return this;		     
	}
	
	public OnieChain editCityName(String name) throws Throwable {
		
		 WebElement elem = waitToBeClick(editcityname);
			     elem .clear();
			     Thread.sleep(1000);
			     elem.sendKeys(name);
			     return this;		     
	}
	
	public OnieChain editStateName(String name) throws Throwable {
		
		 WebElement elem = waitToBeClick(editstate);
			     elem .clear();
			     Thread.sleep(1000);
			     elem.sendKeys(name);
			     return this;		     
	}
	
	public OnieChain editZipCode(String name) throws Throwable {
		
		 WebElement elem = waitToBeClick(editzipcode);
			     elem .clear();
			     Thread.sleep(1000);
			     elem.sendKeys(name);
			     return this;		     
	}
	
	public OnieChain SelectContryInEditPage(String name) throws Throwable {
		
		waitToBeClick(clickoncountrydrp).click();
		Thread.sleep(1000);
		waitToBeClick(sendcontryname).sendKeys(name);
		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(listofcountrys);
	    for(int i= 0;i<=elements.size()-1;i++) {
	    	String e = elements.get(i).getText();
	    	System.out.println(e);
	    	if (e.equalsIgnoreCase(name)) {
	    		Thread.sleep(1000);
	    	}
				waitToBeClick(listofcountrys).click();
			}
	    	Thread.sleep(1000);
	   // 	elements.get(index).click();
	   
		
		return this;
		
	}
	
	public OnieChain clickOnSaveForModifiedData() throws Throwable {
		
		waitToBeClick(clickonsavetomodifiedchanges).click();
		Thread.sleep(1000);
			     return this;		     
	}
	
	
	public OnieChain canclinbusinessinfo() throws Throwable {
		
		waitToBeClick(cancleinbusinessinfo).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain AdddocumentinBussinfoEdit() {
		
		waitToBeClick(adddocumntinbusinessedit).click();
		return this;
	}
	
	
	                                                 //point of contact page
	
	public OnieChain clickOn3DotstoEditOrRemove(int index, int editorremove) throws Throwable {
		
		 List<WebElement> elements = driver.findElements(clickon3dotsiconbn);
		
		elements.get(index).click();
		Thread.sleep(1000);
		List<WebElement> editorremv = driver.findElements(clickteEditorremove);
		editorremv.get(editorremove).click();
		return this;
	}	
	
	public OnieChain listofContactescreated(int index) {
		
		List<WebElement> createdcnts = driver.findElements(createdcontactlist);
		createdcnts.get(index).click();
		return this;
	}
	
	public OnieChain toRemoveContact() throws Throwable {
		
		waitToBeClick(remove).click();
		Thread.sleep(1000);
		return this;
	}
	
	
	public OnieChain clickonplusIconToCreateNewContact(int index) throws Throwable {
		
		List<WebElement> elements = driver.findElements(addnewcontact);
		
		elements.get(index).click();
		Thread.sleep(1000);
		
		return this;
		}
	
	public OnieChain clickoncreatenew() throws Throwable {
		
		waitToBeClick(createnewcontct).click();
		Thread.sleep(1000);
		return this;
	}
	
                                                             	//configurations
	
	public OnieChain clickonNodesinConfiguration() throws Throwable {
		waitToBeClick(nodes).click();
		Thread.sleep(1000);
		return this;
		
	}
	
	public OnieChain clickonApikeysinconfigratin() throws Throwable {
		
		waitToBeClick(apikeys).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain clickOnGenerateNewApiKey() throws Throwable {
		waitToBeClick(generatenewkey).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain clickonWebhooksinconfigration() throws Throwable {
		
		waitToBeClick(webhooks).click();
		Thread.sleep(1000);
		return this;
	}
	
	public OnieChain clickonCreateEndPoint() throws Throwable {
		
		waitToBeClick(createendpoint).click();
	return this;
				
	}
	
	public OnieChain addDataInWebhook(String Url, String Des ) throws Throwable {
		WebElement url = waitToBeClick(addurl);
		url.clear();
		Thread.sleep(1000);
		url.sendKeys(Url);
		Thread.sleep(1000);
		WebElement enddes = waitToBeClick(endpointdescription);
		enddes.clear();
		
		enddes.sendKeys(Des);
		Thread.sleep(1000);
		return this;

	}
	public OnieChain AddbuttoninWebook() throws Throwable {
			
			waitToBeClick(addbutton).click();
			Thread.sleep(1000);
			return this;
	}
	public OnieChain editWebhook() throws Throwable {
		waitToBeClick(editwebhook).click();
		Thread.sleep(1000);
		
		return this;
	}
	
	public OnieChain clickonIpAddressinConfigrations() {
		
		waitToBeClick(ipaddress).click();
		return this;
	}
	
	public OnieChain clickOnAddIpAddress(String ipadd,String ipdes) throws Throwable {
		
	      waitToBeClick(addipddress).click();
	      Thread.sleep(1000);
	      WebElement ip = waitToBeClick(ipaddresstext);
	      ip.clear();
	      Thread.sleep(1000);
	      ip.sendKeys(ipadd);
	      Thread.sleep(1000);
	      WebElement des = waitToBeClick(descriptionofipaddress);
	     
	      Thread.sleep(1000);
	      des.sendKeys(ipdes);
		
		
		return this;
		
	}
	
	public OnieChain clickonActivLoginConfigrations() {
		
		waitToBeClick(activel).click();
		return this;
	}

}
