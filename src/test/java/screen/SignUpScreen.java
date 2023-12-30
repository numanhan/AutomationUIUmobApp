package screen;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SignUpScreen extends BasePage {
    public SignUpScreen(AndroidDriver driver) {
        super(driver);
    }

    public static final By signupTitle = By.xpath("//android.view.ViewGroup[@content-desc=\"container\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
    public static final By signUpButton = By.xpath("//android.view.ViewGroup[@content-desc=\"container\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup");
    public String title = "Create a umob account to start using this service";
    public static final By signUpButtonGetText = By.xpath("//android.widget.TextView[@content-desc=\"undefined-text\"]");
    public String signUpButtonText = "SIGN UP WITH YOUR EMAIL";

    public void checkTitle(){
        assertTextEquals(signupTitle,title);
    }
    public void buttonText(){
        assertTextEquals(signUpButtonGetText,signUpButtonText);
    }

    public void clickButton(){
        clickElement(signUpButton);
    }
}
