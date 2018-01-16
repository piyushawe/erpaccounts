package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import supportclasses.GenericBaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static webdriver.AppDriver.driver;

public class GenericUtility extends GenericBaseClass {

    public void takeScreenshot() throws IOException {
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(f, new File(getPath()));
    }

    /*private String getPath() throws IOException {
       String school= readFile.readProperty(file, "schoolname");
       String path = "F:/accounts/src/main/resources/screenshots/"+ school+"/"+ page+"/"+ page+ scenario+ getTimeStamp()+ ".png";
       return path;
    }*/

    private String getTimeStamp(){
        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    }
}