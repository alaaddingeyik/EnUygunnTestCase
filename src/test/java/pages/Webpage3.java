package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtilities;

public class Webpage3 extends AbstractBasePage{

    @FindBy(xpath = "//span[contains(text(),'Giriş yap')]")
    protected WebElement homePageLogin;
    @FindBy(name = "email")
    protected WebElement eMail;
    @FindBy(name = "password")
    protected WebElement password;
    @FindBy(xpath = "//button[@class='sc-bypJrT iumqdI']")
    protected WebElement logInButton;
    @FindBy(xpath = "//div[contains(text(),'Lütfen e-posta adresi veya şifreyi kontrol edip yeniden deneyin.')]")
    protected WebElement alert;

    public void clickLogin(){
        BrowserUtilities.wait(5);
        homePageLogin.click();
    }
    public void clicklogInButton(){
        eMail.click();
        eMail.sendKeys("alaaddin.geyik@gmail.com");
        password.click();
        password.sendKeys("12345678");
        BrowserUtilities.wait(3);
        password.sendKeys(Keys.ENTER);
    }
    public void clickLoginPage(){
        BrowserUtilities.wait(3);

    }
    public void clickAlert(){
        BrowserUtilities.wait(2);
        Assert.assertTrue("Alert görünmedi, kontrol ediniz!", alert.isDisplayed());
        String alertMessage = alert.getText();
        System.out.println("Alert Mesajı: " + alertMessage);
        Assert.assertTrue("Beklenen mesaj görünmedi", alertMessage.contains("Lütfen e-posta adresi veya şifreyi kontrol edip yeniden deneyin."));
    }
}

