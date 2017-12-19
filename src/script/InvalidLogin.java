package script;

import org.testng.annotations.Test;

import generic.AUL;
import generic.BaseTest;
import page.LoginPage;

public class InvalidLogin extends BaseTest{
@Test(priority=2,groups="login")
public void testInvalidLogin() {
	int rc=AUL.getRowCount(XL_PATH,"InvalidLogin");
	for(int i=1;i<=rc;i++) {
	String un=AUL.getCellValue(XL_PATH,"InvalidLogin",i,0);
	String pw=AUL.getCellValue(XL_PATH,"InvalidLogin",i,1);
	//Enter invalid user name
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//Enter invalid password
	l.setPassword(pw);
	//click on login
	l.clickLogin();
	//verify err msg is displayed
	l.verifyErrMsgIsDisplayed(driver);
	
	}
}
}
