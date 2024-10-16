package LeetCode.DesignPatterns.Singleton2;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Map;
import java.util.Properties;

public class ConfigService {
    public static ConfigService instance;
    public static Properties properties;

    private ConfigService(){
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\alexi\\OneDrive\\Desktop\\LeetCode\\LeetCode\\DesignPatterns\\Singleton2\\config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Metoda statica instanta Singleton
    public static ConfigService getInstance(){
        if(instance == null){
            instance = new ConfigService();

        }
        return instance;
    }

    public String getConfig(String key){
        return properties.getProperty(key);
    }
}
