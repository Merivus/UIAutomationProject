package tests;

import com.thoughtworks.gauge.Step;
import pageModels.CreditCalculationModel;

public class CreditCalculationTest {

    CreditCalculationModel creditCalculationModel;

    public CreditCalculationTest() {
        creditCalculationModel = new CreditCalculationModel();
    }

    @Step("Enter <key>TL in 'TUTAR' field")
    public void setCreditPrice(String key){
        creditCalculationModel.setCreditPrice(key);
    }

    @Step("Choose <key> in the button")
    public void chooseInsurance(String key){
        creditCalculationModel.chooseInsurance(key);
    }

    @Step("Set VADE as <key> in the bar")
    public void chooseMaturity(String key){
        creditCalculationModel.chooseMaturity(key);
    }
}
