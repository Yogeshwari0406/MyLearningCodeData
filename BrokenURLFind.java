package BrokenURL;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenURLFind {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\BrokenLinkURL\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> AllLink = driver.findElements(By.tagName("a"));
		for (WebElement Webref : AllLink) {
			String Link = Webref.getAttribute("href");
		
		URL geturl = new URL(Link);
		HttpURLConnection Connection=(HttpURLConnection)geturl.openConnection();
//		if(Connection.getResponseCode()>=400) {
//			System.out.println(Link);
//		}
        int Code = Connection.getResponseCode();
        System.out.println(Code);
		
	}
		System.out.println("All URL correct, there is no broken link in this code");
		}

}
