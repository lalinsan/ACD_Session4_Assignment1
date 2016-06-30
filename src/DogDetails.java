/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 1
* Class that simulates the Database to store the Dog's Information.  
*/


public class DogDetails {
	
	public static Dog getDogBreed (String color, String breed) //Method to define, stores and return the Dog detailed Data 
	{
		Dog dog = new Dog(); //Creates an Instance of the Dog Class
		dog.setColor(color); //Set the Dog's color
		dog.setBreed(breed); //Set the Dog's breed
		
		//Set Dog's information based on the Color and Breed 
		if (color.equalsIgnoreCase("Black") && breed.equalsIgnoreCase("English Cocker Spaniel"))  
		{
			dog.setCost(2000);
			dog.setAge("5 Months old");
			dog.setName("Niko");
			dog.setFavoriteToy("Donkey");
			dog.setNeutered(false);
			
		}
		else if (color.contentEquals("Blonde") && breed.equalsIgnoreCase("American Cocker Spaniel"))
		{
			dog.setCost(1000);
			dog.setAge("3 Months old");
			dog.setName("Bobby");
			dog.setFavoriteToy("Tennis Ball");
			dog.setNeutered(false);
		}
		
		else if (color.contentEquals("Brown") && breed.equalsIgnoreCase("French Bulldog"))
		{
			dog.setCost(1600);
			dog.setAge("2 Months old");
			dog.setName("Rago");
			dog.setFavoriteToy("Kong");
			dog.setNeutered(false);
		}
		
		else if (color.contentEquals("White") && breed.equalsIgnoreCase("English Bulldog"))
		{
			dog.setCost(2000);
			dog.setAge("3 Months old");
			dog.setName("Arrow");
			dog.setFavoriteToy("Pulling Rope");
			dog.setNeutered(false);
		}
		
		
		else //Default values when the Dog's information provided by the users does not match Color and Breed
		{
			dog.setCost(0);
			dog.setAge("Not Available");
			dog.setName("Not Available");
			dog.setFavoriteToy("Not Available");
			dog.setNeutered(false);
		}
			
	    return dog; //Returns the Dog's Information
	}

}
