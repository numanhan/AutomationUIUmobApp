package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import screen.LaunchScreen;

public class LaunchTest extends BaseTest {
    LaunchScreen launchScreen = new LaunchScreen(driver);


    @Step("Check the available button and click")
    public void testAvailableButton() {
        launchScreen.clickAvailableButton();
    }
    @Step("Close the launch screen")
    public void checkButton(){
        launchScreen.clickCloseButton();

    }
}
