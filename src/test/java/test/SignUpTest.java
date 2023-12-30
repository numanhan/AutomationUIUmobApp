package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import screen.SignUpScreen;

public class SignUpTest extends BaseTest {

    SignUpScreen signUpScreen = new SignUpScreen(driver);

    @Step("Check title of signup screen")
    public void checkSignupScreenTitle() {
        signUpScreen.checkTitle();
    }

    @Step("Check signup button text")
    public void checkSignupButtonText() {
        signUpScreen.buttonText();
        signUpScreen.clickButton();
    }
}
