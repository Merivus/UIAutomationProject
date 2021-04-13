package tests;

import com.thoughtworks.gauge.Step;
import pageModels.BaseModel;
import pageModels.HomeModel;

public class HomeTest {

    HomeModel homeModel;
    BaseModel baseModel;

    public HomeTest() {
        homeModel = new HomeModel();
        baseModel = new BaseModel();
    }

    @Step("Enter <key> Akbank Home Page")
    public void goToUrl(String key) throws Exception {
        homeModel.goToUrl(key);
    }

    @Step("Scroll down to the bottom of the page")
    public void scrollDownToBottom(){
        baseModel.scrollDownToBottom();
    }

    @Step("Click on 'Kredi Hesaplama'")
    public void clickCalculator(){
        homeModel.clickCalculator();
    }
}
