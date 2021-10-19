package com.Seleniumdemo.Demo1;

import javafx.scene.paint.PhongMaterial;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static sun.plugin.javascript.navig.JSType.Element;

public class Test_demo1 {



	public static void main(String[] args) throws InterruptedException {
		
		//Driver Setup
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		//Initialize web driver
		WebDriver driver = new ChromeDriver();

		//Navigate to the URL
		driver.manage().window().maximize();
		driver.get("https://rise.capital/");

		Thread.sleep(3000);


		WebElement ProductButton = driver.findElement(By.xpath("(//span[text()='Products'])[2]"));
		Thread.sleep(3000);
		WebElement BuildWealth = driver.findElement(By.xpath("(//a[text()='Build Wealth'])[2]"));

		ProductButton.click();
		Boolean Value = BuildWealth.isDisplayed();
		System.out.println(Value);

		BuildWealth.click();
		Thread.sleep(3000);
		WebElement HeaderTag = driver.findElement(By.xpath("//h1"));

		String HeaderText = HeaderTag.getText();

		System.out.println(HeaderText);

		WebElement ageTextBox = driver.findElement(By.xpath("//input[@name='age']"));
		WebElement salaryTextBox = driver.findElement(By.xpath("//input[@name='salary']"));
		WebElement investmentPercentageTextBox = driver.findElement(By.xpath("//input[@name='investmentPercentage']"));
		WebElement retirementAge = driver.findElement(By.xpath("//input[@name='retirementAge']"));
		WebElement dropDown = driver.findElement(By.id("investmentPreference"));
		WebElement criteria = driver.findElement(By.xpath("//option[text()='Stability']"));
		WebElement Calculatebutton = driver.findElement(By.xpath("//button[text()='Calculate']"));
		WebElement Scrollable = driver.findElement(By.xpath("//p[text()='Get Rise and start investing']"));


		ageTextBox.clear();
		ageTextBox.sendKeys("25");
		salaryTextBox.clear();
		salaryTextBox.sendKeys("350000");
		investmentPercentageTextBox.clear();
		investmentPercentageTextBox.sendKeys("20");
		retirementAge.clear();
		retirementAge.sendKeys("60");
		Thread.sleep(3000);


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		js.executeScript("javascript:window.scrollBy(350,450)");
		js.executeScript("javascript:window.scrollBy(450,550)");
//		js.executeScript("arguments[0].scrollIntoView(true);", Scrollable);
		Thread.sleep(3000);
//		Actions at = new Actions(driver);
//		at.sendKeys(Keys.PAGE_DOWN).build().perform();
//		at.sendKeys(Keys.PAGE_DOWN).build().perform();
		dropDown.click();
		criteria.click();
		Thread.sleep(3000);
		Calculatebutton.click();

		js.executeScript("javascript:window.scrollBy(550,450)");
		js.executeScript("javascript:window.scrollBy(450,350)");
		js.executeScript("javascript:window.scrollBy(350,250)");
		js.executeScript("javascript:window.scrollBy(250,150)");
		js.executeScript("javascript:window.scrollBy(150,50)");
		Thread.sleep(3000);

		WebElement calculatedValue = driver.findElement(By.xpath("//p[text()='Wealth Goal']//following-sibling::p[contains(@class,'font-bold')]"));

		String FinalValue = calculatedValue.getText();

		System.out.println(FinalValue);





		Thread.sleep(3000);









//		ChoosePlan.click();
//
//		Thread.sleep(5000);
//		//Initialize elements
//		WebElement Firstname = driver.findElement(By.xpath("//p[text()='Firstname']//following::input[1]"));
//		WebElement Lastname = driver.findElement(By.xpath("//p[text()='Firstname']//following::input[2]"));
//		WebElement Email = driver.findElement(By.xpath("//p[text()='Firstname']//following::input[3]"));
//		WebElement Phonenumber = driver.findElement(By.xpath("//p[text()='Firstname']//following::input[4]"));
//		WebElement Password = driver.findElement(By.xpath("//p[text()='Firstname']//following::input[5]"));
//
//
//		Thread.sleep(3000);
//
//		Firstname.sendKeys("Olufunbi");
//		Lastname.sendKeys("Babalola");
//		Email.sendKeys("Test@test.com");
//		Phonenumber.sendKeys("00000000000");
//		Password.sendKeys("RandomText12345");
//
////		WebElement email = driver.findElement(By.id("email"));
////		email.sendKeys("Test Case");
////		Thread.sleep(3000);
////		email.clear();
////		email.sendKeys("New Text");
//
//		Thread.sleep(3000);

//		//Dropdown Link
//		WebElement Dropdown_Link=driver.findElement(By.linkText("Dropdown"));
//		Dropdown_Link.click();
//
//		//Get Dropdown values
//		WebElement drop_down =driver.findElement(By.id("dropdown"));
//		Select DropdownValues = new Select(drop_down);
//		List<WebElement> options = DropdownValues.getOptions();
//		for(WebElement e: options){
//			System.out.println(e.getText());
//		}
//		System.out.println("Get Current Selected Option : ");
//		List<WebElement> SelecedOptions =DropdownValues.getAllSelectedOptions();
//		for(WebElement e: SelecedOptions){
//			System.out.println(e.getText());
//		}
//		System.out.println("Now Select Other Options...");
//		DropdownValues.selectByIndex(2);
//		Thread.sleep(3000);
//		DropdownValues.selectByVisibleText("Option 2");
//		Thread.sleep(3000);
//		DropdownValues.selectByVisibleText("Option 1");
//		Thread.sleep(3000);
//
//
//		///////////Check boxes///////////////
//
//			driver.navigate().back();
//
////		CheckBox Link
//		WebElement CheckBox_Link=driver.findElement(By.linkText("Checkboxes"));
//		CheckBox_Link.click();
//
//		List<WebElement> checkBoxes_List = driver.findElements(By.xpath("//form[@id='checkboxes']//input"));
//		boolean res=checkBoxes_List.get(0).isSelected();
//		boolean res1=checkBoxes_List.get(1).isSelected();
//
//		if(!res){
//			checkBoxes_List.get(0).click();
//		}
//		if(!res1){
//			checkBoxes_List.get(1).click();
//		}
//		else{
//			System.out.println("Already checked SO not gonna do that Again!!!");
//		}
//		Thread.sleep(3000);


		//Close Driver
		driver.close();

		//Quit Driver
		driver.quit();
	}