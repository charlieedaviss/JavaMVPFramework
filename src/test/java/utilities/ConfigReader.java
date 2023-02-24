package utilities;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

    // Creating a public static Properties variable
    // Properties class is essentially created to Handle .properties files
    public static Properties properties;

    // Method to initialize properties
    public static void initializeProperties() {

        // Since this FileReader constructor line in the try block may
        // throw an exception (line 18), we put it in a try catch block
        // We use a try/catch block so that any method uses initializedProperties
        // does not have to Throw an exception.
        try {
            // We have to pass a String Path to our config.properties file in the Constructor
            FileReader fileReader = new FileReader("src/test/resources/config.properties");
            // Here we initialize the Properties object
            properties = new Properties();
            // Here we are using the .load(fileReader) method in order to pass
            // the fileReader to the properties object.
            properties.load(fileReader);
        } catch (Exception e) {
            // .printStackTrace() prints what type of Exception is thrown.
            e.printStackTrace();
        }
    }

    public static String getConfigProperty(String key){
        // When we call .getProperty(key) it gives us the value stored in that key.
        return properties.getProperty(key);
    }



}
