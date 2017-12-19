package script;

import org.testng.annotations.Test;

import generic.AUL;
import generic.BaseTest;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest{
@Test(priority=1,groups={"login","smoke"})
public void testValidLogin() {
	String un=AUL.getCellValue(XL_PATH,"ValidLogin",1,0);
	String pw=AUL.getCellValue(XL_PATH,"ValidLogin",1,1);
	String eTitle=AUL.getCellValue(XL_PATH,"ValidLogin",1,2);
	//Enter Valid user name
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//Enter valid password
	l.setPassword(pw);
	//Click on login
	l.clickLogin();
	//Verify Home page is Displayed
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.verifyTitle(driver,eTitle);
}
}



