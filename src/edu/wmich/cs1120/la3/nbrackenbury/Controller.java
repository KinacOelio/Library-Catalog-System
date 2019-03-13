
package edu.wmich.cs1120.la3.nbrackenbury;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Controller implements IController{

private ILibrary[] items;
private char[] itemType;

//see interface for methods descriptions

@Override
public void displayCollection(){
    for(ILibrary item : items)
    {
        item.toString();       
    }
}//end displayCollection
    
@Override
public void checkoutMaterials(){
    Scanner keyboard2 = new Scanner(System.in);
    System.out.print("Enter the call number: ");
    String response2 = keyboard2.nextLine(); 
    
    ILibrary item = findItem(response2);
    if(!item.getCallNumber().equals("null") && !item.isCheckedOut())
    {
      item.checkOut();
      item.toString();
    }
    else
    {
      System.out.println("Item is not available");
    }   
}//end checkoutMaterials

@Override
public ILibrary findItem(String callNumber)
{
  for(ILibrary item : items)  
  {
      if (item.getCallNumber().equals(callNumber)){return item;}
      
  }  
  return items[0];  
}//end fintItem

@Override
public void showMenu(){
  System.out.printf("------------- Menu -------------\n"
                  + "1) Display collection\n"
                  + "2) Check out materials\n"
                  + "3) Quit\n"
                  + "------------------------------\n");   
}//end showMenu

@Override
public void readInput(String fileName) throws IOException{
  File libraryItems = new File("input.txt"); 
  Scanner itemsScanner = new Scanner(libraryItems);
  
    
}

    
    
    
    
    
    
    
    
}
