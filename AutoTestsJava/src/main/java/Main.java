import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dimass\\Desktop\\Web_Driver\\chromedriver.exe"); // Прописываем путь до ВебДрайвера
        WebDriver driver = new ChromeDriver(); // создаем экземпляр класса

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Задаем явное ожидание

        driver.get("https://google.com"); // открываем наш URL

    WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")); // Методом findElement находим элемент по xPath

    String par = element.getAttribute("clientHeight"); // Переменной par присваиваем СВОЙСТВО элемента "вкладка Propetries" в девтулзах

    System.out.println(par);

        driver.get("https://www.google.com/search?q=fdbnj&source=hp&ei=SngxZP3oK8moxc8PovGL6A8&iflsig=AOEireoAAAAAZDGGWmW4QzMX6oMtrZQlP8n9OXTwamrU&ved=0ahUKEwj9tYjOvZr-AhVJVPEDHaL4Av0Q4dUDCAk&uact=5&oq=fdbnj&gs_lcp=Cgdnd3Mtd2l6EAMyEggAEIAEELEDEIMBEMkDEAoQKjIICAAQigUQkgMyCAgAEIoFEJIDMg0IABCABBCxAxCDARAKMg0IABCABBCxAxCDARAKMgsIABCKBRCxAxCDATILCAAQigUQsQMQgwEyCwgAEIoFELEDEIMBMgsIABCKBRCxAxCDATILCAAQigUQsQMQgwE6CAgAEI8BEOoCOggILhCPARDqAjoLCAAQgAQQsQMQgwE6EQguEIAEELEDEIMBEMcBENEDOggIABCABBCxAzoOCC4QgAQQsQMQxwEQ0QM6CwguEIAEEMcBENEDOgkIABCABBAKEAE6BQgAEIAEOgkILhCABBAKEAE6CwguEIAEEMcBEK8BOg4IABCABBDJAxAKEAEQKjoPCC4QgAQQxwEQ0QMQChABOgwIABCABBCxAxAKEAFQ_RVY8Blg_xpoAXAAeACAAUmIAZQCkgEBNZgBAKABAbABCg&sclient=gws-wiz");

    element = driver.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div/span")); // Методом findElement находим элемент по xPath

    String par_2 = element.getText(); // С помощью метода getText вытаскиваем текст из элемента, который отображдается в UI

    System.out.println(par_2);

    element.click(); // Метод для нажатия на что либо



        driver.get("https://www.google.com/search?q=fdbnj&source=hp&ei=SngxZP3oK8moxc8PovGL6A8&iflsig=AOEireoAAAAAZDGGWmW4QzMX6oMtrZQlP8n9OXTwamrU&ved=0ahUKEwj9tYjOvZr-AhVJVPEDHaL4Av0Q4dUDCAk&uact=5&oq=fdbnj&gs_lcp=Cgdnd3Mtd2l6EAMyEggAEIAEELEDEIMBEMkDEAoQKjIICAAQigUQkgMyCAgAEIoFEJIDMg0IABCABBCxAxCDARAKMg0IABCABBCxAxCDARAKMgsIABCKBRCxAxCDATILCAAQigUQsQMQgwEyCwgAEIoFELEDEIMBMgsIABCKBRCxAxCDATILCAAQigUQsQMQgwE6CAgAEI8BEOoCOggILhCPARDqAjoLCAAQgAQQsQMQgwE6EQguEIAEELEDEIMBEMcBENEDOggIABCABBCxAzoOCC4QgAQQsQMQxwEQ0QM6CwguEIAEEMcBENEDOgkIABCABBAKEAE6BQgAEIAEOgkILhCABBAKEAE6CwguEIAEEMcBEK8BOg4IABCABBDJAxAKEAEQKjoPCC4QgAQQxwEQ0QMQChABOgwIABCABBCxAxAKEAFQ_RVY8Blg_xpoAXAAeACAAUmIAZQCkgEBNZgBAKABAbABCg&sclient=gws-wiz");

        element = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/input"));
        element.sendKeys("Java", Keys.ENTER); // в методе sendKeys передаем  параметр (что написать) Java. И какую кнопк унажать (Enter). В UI input запишется передаваемый текст и нажмется кнопка


    }
}
