package mock;
//User-defined exception class for invalid temperature
@SuppressWarnings("serial")
class TemperatureInvalidException extends Exception {
 public TemperatureInvalidException(String message) {
     super(message);
 }
}

//Temperature class to hold the temperature value
class Temperature {
 String temperature; // This will hold the validation message
}

//TemperatureImplementation class to handle temperature validation
class TemperatureImplementation {

 // Method to validate the temperature and set the appropriate message
 public String setTemperature(Temperature t, int temp) {
     try {
         // Check if the temperature is within the acceptable range
         if (temp < -30 || temp > 50) {
             // Throw a custom exception if the temperature is invalid
             throw new TemperatureInvalidException("TemperatureInvalidException");
         } else {
             // Set the temperature to "Valid Temperature" if it's valid
             t.temperature = "Valid Temperature";
         }
     } catch (TemperatureInvalidException e) {
         // Handle the exception and set the temperature to "Invalid Temperature"
         t.temperature = "Invalid Temperature";
     }
     return t.temperature;
 }
}

//Main class to run the simulation and check temperatures
public class WeatherSimulation2 {
 public static void main(String[] args) {
     TemperatureImplementation tempImp = new TemperatureImplementation();
     Temperature tempObj = new Temperature();

     // Sample input temperatures
     int[] inputs = {20, -40, 60, -25, 45};

     // Process each temperature and print the result
     for (int inputTemp : inputs) {
         System.out.println("Input Temperature: " + inputTemp + " => " + tempImp.setTemperature(tempObj, inputTemp));
     }
 }
}
//Question 2:
//
//The Meteorological Department has designed a simulation to bring awareness regarding extreme
//
//weather conditions. In this simulation, the minimum acceptable temperature should be -30°C and
//
//the maximum should be 50°C. Help them by writing a Java program to check the functionality of the
//
//simulation software. If the input temperature is between -30 and 50, then return the message “Valid
//
//Temperature”, else the program should alert with the message “TemperatureInvalidException” by
//
//throwing a user-defined exception TemperatureInvalidException.
//
//Specifications:
//
//Task:
//
//Class Temperature
//
//• Define the String variable temperature.
//
//Class TemperatureImplementation
//
//• Implement the below method for this class:
//
//o String setTemperature(Temperature t, int temp): Inside this method, write the logic
//
//for validating the temperature.
//
//▪ If the temperature is less than -30 or greater than 50, this method should
//
//throw a TemperatureInvalidException with the message
//
//"TemperatureInvalidException".
//
//▪ Else, assign the string "Valid Temperature" to t.temperature.
//
//▪ Catch the thrown exception and assign the string "Invalid Temperature" to
//
//t.temperature.
//
//Class Definitions:
//
//Class Temperature:
//
//• Class Variables:
//
//o String temperature
//
//Class TemperatureImplementation:
//
//• Class Methods:
//
//o setTemperature(Temperature t, int temp): This method has an object of
//
//Temperature class and temp (integer) as a parameter.
//
//▪ Visibility: public
//
//▪ Return Type: String
//
//Class TemperatureInvalidException extends Exception:
//
//• User-Defined Exception class extends Exception class:
//
//o TemperatureInvalidException(String s):
//
//▪ Visibility: public
//
//• Return default message if an exception is thrown, else return t.temperature.
//
//Sample Input
//
//20 -40 60 -25 45
//
//Sample Output
//
//Input Temperature: 20 => Valid Temperature
//
//Input Temperature: -40 => Invalid Temperature
//
//Input Temperature: 60 => Invalid Temperature
//
//Input Temperature: -25 => Valid Temperature
//
//Input Temperature: 45 => Valid Temperature
