package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotest {

	public static void main(String[] args) throws InterruptedException, AWTException{
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Register.html");
		dr.manage().window().maximize();
		//Thread.sleep(3000);
		Robot r=new Robot();
		r.mouseMove(400, 400);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	dr.get("https://amzon.in/");
	String id=dr.getWindowHandle();
	System.out.println("Window is "+id);
	Set<String> id_l=dr.getWindowHandles();
	for(String s : id_l)
	{
		System.out.println(id);
	}
	

}
}