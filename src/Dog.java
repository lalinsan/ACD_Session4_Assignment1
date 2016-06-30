/*
* Student: Eduardo Aguirre
* Session 4
* Assignment 1
* Core Dog Java Class use as the Blue Print to create instances of a Dog.  
*/


import java.text.NumberFormat; //Imports NumberFormat Class from java API Class Library to get Currency formatting 

public class Dog {
	private String name;  //Stores Dog's Name
	private String breed; //Stores Dog's Breed
	private String color; //Stores Dog's Color
	private int cost; //Stores Dog's Cost
	private String costFormatted; //Stores Dog's Cost with Currency Format
	private String age; //Stores Dog's Age
	private String favoriteToy; //Stores Dog's Favorite Toy
	private boolean neutered; //Stores whether the Dog is neutered or not

   //Default Constructor	
	public Dog ()
	{
	
	}
    //Set Dog's Name
	public void setName (String name)
	{
		this.name=name;
	}

    //Return Dog's Name	
	public String getName()
	{
		return this.name;
	}
	
	//Set Dog's Breed
	public void setBreed (String breed)
	{
		this.breed=breed;
	}

	//Return Dog's Breed
	public String getBreed ()
	{
		return breed;
	}
	
	//Set Dog's Color
	public void setColor (String color)
	{
		this.color=color;		
	}

	//Return Dog's Color
	public String getColor ()
	{
		return color;
	}
	
	//Set Dog's Age
	public void setAge (String age)
	{
		this.age=age;
	}
	
	//Return Dog's Age
	public String getAge()
	{
		return age;
	}
	
	//Set Dog's Favorite Toy
	public void setFavoriteToy (String favoriteToy)
	{
		this.favoriteToy=favoriteToy;
	}
	
	//Return Dog's Favorite Toy
	public String getFavoriteToy ()
	{
		return favoriteToy;
	}
	
	//Set Dog's Neutered attribute
	public void setNeutered (boolean neutered)
	{
		this.neutered=neutered;
	}
	
	
	//Get Dog's Neutered attribute
	public boolean getNeutered()
	{
		return neutered;
	}
	
	//Set Dog's Cost
	public void setCost (int cost)
	{
		this.cost=cost;
	}
	//Get Dog's Cost
	public int getCost()
	{
		return cost;
	}
	
	//Return Dog's Cost with Currency Format
	public String getCostformatted()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		costFormatted= currency.format(cost);
		return costFormatted;
	}
		
}
