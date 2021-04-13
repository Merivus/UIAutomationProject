package tests;

import com.thoughtworks.gauge.Step;
import pageModels.CreditCalculationDetailModel;

public class CreditCalculationDetailTest {

    CreditCalculationDetailModel creditCalculationDetailModel;

    public CreditCalculationDetailTest() {
        creditCalculationDetailModel = new CreditCalculationDetailModel();
    }

    @Step("Click 'Hesaplama Detayları'")
    public void clickCalculationDetails(){
        creditCalculationDetailModel.clickCalculationDetails();
    }

    @Step("Check <key> is opened")
    public void checkCostRatio(String key){
        creditCalculationDetailModel.checkCost(key);
    }

    @Step("Click 'Ödeme Planı'")
    public void clickPayment(){
        creditCalculationDetailModel.clickPaymentPlan();
    }

    @Step("Scroll down on the 'Ödeme Planı' page until 20th is seen")
    public void scrollToElement() throws Exception {
        creditCalculationDetailModel.scrollToLastElement();
    }
}
