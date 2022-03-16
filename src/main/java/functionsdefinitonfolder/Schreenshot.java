package functionsdefinitonfolder;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Schreenshot
{
	

public static void getPicture(WebDriver driver,String name) throws IOException

{
	TakesScreenshot ts  = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File(".//screenshots//" + name + ".png"));

}



}