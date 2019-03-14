
package edu.wmich.cs1120.la3.nbrackenbury;

import java.util.GregorianCalendar;


public class LibraryItem implements ILibrary{
    
private boolean checkedOut;
private String callNumber = "null";
private GregorianCalendar dateChecked;
private GregorianCalendar dateDue;

public LibraryItem(String itemString)
{
  this.dateChecked = (GregorianCalendar)GregorianCalendar.getInstance();
  String[] fields = itemString.split(",");
  this.callNumber = fields[1];  
}

//see interface for method documentation 

@Override
public void checkOut()
{
    this.checkedOut = true;
    dateChecked.setTime(dateChecked.getTime()); 
}

@Override
public String toString()
{
    return "";
}

@Override
public String getCallNumber(){return this.callNumber;}
@Override
public boolean isCheckedOut(){return this.checkedOut;}
@Override
public GregorianCalendar getDateCheckedOut(){return this.dateChecked;}

public GregorianCalendar getDateDue(){
    System.out.println("this method (LibraryItem.getDateDue) "
            + "indicates that the object is not calling the "
            + "relevant method for either .Book or .Periodical");
    return this.dateChecked;
}


public void setDateDue(GregorianCalendar dateDue){
  System.out.println("this method (LibraryItem.setDateDue) "
          + "indicates that the object is not calling the "
          + "relevant method for either .Book or .Periodical");  
}

    
}//end LibraryItem class
