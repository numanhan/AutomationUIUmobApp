package screen;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LaunchScreen extends BasePage {
    public LaunchScreen(AndroidDriver driver) {
        super(driver);
    }

    public static final By welcomeText = By.xpath("//*[@text='Welcome to umob']");
    public static final By closeButton = By.id("com.umob.umob:id/intercom_close");
    public static final By getStartedButton = By.xpath("//android.widget.TextView[@text=\"Let's get started\"]\n");
    public static final By nextButton = By.xpath("//android.widget.TextView[contains(@content-desc, 'Next')]");

    public String getWelcomeTitle(){
        String welcomeTitle = getText(welcomeText);
        return welcomeTitle;
    }

    public void clickAvailableButton() {
        String[] xPaths = {
                "//android.widget.TextView[@text='Next']",
                "//android.widget.TextView[@text=\"Let's get started\"]"
        };

        for (String xPath : xPaths) {
            try {
                WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
                if (button.isDisplayed()) {
                    button.click();
                    break;
                }
            } catch (Exception e) {
                continue;
            }
        }
    }

    public void clickCloseButton(){
        isVisible(closeButton);
        clickElement(closeButton);
    }
}
