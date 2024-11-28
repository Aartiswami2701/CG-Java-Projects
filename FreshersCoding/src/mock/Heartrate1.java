//Question 1:
//Arjun is a new intern at Capgemini. He is responsible for creating a Heart Rate calculator which takes
//resting heart rate and age as input. But there is a catch here – the input is given as a string.
//Sample Input:
//• The part before @ is the resting heart rate and - represents decimal points(.).
//• The part after @ is the age.
//• So, the Resting Heart Rate = 72.5 and Age = 25.
//• Max Heart Rate = 220 - Age
//• Target Heart Rate = (Max Heart Rate - Resting Heart Rate) * 0.7 + Resting Heart Rate
//Your task here is to implement a Java code based on the following specifications. Note that your
//code should match the specification in a precise manner. Consider default visibility of classes, data
//fields, and methods as public unless mentioned otherwise.
//Class Definitions:
//Class HeartRateCalculator:
//• Method Definitions:
//o returnRestingHeartRate(String str): Method takes data in String str and returns the
//Resting Heart Rate in decimal format.
//▪ Return type: float ▪ Visibility: public
//o returnAge(String str): Method takes data in String str and returns the Age.
//▪ Return type: int ▪ Visibility: public
//o calculateMaxHeartRate(int age): Method takes age and returns the Max Heart Rate.
//▪ Return type: int
//▪ Visibility: public
//o calculateTargetHeartRate(float restingHeartRate, int maxHeartRate): Method takes
//
//resting heart rate and max heart rate, calculates the Target Heart Rate, and returns
//
//it.
//
//▪ Return type: float
//
//▪ Visibility: public
//
//o checkFitnessLevel(float targetHeartRate): If Target Heart Rate is between 120 and
//
//160 return "Fit", else return "Unfit".
//
//▪ Return type: String
//
//▪ Visibility: public
//
//Example Input: 72-5@25
//
//Example Output:
//
//• Resting Heart Rate: 72.5
//
//• Age: 25
//
//• Max Heart Rate: 195
//
//• Target Heart Rate: 155.75
//
//• Fitness Level: Fit


package mock;

import java.util.Scanner;

public class Heartrate1 {
 
	public float restingheartrate(String str)
	{
		String[] resting = str.split("@");
		String res = resting[0];
		Float rest =Float.valueOf(res);  
		return rest;
	}
 
	public int age(String str)
	{
		String[] divide = str.split("@");
		String res = divide[1];
		int age =  Integer.valueOf(res);
		return age;
	}
	public int maxheart(int age)
	{
		return 220-age;
	}
	public float targetheartrate(float resting,int age)
	{
		float maxi = maxheart(age);
		float target = (float) ((maxi-resting)*0.7+resting);
		return target;
	}
	public String fitness(float targetheart)
	{
		if(targetheart>120 || targetheart<160)
		{
			return "fit";
		}
		else
		{
			return "unfit";
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the heartarte and age");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Heartrate1 hc = new Heartrate1();
		System.out.println("Resting Heart Rate: " + hc.restingheartrate(str));
		float resting = hc.restingheartrate(str);
		System.out.println("Age: " + hc.age(str));
		int age = hc.age(str);
		System.out.println("Maximum Heart Rate : " + hc.maxheart(age));
		System.out.println("Target Heart Rate: " + hc.targetheartrate(resting, age));
		float targetheart = hc.targetheartrate(resting, age);
		System.out.println("fitness level : " + hc.fitness(targetheart));
		sc.close();
	}
}