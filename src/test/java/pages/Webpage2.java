package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Webpage2 extends AbstractBasePage {


    @FindBy(css = ".ctx-filter-airline.card-header")
    protected WebElement airlinesSection;
    @FindBy(xpath = "//div[@class='collapse show']/div/label[3]//span[.='Türk Hava Yolları']")
    protected WebElement turkisAirlines;
    @FindBy(xpath = "//div[@id='SearchRoot']//div[@class='search-result-body']")
    protected WebElement checkPrice;


    public void clickAirlinesSection(){
        BrowserUtilities.wait(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        airlinesSection.click();
    }
    public void clickTurkishAirlines(){
        BrowserUtilities.wait(2);
        turkisAirlines.click();
    }
    public void checkPriceSection(){
        List<WebElement> priceElements = checkPrice.findElements(By.xpath("//span[contains(@class, 'price')]"));
        List<Double> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replace(" TL", "").replace(",", "");
            prices.add(Double.parseDouble(priceText));
        }

        List<Double> sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices);

        if (prices.equals(sortedPrices)) {
            System.out.println("Fiyatlar artan sırada listelenmiştir.");
        } else {
            System.out.println("Fiyatlar artan sırada değil!");
        }
        BrowserUtilities.wait(4);
    }

    }



