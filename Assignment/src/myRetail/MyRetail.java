package myRetail;

import java.util.ArrayList;
import java.util.List;

import com.cg.mySetPractise.Address;

enum EmployeeType {
		MANAGER,
		ENGINEER,
		SALESPERSON
		}
		 
		//Define the Employee class
		class MyRetail {
		@Override
			public String toString() {
				return "MyRetail [name=" + name + ", type=" + type + "]";
			}

		private String name;
		private EmployeeType type;
		
		
		
		
		 
		// Constructor
		public MyRetail(String name, EmployeeType type) {
		     this.name = name;
		     this.type = type;
		     
		     
		}
		 
		// Method to generate a unique employee ID
		/*private static int generateEmployeeId() {
		     
			return ++idCounter; // Increment and return the counter
		}*/
		 
		// Getter for employee type
		public EmployeeType getType() {
		     return type;
		}
		 
		// Method to perform specific action based on employee type
		public void performDuties() {
		     switch (this.type) {
		         case MANAGER:
		             System.out.println(name + " is managing the team.");
		             break;
		         case ENGINEER:
		             System.out.println(name + " is coding.");
		             break;
		         case SALESPERSON:
		             System.out.println(name + " is selling products.");
		             break;
		         default:
		             System.out.println("Invalid employee type.");
		     }
		}
		
}