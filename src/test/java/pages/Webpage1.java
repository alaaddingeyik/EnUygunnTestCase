package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtilities;
import java.time.Duration;

public class Webpage1 extends AbstractBasePage {

    @FindBy(css = "div[data-testid='search-round-trip-text']")
    protected WebElement roundTripButton;
    @FindBy(xpath = "//input[@name='origin']")
    protected WebElement fromCity;

    @FindBy(css = "div[data-testid*='istanbul']")
    protected WebElement clickCity1;

    @FindBy(xpath = "//input[@name='destination']")
    protected WebElement toCity;

    @FindBy(css = "div[data-testid*='ankara']")
    protected WebElement clickCity;

    @FindBy(css = "input[data-testid='enuygun-homepage-flight-departureDate-datepicker-input']")
    protected WebElement departureDate;

    @FindBy(css = "div[data-testid='enuygun-homepage-flight-returnDate-datepicker-popover-button']")
    protected WebElement returnDate;

    @FindBy(xpath = "//input[@value='1 Yolcu / Ekonomi']")
    protected WebElement passengers;

    @FindBy(xpath = "//button[contains(@data-testid, 'flight-adult-counter-plus-button')]")
    protected WebElement countSection;

    @FindBy(css = "div[data-testid='enuygun-homepage-flight-cabin-economy']")
    protected WebElement economyClass;

    @FindBy(css = "div[data-testid='enuygun-homepage-flight-cabin-business']")
    protected WebElement businessClass;


    @FindBy(xpath = "//button[@data-testid='enuygun-homepage-flight-doneBtn']")
    protected WebElement submitButton;

    @FindBy(css = "button[data-testid='enuygun-homepage-flight-submitButton']")
    protected WebElement flightSubmitButton;

    @FindBy(xpath = "//div[@class='flight-list-date-curr']")
    protected WebElement checkPage;

    @FindBy(xpath = "(//span[@class='card-title'])[4]")
    protected WebElement flightTimeFilter;

    @FindBy(xpath = "//div[@data-testid='departureDepartureTimeSlider']")
    protected WebElement flightTimeDeparture;

    @FindBy(xpath = "//div[contains(@class,'search__filter_departure')]//div[5]")
    protected WebElement flightTimeReturn;

    @FindBy(xpath = "(//div[@class='filter-slider-content'])[1]")
    protected WebElement checkResult;



    public void clickRoundTripButton(){
        BrowserUtilities.wait(2);
        roundTripButton.click();
    }

    public void clickFromcity(String departureCity){
        BrowserUtilities.wait(2);
        fromCity.click();
        fromCity.sendKeys(departureCity);
        BrowserUtilities.wait(2);
        clickCity1.click();
    }
    public void clickToCity(String arrivalCity){
        BrowserUtilities.wait(2);
        toCity.click();
        toCity.sendKeys(arrivalCity);
        BrowserUtilities.wait(2);
        clickCity.click();
    }
    public void clickDepartureDate(String departureDatee){
        BrowserUtilities.wait(2);
        departureDate.click();
        BrowserUtilities.wait(1);
        WebElement dateButton = driver.findElement(By.xpath("//button[@title='" + departureDatee + "']"));
        dateButton.click();

    }
    public void clickReturnDate(String returnDatee){
        BrowserUtilities.wait(2);
        returnDate.click();
        BrowserUtilities.wait(1);
        WebElement dateButton = driver.findElement(By.xpath("//button[@title='" + returnDatee + "']"));
        dateButton.click();
    }

    public void clickPassenger(){
        BrowserUtilities.wait(1);
        passengers.click();
    }

    public void clickCountSection(int passengerCount){
        BrowserUtilities.wait(2);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement plusButton = wait.until(ExpectedConditions.elementToBeClickable(countSection));
        for (int i = 0; i < passengerCount; i++) {
            plusButton.click();
            BrowserUtilities.wait(1);
        }
    }
    public void clickSelectFlightClass(String flightClass){

        if (flightClass.equalsIgnoreCase("Economy")) {
            economyClass.click();
        } else if (flightClass.equalsIgnoreCase("Business")) {
            businessClass.click();
        }
        BrowserUtilities.wait(2);

    }
    public void clickSubmitButton(){
        submitButton.click();
        BrowserUtilities.wait(1);
    }
    public void clickFlightSubmitButton(){

        flightSubmitButton.click();
    }
    public boolean isResultsPageDisplayed() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement visible = wait.until(ExpectedConditions.visibilityOf(checkPage));
            return checkPage.isDisplayed();
        } catch (Exception e) {
            System.out.println("Sonuç sayfası yüklenmedi veya görünür olmadı.");
            return false;
        }
    }
    public void clickFlightTimeFilter() {
        BrowserUtilities.wait(2);
        flightTimeFilter.click();
    }
    public void setDepartureAndReturnTimeSliders(int xOffsetDeparture, int xOffsetReturn) {
        BrowserUtilities.wait(2);

        Actions move = new Actions(driver);
        move.dragAndDropBy(flightTimeDeparture, xOffsetDeparture, -25).perform();
        BrowserUtilities.wait(2);

        Actions moveReturn = new Actions(driver);
        moveReturn.dragAndDropBy(flightTimeReturn, xOffsetReturn, +50).perform();
        BrowserUtilities.wait(2);
    }
    public void checkResultPage(){
        Assert.assertTrue("Slider content is not visible!", checkResult.isDisplayed());
        String sliderText = checkResult.getText();
        Assert.assertEquals(sliderText, "10:00 ile 18:00 arası");
    }

    }















