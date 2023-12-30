package base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BaseTest {
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;

    private static String deviceName = "Pixel_3_API_34";
    private static String platformName = "Android";
    private static String appPackage = "com.umob.umob";
    private static String appActivty = "com.umob.umob.MainActivity";
    private static String url = "http://127.0.0.1:4723/wd/hub";

    @BeforeScenario
    public static void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("platformName", platformName);
        caps.setCapability("appPackage", appPackage);
        caps.setCapability("appActivity", appActivty);
        caps.setCapability("disable-popup-blocking", true);
        caps.setCapability("autoDismissAlerts", true);
        caps.setCapability("autoGrantPermissions", true);
        caps.setCapability("autoAcceptAlerts", true);
        caps.setCapability("noReset",false);
        driver = new AndroidDriver<MobileElement>(new URL(url), caps);
        wait = new WebDriverWait(driver, 10);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("Wait <seconds> seconds")
    public void waitOneSec(long time) throws InterruptedException {
        // TimeUnit.SECONDS.sleep(time);
    }

//    @Step("Turn back")
//    public void turnBack() {
//        //driver.navigate().back();
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
//    }

    @AfterScenario
    public static void teardown() {
        // driver.quit();
    }
}
