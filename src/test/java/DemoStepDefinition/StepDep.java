package DemoStepDefinition;

import java.time.Duration;
import java.util.List;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDep {
	WebDriver driver;
	@Given("^Open application <URL>$")
	public void open_application_URL() throws Throwable {
		System.setProperty("Webdriver.frirefox.driver", "C:\\WebDrivers\\geckodriver-v0.33.0-win-aarch64");
		FirefoxOptions TX = new FirefoxOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new FirefoxDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	}

	@Then("^Select depart/arriaval dates$")
	public void select_depart_arriaval_dates() throws Throwable {
		
	//((JavascriptExecutor)driver).executeScript("Scroll(0, 400)");
		
		JavascriptExecutor JS  = (JavascriptExecutor)driver;
		JS.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value= '09/20/2023'");
		JS.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value= '09/30/2023'");
	}

	@Then("^Click depart/arriaval dates$")
	public void click_depart_arriaval_dates() throws Throwable {
		JavascriptExecutor TX  = (JavascriptExecutor)driver;
		TX.executeScript("document.getElementById('1bdbzj').value= '09/20/2023'");
		TX.executeScript("document.getElementById('nnp5q9').value= '09/30/2023'");
	}
	@Then("^Mouse hover to Mens$")
	public void mouse_hover_to_Mens() throws Throwable {
	    Actions Ac = new Actions(driver);
	    Ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Men')]"))).build().perform();
		
	}

	@Then("^Dropdown to New Arrivals$")
	public void dropdown_to_New_Arrivals() throws Throwable {
	  WebElement drop;
	Select TX = new Select(driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")));
		
	}
	@Given("^Open Google Finance application <URL>$")
	public void open_Google_Finance_application_URL() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\ChromeDriver\\chrome.exe\"");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/finance/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	}

	@Then("^Search Google in search box$")
	public void search_Google_in_search_box() throws Throwable {
	   WebElement A  = driver.findElement(By.xpath("/html/body/c-wiz[2]/div/div[3]/div[3]/div/div/div/div[1]/input[2]"));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   A.sendKeys("Google");
	   A.sendKeys(Keys.ENTER);
	}

	@Then("^Print the previous result$")
	public void print_the_previous_result() throws Throwable {
	   //String result = driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[4]/div/main/div[2]/div[2]/div/div[1]/div[2]/div")).getText();
        String volume = driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[4]/div/main/div[2]/div[2]/div/div[1]/div[6]/div")).getText();
		
		
		System.out.println("AVG VOLUME " + volume);
	   
	   Thread.sleep(2000);
	   driver.close();
		
	}
	@Then("^Prnit all links of the webpage$")
	public void prnit_all_links_of_the_webpage() throws Throwable {
	     
	List<WebElement> allLinks =	driver.findElements(By.tagName("a"));
	System.out.println("Total Links in this page " + allLinks.size());
	for(int i =0; i < allLinks.size(); i ++) {
		System.out.println(allLinks.get(i).getAttribute("href"));
		
	}
	
	Thread.sleep(3000);
	driver.close();
	}

	@Given("^Open Amazon application <URL>$")
	public void open_Amazon_application_URL() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\ChromeDriver\\chrome.exe\"");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("^Count & print all links o the webpage$")
	public void count_print_all_links_o_the_webpage() throws Throwable {
    List<WebElement>	links =  driver.findElements(By.tagName("a"));
    System.out.println("Total links in Amazon Web page " + links.size() );
    
    for(int i = 0; i< links.size(); i++) {
   	System.out.println(links.get(i).getDomAttribute("href"));
    	
    	Thread.sleep(1000);
    	driver.close();
    }
    
    
}
	@Given("^Open makemytrip application <URL>$")
	public void open_makemytrip_application_URL() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\ChromeDriver\\chrome.exe\"");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("^Try to select depert\\?arrival dates$")
	public void try_to_select_depert_arrival_dates() throws Throwable {
   
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/label/p[1]/span[2]")).click();
	    
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]/div/p")).click();
	    
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[4]/div[2]/label/span")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[5]/div/p")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

	
	@Given("^Open American Airlines application <URL>$")
	public void open_American_Airlines_application_URL() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\ChromeDriver\\chrome.exe\"");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		driver.get("https://www.aa.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@Then("^Try to click depert/arrival dates$")
	public void try_to_click_depert_arrival_dates() throws Throwable {
	
	  WebElement C = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
	  C.clear();
	  C.sendKeys("iah");
	  WebElement D = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
	  D.sendKeys("Dac");
		
	  Thread.sleep(3000);
	  
	  WebElement A = driver.findElement(By.id("aa-leavingOn"));
	  A.sendKeys("09/20/2023");
	  
	  WebElement B = driver.findElement(By.id("aa-returningFrom"));
	  B.sendKeys("10/07/2023");
	  
	  Select pax = new Select(driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount")));
	  pax.selectByIndex(3);
	  
	 
	  
      WebElement F = driver.findElement(By.id("flightSearchForm.button.reSubmitnull"));	  
	  F.click();
	  
	  Thread.sleep(1000);
	  driver.close();
	  
	  
	  
	  
	}

@Given("^Open Expedia application <URL>$")
public void open_Expedia_application_URL() throws Throwable {
	System.setProperty("Webdriver.chrome.driver", "\"C:\\ChromeDriver\\chrome.exe\"");
	ChromeOptions TX = new ChromeOptions();
	TX.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver();
	driver.get("https://www.expedia.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Then("^Click depert/arrival dates$")
public void click_depert_arrival_dates() throws Throwable {
	WebElement A = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div/div/div[2]/div/div/div/div/button"));
	A.click();
	
	WebElement B = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[1]/table/tbody/tr[4]/td[4]/div"));
	B.sendKeys("09/20/2023");
   
}
@Given("^Open Emirates application <URL>$")
public void open_Emirates_application_URL() throws Throwable {
	System.setProperty("Webdriver.chrome.driver", "\"C:\\ChromeDriver\\chrome.exe\"");
	ChromeOptions TX = new ChromeOptions();
	TX.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver();
	driver.get("https://www.qatarairways.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Then("^Depert/arrival dates$")
public void depert_arrival_dates() throws Throwable {
    //WebElement A = driver.findElement(By.id("onetrust-accept-btn-handler"));
    //A.click();
	
	//driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div/div/div[2]/section/div[4]/div[1]/div[4]/button/span")).click();
	

	//JavascriptExecutor JS  = (JavascriptExecutor)driver;
	//JS.executeScript("document.getElementById('search-flight-date-picker--depart').value= '09/20/2023'");
	//JS.executeScript("document.getElementById('search-flight-date-picker--return').value= '09/30/2023'");
	
	driver.findElement(By.id("cookie-accept-all")).click();
	
	driver.findElement(By.xpath("/html/body/div[7]/main/div/div/div/div[1]/div//app-bw-main/section/div/div/div/div[1]/div/app-flights/div/div/div[2]/app-calendar/div/form/div/div[1]/div/ngb-datepicker/div[1]/ngb-datepicker-navigation")).click();
	JavascriptExecutor JS  = (JavascriptExecutor)driver;
	JS.executeScript("document.getElementById('dpFromDate').value= '10/20/2023'");
	JS.executeScript("document.getElementById('dpToDate').value= '10/30/2023'");
	
	
}




}
    
    
    
    
    
    
    
    
	

