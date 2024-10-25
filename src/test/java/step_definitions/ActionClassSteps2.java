package step_definitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Webpage2;

public class ActionClassSteps2 {
    Webpage2 webpage2 = new Webpage2();

    @When("Kullanici havayollari alanindan Turk hava yollarini secer")
    public void kullanici_havayollari_alanindan_turk_hava_yollarini_secer() {
        webpage2.clickAirlinesSection();

    }
    @When("Kullanici enucuz sekmesine tiklar")
    public void kullanici_enucuz_sekmesine_tiklar() {
        webpage2.clickTurkishAirlines();

    }
    @Then("Ucuzdan pahaliya dogru siralandigi dogrulanir")
    public void ucuzdan_pahaliya_dogru_siralandigi_dogrulanir() {
        webpage2.checkPriceSection();


    }

}
