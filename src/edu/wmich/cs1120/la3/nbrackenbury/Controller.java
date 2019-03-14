
package edu.wmich.cs1120.la3.nbrackenbury;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Controller implements IController{

private LibraryItem[] items;
private int nBooks;
private int nPeriodicals;
private Scanner keyboard2;

public Controller(Scanner keyboard){this.keyboard2 = keyboard;}

//see interface for methods descriptions

@Override
public void displayCollection(){
    for(LibraryItem item : items){
        System.out.println(item.toString());       
    }
}//end displayCollection
    
@Override
public void checkoutMaterials(){
   
    System.out.print("Enter the call number: ");
    String response2 = keyboard2.nextLine(); 
    
    ILibrary item = findItem(response2);
    if(!item.getCallNumber().equals("null") && !item.isCheckedOut())
    {
      item.checkOut();
      System.out.println(item.toString());
      System.out.printf("Date Checked out: %tD\nDate due: %tD\n\n"
                        , item.getDateCheckedOut(), item.getDateDue()); 
    }
    else if(!item.getCallNumber().equals("null") && item.isCheckedOut())
    { 
      System.out.println("--Item is already checked out!--");
      System.out.println(item.toString());
      System.out.printf("Date Checked out: %tD\nDate due: %tD\n\n"
                        , item.getDateCheckedOut(), item.getDateDue()); 
    }
    else{System.out.println("Item does not exist");}
}//end checkoutMaterials

@Override
public ILibrary findItem(String callNumber)
{
  for(LibraryItem item : items)  
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
                  + "--------------------------------\n"
                  + "Please choose an option: ");   
}//end showMenu

@Override
public void readInput(String fileName) throws IOException{
 
  File libraryItems = new File("input.txt"); 
  Scanner itemScanner = new Scanner(libraryItems);
  nBooks = Integer.parseInt(itemScanner.nextLine());
  nPeriodicals = Integer.parseInt(itemScanner.nextLine());
  items = new LibraryItem[nBooks + nPeriodicals + 1];
  for(int i = 1; i < items.length; i++)
  {
    String itemString = itemScanner.nextLine();
    if(itemString.charAt(0) == 'B'){ items[i] = new Book(itemString);}
    else if (itemString.charAt(0) == 'P'){ items[i] = new Periodical(itemString);}  
  }
  items[0] = new LibraryItem("null,null");
}
}

   
