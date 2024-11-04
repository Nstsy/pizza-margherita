import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MenuPage {
    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public MenuPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public MenuPage clickButtonPizza(){
        webDriver.findElement(By.xpath(MenuPageXpath.BUTTON_PIZZA)).click();
        return this;
    }

    public MenuPage clickButtonOrder(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenuPageXpath.BUTTON_ORDER))).click();
        return this;
    }

    public MenuPage clickButtonChooseDough(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenuPageXpath.BUTTON_CHOOSE_DOUGH))).click();
        return this;
    }

    public MenuPage clickButtonChooseSize(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenuPageXpath.BUTTON_CHOOSE_SIZE))).click();
        return this;
    }

    public MenuPage clickButtonOrder2(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenuPageXpath.BUTTON_ORDER_2))).click();
        return this;
    }

    public MenuPage clickButtonBasket(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenuPageXpath.BUTTON_BASKET))).click();
        return this;
    }

    public String getMessagePizzaField() {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MenuPageXpath.PIZZA_FIELD))).getText();
    }

    public MenuPage clickButtonDrinks(){
        webDriver.findElement(By.xpath(MenuPageXpath.BUTTON_DRINKS)).click();
        return this;
    }

    public MenuPage clickButtonWater(){
        webDriver.findElement(By.xpath(MenuPageXpath.BUTTON_WATER)).click();
        return this;
    }

    public String getMessageDrinkWaterField() {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MenuPageXpath.DRINK_WATER_FIELD))).getText();
    }
}
