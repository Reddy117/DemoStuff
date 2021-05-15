package com.freecrm.steps;

import org.openqa.selenium.By;

import com.freecrm.base.BaseClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestSteps extends BaseClass{


@Given("^User opens browser$")
public void user_opens_browser() throws Throwable {
    initialize("chrome");
}

@Given("^User logged in to the site$")
public void user_logged_in_to_the_site() throws Throwable {
   driver.findElement(By.xpath(uNamex)).sendKeys(config.getProperty("uName"));
   driver.findElement(By.xpath(passWordx)).sendKeys(config.getProperty("passWord"));
   driver.findElement(By.xpath(loginbtnx)).click();
}

@When("^Using \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" user create company$")
public void using_and_and_and_and_and_user_create_company(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
   driver.findElement(By.xpath(companiesx)).click();
   driver.findElement(By.xpath(newBtnx)).click();
   driver.findElement(By.xpath(cNamex)).sendKeys(arg1);
   driver.findElement(By.xpath(cWebx)).sendKeys(arg2);
   driver.findElement(By.xpath(addressx)).sendKeys(arg3);
   driver.findElement(By.xpath(cityx)).sendKeys(arg4);
   driver.findElement(By.xpath(statex)).sendKeys(arg5);
   driver.findElement(By.xpath(zipx)).sendKeys(arg6);
   driver.findElement(By.xpath(savebtnx)).click();
}

}
