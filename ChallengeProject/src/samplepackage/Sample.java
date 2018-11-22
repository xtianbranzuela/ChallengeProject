package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auomation {

     public static void main(String[] args){

        //This creates an dynamic firefox object (an instance of firefox)
        WebDriver driver = new FirefoxDriver();

        //Now we can go to a specific url 
        driver.get(<a href="&quot;http://www.google.ca">"http://www.google.ca</a>");

        //Close the instance of browser
        driver.close();    
    }

     /*
      * At actual projects we usually do not shove our code in main(), instead we can use testNG to manage
      *  the calls to our methods(test cases)
      * This is a very simple code to check if the Test Environment works and not actually to teach 
      * how to write scripts
      */

}