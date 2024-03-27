package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HorizontalSliderPage {
    private By sliderRange = By.id("range");
    private By slider = By.cssSelector("input[type='range']");
    private WebDriver driver;
    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterKey(String number) {
        driver.findElement(slider).sendKeys(number);
    }

    public void enterNumber() {
        enterKey(Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT));
    }

    public String getSliderResult() {
        return driver.findElement(sliderRange).getText();
    }

}
