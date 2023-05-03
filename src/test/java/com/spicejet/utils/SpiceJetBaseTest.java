package com.spicejet.utils;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetBaseTest {
	
	public static WebDriver driver = null;
	
  public void openBrowser(String url) {
		
		try {
			WebDriverManager.chromedriver().setup();
	//		ChromeOptions options = new ChromeOptions();
	//		options.addArguments("--remote-allow-origins=*");
	//		driver = new ChromeDriver(options);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Problem while launching the browser");
		}
		
	}
  
  public void quitBrowser() 
	{
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem while quitting the browser");
		}
	}
	
	public void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem while closing the browser");
		}
	}

	 public void clickAction(WebElement ele) {
			
			try {
				ele.click();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Problem while clicking the element in the browser");
			}
			
		}
	   
	 
	 public void waitForElement(WebElement ele) {
			
			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOf(ele));
				wait.until(ExpectedConditions.elementToBeClickable(ele));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	 
	 public void selectDDByIndex(WebElement ele, int index)
		{
			try {
				Select sel = new Select(ele);
				sel.selectByIndex(index);
			} catch (Exception e) {
				System.out.println("Problem in selecting DD index");
				e.printStackTrace();
			}
		}
  
	 public void clearTxt(WebElement ele) {
		   
		   try {
            ele.clear();
		   }catch(Exception e) {
			   System.out.println("Problem in clearing the text");
			   e.printStackTrace();
		   }
	   }
	 
	 public void sendText(WebElement ele, String text) {
		   
		   try {
			   
			   ele.clear();
			   ele.sendKeys(text);
		   }catch(Exception e) {
			   e.printStackTrace();
			   System.out.println("Problem while sending the text");
		   }
		   
	   }
	 
	 public void selectDDByValue(WebElement ele,String value)
		{
			
			try {
				Select sel = new Select(ele);
				sel.selectByValue(value);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	   

	 public void selectDDByVisibleText(WebElement ele,String Visbiletxt ) {
			
			try {
				Select sel = new Select(ele);
				sel.selectByVisibleText(Visbiletxt);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 
	 public void dismissAlert(WebElement ele) 
	   {
		 try {
			Alert alert = driver.switchTo().alert();
			 alert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	   }
	 
	 public void windowHandling() {
			try {
				String pWindow = driver.getWindowHandle();
				Set<String> windowHandle = driver.getWindowHandles();

				for (String adr : windowHandle) {

					if (!(pWindow.contentEquals(adr))) {
						driver.switchTo().window(adr);
					}
					System.out.println(adr);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
	 public void jsClick(WebElement ele) {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", ele);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
	 public void jsScrollUpToElement(WebElement ele) {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", ele);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
	 public void screenShot(String ssname) {
			try {
				File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				File dest = new File("./ssphotos/" + ssname + ".png");

				FileUtils.copyFile(source, dest);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
	 public void actionClassClick(WebElement ele) {
		 try {
			 Actions act = new Actions(driver);
			 act.click(ele).build().perform();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
	 }
	 
	 public void validateText(WebElement ele, String text) {
		 
		 try {
			 Assert.assertEquals(ele.getText(), text);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
	 }
	 
	 public void moveTo(WebElement ele) {
		 
		 try {
			 Actions act = new Actions(driver);
			 act.moveToElement(ele).build().perform();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public void framesByDefault() {
			try {
				driver.switchTo().defaultContent();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	 
	 public void framesByWebElement(WebElement ele) {
			try {
				driver.switchTo().frame(ele);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
