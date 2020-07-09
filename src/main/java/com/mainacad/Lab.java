package com.mainacad;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Lab
{
    private static final By HEADER = By.xpath("//div[@class='main-header']");

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
        driver.findElement(By.partialLinkText("Forms")).click();

        //TODO: Заполнить поле First name:

        //TODO: Заполнить поле Last name:

        //TODO: Выбрать пол

        //TODO: Выбрать количество лет опыта

        //TODO: Заполнить поле дата

        //TODO: Выбрать несколько Automation Tool

        //TODO: Выбрать континент из выпадающего списка

        //TODO: Выбрать несколько вариантов из списка Selenium Commands

        //TODO: Кликнуть на кнопку Button

        //TODO: Закрыть браузер

    }
}
