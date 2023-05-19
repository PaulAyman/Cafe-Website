/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe_management;
import java.util.Date;

import java.io.*;
import java.util.Scanner;

public class variables {
  //done
   public  double costOfCake=0;//done
   public  double serviceCharge=0;
   public  double tax=0;//done
  public  double subTotal=0;//done
  public  double total=0;//done
  public  double drinks[]= new double[5];
   public  double cakes[]=new double[7];
   public static String usedUserName="";
   public static String checker="";
   public static int count=1;
    
//    variables(){
//     total=costOfCake+costOfDrink;
//     tax=total+(total*(14/100));
//     serviceCharge=total+(total*(10/100));
//     subTotal=tax+serviceCharge;
//     
//     
//    
//    }

    
   

    public double getServiceCharge() {
        double service=total+(total*0.1);
        return service;
    }

    public double getTax() {
        return (total+(total*0.14));
    }

    public double getSubTotal() {
        return subTotal;
    }
    
    public  void setDrink0(double drink){
    drinks[0]=drink;
    }
//    public double getDrinks0(){
//    return(drinks[0]);
//    }
    public  void setDrink1(double drink){
    drinks[1]=drink;
    }
    public  void setDrink2(double drink){
    drinks[2]=drink;
    }
    public  void setDrink3(double drink){
    drinks[3]=drink;
    }
    public  void setDrink4(double drink){
    drinks[4]=drink;
    }
//    public   void setDrink5(double drink){
//    drinks[5]=drink;
//    }
    public double getTotalDrink(){
        double costOfDrink=0;
        for(int i=0;i<5;i++){
        costOfDrink+=drinks[i];
        }
        total+=costOfDrink;
        return costOfDrink;
        
    }
    //set the cakes
    
     public  void setcake0(double cake){
    cakes[0]=cake;
    }
    public  void setCake1(double cake){
    cakes[1]=cake;
    }
    public  void setCake2(double cake){
    cakes[2]=cake;
    }
    public   void setCake3(double cake){
    cakes[3]=cake;
    }
    public  void setCake4(double cake){
    cakes[4]=cake;
    }
    public   void setCake5(double cake){
    cakes[5]=cake;
    }
    public  void setCake6(double cake){
    cakes[6]=cake;
    }
    public  double getTotalCake(){
        for(int i=0;i<7;i++){
        costOfCake+=cakes[i];
        }
        total+=costOfCake;
        return costOfCake;
        
    }
    
    public  double getTotal(){
    return (total+(total*0.24));
    }
   
    
   public  void appendStrToFile(String fileName,String str)
	{
		// Try block to check for exceptions
		try {

                    // Writing on output stream
                    try ( // Open given file in append mode by creating an
                    // object of BufferedWriter class
                            BufferedWriter out = new BufferedWriter(
                                    new FileWriter(fileName, true))) {
                        // Writing on output stream
                        out.write(str);
                        // Closing the connection
                    }
		}

		// Catch block to handle the exceptions
		catch (IOException e) {

			// Display message when exception occurs
			System.out.println("error is "+e);
		}
	}


   


    // Main driver method
    
        // Getting the current current time
   public Date setDate(){
        Date date = new Date();      
        return date;
   }

public void createUserDataFile()
{
    try
    {
  File f = new File("src\\main\\java\\com\\mycompany\\cafe_management\\userData.txt");
  if(!f.exists())
  {
      f.createNewFile();
  }
        Scanner scan = new Scanner(f);  
        while(scan.hasNextLine()){
        usedUserName += scan.nextLine();
    }
    }catch(Exception e)
    {
   
    }
}
public void createBillsFile()
{
    try
    {
  File f = new File("src\\main\\java\\com\\mycompany\\cafe_management\\bills.txt");
  if(!f.exists())
  {
      f.createNewFile();
  }
        Scanner scan = new Scanner(f);  
        while(scan.hasNextLine()){
        usedUserName += scan.nextLine();
    }
    }catch(Exception e)
    {
    
    }
}
public int checkUserNames(String username)
{
    int flag=0;
    try
    {
  File f = new File("src\\main\\java\\com\\mycompany\\cafe_management\\check.txt");
  if(!f.exists())
  {
      f.createNewFile();
  }
        Scanner scan = new Scanner(f);  
        while(scan.hasNextLine()){
        checker = scan.nextLine();
        if(username.equals(checker)){
            flag=1;
        }
    
    }
    }catch(Exception e)
    {
    
    }
    return flag;
}
}