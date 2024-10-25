package step_definitions;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Webpage3;

public class ActionsClassStep3{

    Webpage3 webpage3 = new Webpage3();

    @When("Ana sayfadaki giris yap butonuna tiklanir")
    public void ana_sayfadaki_giris_yap_butonuna_tiklanir() {
        webpage3.clickLogin();
    }
    @When("Acilan ekrandan kayitli olmayan kullanici adi ve parola girilir")
    public void acilan_ekrandan_kayitli_olmayan_kullanici_adi_ve_parola_girilir() {
        webpage3.clicklogInButton();
    }
    @When("Giris yap butonuna tiklanir")
    public void giris_yap_butonuna_tiklanir() {
        webpage3.clickLoginPage();
    }
    @Then("Yanlis kullanici adi ve sifre pop up in geldigi goruntulenir")
    public void yanlis_kullanici_adi_ve_sifre_pop_up_in_geldigi_goruntulenir() {
        webpage3.clickAlert();
    }

}
