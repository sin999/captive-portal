package ru.ttk.sin.servlet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by 1 on 16.10.2016.
 */
public class AppProperties {
    private static String PROPERTY_FILE_NAME = "app.properties";
    private static AppProperties instace = new AppProperties();
    private Properties properties;

    private AppProperties(){
        properties = readProperties(PROPERTY_FILE_NAME);
    }

    public static Properties getProperties(){
        return instace.properties;
    }

    public static String getLable(){
        String returnSrting = "<div><Table>";
        if(instace.properties!=null){
            if(instace.properties.get("version")!=null){
                returnSrting+="<tr><td>Current version is </td><td>"+instace.properties.get("version")+"</td></tr>";
            }
            if(instace.properties.get("build.date")!=null){
                returnSrting+="<tr><td>Build time  </td><td>"+instace.properties.get("build.date")+"</td></tr>";
            }
        }
        return returnSrting+"</table></div>";
    }

    private Properties readProperties(String fileInClasspath) {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(fileInClasspath);

        try {
            Properties properties = new Properties();
            properties.load(is);
            return properties;
        } catch (IOException e) {
            System.out.println("Could not read properties from file " + fileInClasspath + " in classpath. " + e);
        }

        return null;
    }




}
