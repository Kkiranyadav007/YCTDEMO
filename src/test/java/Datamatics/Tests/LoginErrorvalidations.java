package Datamatics.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Datamatics.Grievancenumber;
import Datamatics.Homepage;
import Datamatics.Searchforvoucherbeneficiarypage;
import Datamatics.SubmitGrievancepage;
import Datamatics.Testcomponents.Basetest;

public class LoginErrorvalidations extends Basetest {
	
	
	@Test
public void Verifypassworderrorvalidation() throws IOException, InterruptedException {
		login.loginapplication("Kiran001","Test@123456789");
		Assert.assertEquals("Please verify entered password. Upon five failed attempts, your account will be inaccessible", login.getVerifypasswordErrormessage());	
}
	@Test
	public void Usernameerrorvalidation() throws IOException, InterruptedException {
		login.loginapplication("Kiran00","Test@12345678");
		Assert.assertEquals(" Username does not exist ", login.getUsernameErrormessage());
}
}
