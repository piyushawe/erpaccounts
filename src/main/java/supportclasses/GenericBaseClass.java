package supportclasses;

import automationframework.supportmethods.ReadFile;
import org.apache.commons.logging.Log;
import utilities.EventHandlingUtility;
import utilities.GetterMethods;
import webdriver.DriverMethods;

import java.io.File;
import java.util.Collection;
import java.util.logging.Logger;

public abstract class GenericBaseClass {
    protected static Collection<String> scenario = null;
    protected static String page = null;
    protected DriverMethods dm = new DriverMethods();
    protected EventHandlingUtility ehandler = new EventHandlingUtility();
    protected ReadFile readFile = new ReadFile();
    public static File file = null;
    protected static String pack = null;

    protected File fileConfig = new File("configuration\\GenericConfig.properties");
    protected File fileUI = new File("configuration\\UIMap.properties");
    protected File fileMsg = new File("configuration\\MessageBundle.properties");

    protected GetterMethods gm = new GetterMethods();

    protected Logger logger = Logger.getLogger(Log.class.getName());
}