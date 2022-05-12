package Mini_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("venkates");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Venkate@6");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement location = driver.findElement(By.name("location"));
		location.click();
		Select s = new Select(location);
		if(s.isMultiple()) {
		System.out.println("MultipleDropDown");
		}else {
			s.selectByValue("Sydney");
		}
		
		
		WebElement hotels = driver.findElement(By.name("hotels"));
		hotels.click();
		Select s1 = new Select(hotels);
		s1.selectByIndex(2);
		
		WebElement room = driver.findElement(By.name("room_type"));
		room.click();
		Select s2 = new Select(room);
		s2.selectByIndex(2);
		
		WebElement room_type = driver.findElement(By.name("room_type"));
		room_type.click();
		Select s3 = new Select(room_type);
		s3.selectByVisibleText("Super Deluxe");
		
		WebElement date_in = driver.findElement(By.name("datepick_in"));
		date_in.clear();
		date_in.sendKeys("13/05/2022");
		WebElement date_out = driver.findElement(By.name("datepick_out"));
		date_out.clear();
		date_out.sendKeys("15/05/2022");
		
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");
		
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
		
		WebElement selected = driver.findElement(By.name("radiobutton_0"));
		if (selected.isSelected()) {
			System.out.println("Hotel selected by default");
		}else {
			selected.click();
		}
		
		WebElement continues = driver.findElement(By.name("continue"));
		continues.click();
		
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("Venkatesh");
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("V");
		WebElement Address = driver.findElement(By.name("address"));
		Address.sendKeys("Ajai street, ramar palam");
		WebElement cnum = driver.findElement(By.name("cc_num"));
		cnum.sendKeys("1234567899638527");
		
		WebElement card = driver.findElement(By.name("cc_type"));
		card.click();
		Select s5 = new Select(card);
		s5.selectByValue("VISA");
		
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select s6 = new Select(month);
		s6.selectByIndex(5);
		
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s7 = new Select(year);
		s7.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("159");
		
		WebElement book = driver.findElement(By.name("book_now"));
		book.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement iterate = driver.findElement(By.name("my_itinerary"));
		iterate.click();
		
		WebElement logout = driver.findElement(By.name("logout"));
		logout.click();
		
		
		
	}
	
	
	
}
