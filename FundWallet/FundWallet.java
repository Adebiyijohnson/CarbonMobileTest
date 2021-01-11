package io.testproject.generated.tests.Carbonproject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

@DisplayName("Fund wallet")
public class FundWallet implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("4BZZXS1_gctCXzw1wLkVVv6mDl83VMNh99WzbQCDxrg", getCapabilities(), "Olajide O");
  }

  @DisplayName("Fund wallet")
  @Test
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Click 'com.lenddo.mobile.paylater.staging:id...11'
    GeneratedUtils.sleep(500);
    by = By.id("com.lenddo.mobile.paylater.staging:id/fundWalletButton");
    driver.findElement(by).click();

    // 2. Click 'com.lenddo.mobile.paylater.staging:id...7'
    GeneratedUtils.sleep(500);
    by = By.id("com.lenddo.mobile.paylater.staging:id/constraint_fund_with_card");
    driver.findElement(by).click();

    // 3. Click '0.00'
    GeneratedUtils.sleep(500);
    by = By.id("com.lenddo.mobile.paylater.staging:id/walletAmountToFund");
    driver.findElement(by).click();

    // 4. Type '1000' in '0.00'
    GeneratedUtils.sleep(500);
    by = By.id("com.lenddo.mobile.paylater.staging:id/walletAmountToFund");
    driver.findElement(by).sendKeys("1000");

    // 5. Tap at ('934','2122') with '1' fingers for '100'ms
    GeneratedUtils.sleep(500);
    MultiTouchAction multiTouch = new MultiTouchAction((driver));
        for (int i = 0; i < 1; i++) {
        	multiTouch.add((new TouchAction(((AppiumDriver<WebElement>) driver))).press(PointOption.point(934,2122))
        			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100))).release());
        }
        multiTouch.perform();

    // 6. Tap at ('959','2115') with '1' fingers for '100'ms
    GeneratedUtils.sleep(500);
    MultiTouchAction multiTouch = new MultiTouchAction((driver));
        for (int i = 0; i < 1; i++) {
        	multiTouch.add((new TouchAction(((AppiumDriver<WebElement>) driver))).press(PointOption.point(959,2115))
        			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100))).release());
        }
        multiTouch.perform();

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  public static DesiredCapabilities getCapabilities() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    capabilities.setCapability(MobileCapabilityType.UDID, "MQXX1912H56I104736");
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "YOUR_APP_PACKAGE");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "YOUR_APP_ACTIVITY");
    capabilities.setCapability(MobileCapabilityType.APP, "APP_FILE_PATH");
    return capabilities;
  }
}
