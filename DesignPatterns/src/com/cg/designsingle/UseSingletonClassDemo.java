package com.cg.designsingle;

//A class to test the Singleton functionality
public class UseSingletonClassDemo {

 public static void main(String[] args) {
     // Get the Singleton instance and call a method on it
     SingletonClassDemo s1 = SingletonClassDemo.getInstance();
     s1.showMessage();  // This will print: Hello, Singleton Pattern!

     // Get the Singleton instance again
     SingletonClassDemo s2 = SingletonClassDemo.getInstance();

     // Check if both references point to the same instance
     System.out.println(s1 == s2);  // This will print: true
 }
}
