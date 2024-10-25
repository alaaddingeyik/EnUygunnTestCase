package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Webpage1;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class ActionClassSteps1 {
    Webpage1 webpage1 =new Webpage1();

    @Given("EnUygun.com Web sitesine gidilir")
    public void en_uygun_com_web_sitesine_gidilir() {
        BrowserUtilities.waitForPageToLoad(5);
        Driver.getDriver().get("https://www.enuygun.com");
    }
    @When("Kullanici Gidis donus secenegini secer")
    public void kullanici_gidis_donus_secenegini_secer() {
        webpage1.clickRoundTripButton();
    }
    @When("Kullanici kalkis sehri secenegini secer")
    public void kullanici_kalkis_sehri_secenegini_secer() {
        String departureCity = ConfigurationReader.getProperty("departureCity");
        webpage1.clickFromcity(departureCity);
    }
    @When("Kullanici varis sehri secenegini secer")
    public void kullanici_varis_sehri_secenegini_secer() {
        String arrivalCity = ConfigurationReader.getProperty("arrivalCity");
        webpage1.clickToCity(arrivalCity);
    }
    @When("Kullanici gidis tarihini secer")
    public void kullanici_gidis_tarihini_secer() {
        String departureDatee = ConfigurationReader.getProperty("departureDatee");
        webpage1.clickDepartureDate(departureDatee);
    }
    @When("Kullanici donus tarihini secer")
    public void kullanici_donus_tarihini_secer() {
        String returnDatee = ConfigurationReader.getProperty("returnDatee");
        webpage1.clickReturnDate(returnDatee);
    }
    @When("Kullanici yolcu sayisini secer")
    public void kullanici_yolcu_sayisini_secer() {
        webpage1.clickPassenger();
        String passengerCount = ConfigurationReader.getProperty("passengerCount");
        webpage1.clickCountSection(Integer.parseInt(passengerCount));
    }
    @When("Kullanici ucus sinifini secer")
    public void kullanici_ucus_sinifini_secer() {
        String flightClass = ConfigurationReader.getProperty("flightClass");
        webpage1.clickSelectFlightClass(flightClass);
    }
    @When("Kullanici secimi onaylar")
    public void kullanici_secimi_onaylar() {
        webpage1.clickSubmitButton();
    }
    @Then("Tercih edilen alanlar aratilir")
    public void tercih_edilen_alanlar_aratilir() {
        webpage1.clickFlightSubmitButton();
    }
    @When("Sayfanin acildigi kontrol edilir")
    public void sayfanin_acildigi_kontrol_edilir() {
        webpage1.isResultsPageDisplayed();
    }
    @When("Kullanici gidis kalkis varis saatleri fitresine tiklar")
    public void kullanici_gidis_kalkis_varis_saatleri_fitresine_tiklar() {
        webpage1.clickFlightTimeFilter();
    }
    @When("Kullanici filtreleme alanlarindan istenilen saat araligi secer")
    public void kullanici_filtreleme_alanlarindan_istenilen_saat_araligi_secer() {
        webpage1.setDepartureAndReturnTimeSliders(-23,-65);

    }
    @Then("Filtrele alnlarina gore goruntulendigi dogrulanir")
    public void filtrele_alnlarina_gore_goruntulendigi_dogrulanir() {
        webpage1.checkResultPage();

    }



}
