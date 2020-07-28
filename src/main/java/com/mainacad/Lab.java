package com.mainacad;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.control.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import sun.awt.windows.WEmbeddedFrame;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Lab {
    public static final String URL = "https://demoqa.com/automation-practice-form";
    private static final By HEADER = By.xpath("//div[@class='main-header']");
    private static final By FIRSTNAME = By.xpath("/html//input[@id='firstName']");
    private static final By LASTNAME = By.cssSelector("#lastName");
    private static final By EMAIL = By.id("userEmail");
    private static final By MALE = By.xpath("//*[@id='gender-radio-1']/..");
    private static final By NUMBER = By.id("userNumber");
    private static final By CALENDAR = By.cssSelector("input#dateOfBirthInput");
    private static final By MONTH = By.cssSelector(".react-datepicker__month-select");
    private static final By YEAR = By.cssSelector(".react-datepicker__year-select");
    private static final By DAY = By.cssSelector(".react-datepicker__week:nth-of-type(1) [tabindex='-1']:nth-of-type(2)");
    private static final By SUBJECT = By.xpath("/html//input[@id='subjectsInput']");
    private static final By HOBBY = By.xpath("//*[contains(text(),'Sports')]");
    private static final By UPLOADPICTURE = By.id("uploadPicture");
    private static final By ADDRESS = By.id("currentAddress");
    private static final By STATE = By.cssSelector("div#state .css-1wa3eu0-placeholder");
    private static final By SUBMIT = By.id("submit");
    public static final By CLOSE = By.id("closeLargeModal");

    public static void main(String[] args) {
        //Создаём системную переменную которая содержит путь к драйверу
        //   System.setProperty("webdriver.chrome.driver","D:\\Java\\Tools\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();
        //Открываем тестовую страницу
        driver.get(URL);
        driver.manage().window().maximize();

        //TODO: Вывести в консоль текст Инфо сообщения
        System.out.println("AUTOMATION TESTS");
        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        System.out.println("Текст заголовка" + " " + driver.findElement(HEADER).getText());
        //TODO: Кликнуть линк Partial Link Test
        //  driver.findElement(By.partialLinkText("Forms")).click();
        //TODO: Заполнить поле First name:
        WebElement firstname = driver.findElement(FIRSTNAME);
        firstname.sendKeys("Ivan");
        //TODO: Заполнить поле Last name:
        WebElement lastname = driver.findElement(LASTNAME);
        lastname.sendKeys("Bob");
        // TODO: Заполнить поле Email
        WebElement email = driver.findElement(EMAIL);
        email.sendKeys("Po4ta@gmail.com");
        //TODO: Выбрать пол
        WebElement male = driver.findElement(MALE);
        male.click();
        //TODO: Заполнить поле Phone
        WebElement number = driver.findElement(NUMBER);
        number.sendKeys("09912345678");
        //TODO: Кликаем на календарь
        WebElement calendar = driver.findElement(CALENDAR);
        calendar.click();
        //TODO: Выбираем месяц
        WebElement month = driver.findElement(MONTH);
        month.sendKeys("February");
        //TODO: Выбираем год
        WebElement year = driver.findElement(YEAR);
        year.sendKeys("1987");
        //TODO: Выбираем день
        WebElement day = driver.findElement(DAY);
        day.click();
        //TODO: Выбираем subject
        WebElement subject = driver.findElement(SUBJECT);
        subject.sendKeys("Eng");
        subject.sendKeys(Keys.ENTER);
        //TODO: Выбираем хобби
        WebElement hobby = driver.findElement(HOBBY);
        hobby.click();
        //TODO: Upload Picture
        WebElement uploadPicture = driver.findElement(UPLOADPICTURE);
        uploadPicture.sendKeys("C:\\Users\\i.matsiuk\\Downloads\\Toolsqa.jpg");
        //TODO: Enter Address
        WebElement address = driver.findElement(ADDRESS);
        address.sendKeys("Pirohova");
        //TODO: Select State
        //WebElement state = wait.until(ExpectedConditions.elementToBeClickable(STATE)); почему не работает
        WebElement state = driver.findElement(STATE);
        state.click();
        state.sendKeys("NCR");
        state.sendKeys(Keys.ENTER);
        //TODO: Кликнуть на кнопку Button Submit
        WebElement submit = driver.findElement(SUBMIT);
        //  js.executeScript("arguments[0].scrollIntoView();", submit);  почему не работает
        submit.click();

        //TODO: Закрыть браузер
        WebElement close = driver.findElement(CLOSE);
        close.click();

        driver.close();
    }
}
