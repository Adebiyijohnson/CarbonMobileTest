package io.testproject.generated.tests.myfirstproject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

@DisplayName("Carbon App Test (View Transactions)")
public class CarbonAppTestviewTransactions implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("4BZZXS1_gctCXzw1wLkVVv6mDl83VMNh99WzbQCDxrg", getCapabilities(), "Olajide O");
  }

  @DisplayName("Carbon App Test (View Transactions)")
  @Test
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Click 'com.lenddo.mobile.paylater.staging:id...9'
    GeneratedUtils.sleep(500);
    by = By.id("com.lenddo.mobile.paylater.staging:id/viewWalletTransactionsButton");
    driver.findElement(by).click();

    // 3. Send key event '4'
    GeneratedUtils.sleep(500);
    driver.pressKey(new KeyEvent(Arrays.stream(AndroidKey.values()).filter(k -> k.getCode() == 4).findFirst().get()));

    // 4. Click 'com.lenddo.mobile.paylater.staging:id...9'
    GeneratedUtils.sleep(500);
    by = By.id("com.lenddo.mobile.paylater.staging:id/viewWalletTransactionsButton");
    driver.findElement(by).click();

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
