package com.exercise;


public class Bottle {
	String bottleName;
	String color;
	int capacity;
	float price;
	String typeOfBottle;
       
      void intializeBottle(String name,String color,int capacity,float price,String type)
       {
           bottleName=name;
	       this.color=color;
		   this.capacity=capacity;
		   this.price=price;
		   typeOfBottle=type;
           System.out.println("Name of bottle is:" + bottleName+"\t" + "Color is:" + this.color +"\t" +
		"Capacity is:" + this.capacity+ "\t"+ "Price is:"+ this.price+"\t"+"Type is:"+typeOfBottle);
       }

	void drinkingBottle() 
	{
		System.out.println("Bottle is used for drinking");
	}
	
	public static void main(String[] args) {
		
		Bottle bottle =new Bottle(); //object creation
		bottle.intializeBottle("ABC","blue",2,200f,"plastic");
               bottle.drinkingBottle();

	
	}


}
