package com.mainacad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Lab
{
    public static void main( String[] args )
    {
        //Создаём системную переменную которая содержит путь к драйверу
        System.setProperty("webdriver.chrome.driver","/drivers/chromedriver.exe");

        //Создаём вебдрайвер
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();

        //Открываем тестовую страницу
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        //TODO: Вывести в консоль текст Инфо сообщения

        System.out.println();

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")

        //TODO: Кликнуть линк Partial Link Test

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
