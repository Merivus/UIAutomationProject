package pageModels;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel extends Driver {

    Actions actions;

    public  BaseModel() {
        PageFactory.initElements(webDriver, this);
        actions = new Actions(webDriver);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void sendKeys(WebElement element, String text){
        element.sendKeys(text);
    }

    public void clear(WebElement element){
        element.clear();
    }

    public void scrollDownToBottom(){
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }
}