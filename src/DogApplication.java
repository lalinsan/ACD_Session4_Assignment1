/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 1
* Java Application that allows the user to search for a Dog in the simulated Database. Returns the Dog's
* Information that matches the provided values.  
*/

import java.util.Scanner;//Imports Scanner Class from java API Class Library to allow user input


public class DogApplication {

	public static void main(String[] args) { //Main Method to call to start the Program
		
		String userChoice="Yes"; //Stores User's choice
		
		//Prints message to the User to Search for a Dog in the simulated Database
		System.out.println("=================================");
		System.out.println("Welcome to the Dog App"); 
		System.out.println("=================================");
		System.out.println("Search in our Dog Database");
		System.out.println("=================================");
		
		//User Input
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); //Creates an Instance if of Scanner Object to take user's input
		
		while (userChoice.equalsIgnoreCase("Yes") || userChoice.equalsIgnoreCase("Y")) //Executes code as long as the User's choice = Y or Yes
		{
			System.out.print("Enter Dog Color: ");  //Prompts user to enter Dog's Color
			String color = sc.nextLine();
			System.out.print("Enter Dog Breed: "); //Prompts user to enter Dog's Breed
			String breed = sc.nextLine();
			Dog dog = DogDetails.getDogBreed(color, breed);  //Creates an Instance of the Dog Details and get the Dog Breed Info
			
			//Assigns the values of the Matching Dog Info to a String Variable 
		    String message =   "============Dog Info============="+"\n"+
					           "Breed        : " +dog.getBreed()+"\n"+
					           "Color        : " +dog.getColor() +"\n"+
					           "Name         : " +dog.getName() +"\n"+
					           "Cost         : " +dog.getCostformatted() +"\n"+
					           "Age          : " +dog.getAge()   +"\n"+
							   "Favorite Toy : " +dog.getFavoriteToy()+"\n"+
					           "Neutered     : " +dog.getNeutered() +"\n"+
							   "===================================";
			
			System.out.println(message); //Prints the Dog matching information, from the simulated Database 
			
			System.out.print("Do you want to continue? Y|N ? "+"\n"); //Prompts user to enter another Dog search
			userChoice = sc.nextLine(); //Captures the user response
		}
		
		//Prints a thanks and good bye message
		System.out.println("===================================");
		System.out.println("Thanks for using our Dogs App");
		System.out.println("! Good Bye !");
		System.out.println("==================================");

	}

}