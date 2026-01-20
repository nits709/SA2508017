package WebDriver_Actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datapciketFunction {
	static WebDriver driver;
	public static void main(String[] args) {
//		
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/datepicker/");
	
	driver.switchTo().frame(0); // iframe by index
	
	driver.findElement(By.id("datepicker")).click();
		selectDate("12/12/2026"); // 12/04/2026 | 12 April 2026

	}

	public static void selectDate(String d) {

		Date current = new Date();

		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date selected = sd.parse(d);

			String day = new SimpleDateFormat("dd").format(selected);
			String month = new SimpleDateFormat("MMMM").format(selected);
			String year = new SimpleDateFormat("yyyy").format(selected);

			System.out.println(day + "/" + month + "/" + year);

			String desiredMonthYear = month + " " + year;
			
			while (true) {
				
				String displayedMonthYear = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
				
				System.out.println("displayed Date"+displayedMonthYear);
				
				if(desiredMonthYear.equals(displayedMonthYear)) {
					//select the day
					driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
					break;
				}
				else {
					if(selected.compareTo(current)>0) {
						driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
					}else if(selected.compareTo(current)<0) {
						driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
					}
				}
				
				
				
				
				
				
				
				
				
				
				
				
				

			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
