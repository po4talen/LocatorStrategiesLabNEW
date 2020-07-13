package com.mainacad;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.control.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Lab
{
    private static final By HEADER = By.xpath("//div[@class='main-header']");
    private static final By FIRSTNAME = By.xpath("/html//input[@id='firstName']");
   // private static final By RARIO = By.xpath();

    public static void main( String[] args )
    {

        //Создаём системную переменную которая содержит путь к драйверу
        //   System.setProperty("webdriver.chrome.driver","D:\\Java\\Tools\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();
                //Открываем тестовую страницу
        driver.get("https://demoqa.com/automation-practice-form");

        //TODO: Вывести в консоль текст Инфо сообщения

       // System.out.println();

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        System.out.println("Текст заголовка" + " " + driver.findElement(HEADER).getText());

        //TODO: Кликнуть линк Partial Link Test
      //  driver.findElement(By.partialLinkText("Forms")).click();

        //TODO: Заполнить поле First name:
        driver.findElement(FIRSTNAME).sendKeys("Ivan");

        //TODO: Заполнить поле Last name:
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Bob");
        // TODO: Заполнить поле Email
        driver.findElement(By.id("userEmail")).sendKeys("Po4ta@gmail.com");

        //TODO: Выбрать пол
        WebElement radio = driver.findElement(By.xpath("//*[@id='gender-radio-1']/.."));
        radio.click();

        //TODO: Заполнить поле Phone
        driver.findElement(By.xpath("/html//input[@id='userNumber']")).sendKeys("09912345678");
        //TODO: Выбрать дату рождения
        driver.findElement(By.cssSelector("input#dateOfBirthInput")).click();
       //WebElement dropdownMounth = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
        Select selecvalue = new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select")));
        selecvalue.selectByValue("February");
        //TODO: Заполнить поле дата

        //TODO: Выбрать несколько Automation Tool

        //TODO: Выбрать континент из выпадающего списка

        //TODO: Выбрать несколько вариантов из списка Selenium Commands

        //TODO: Кликнуть на кнопку Button

        //TODO: Закрыть браузер

    }
}
