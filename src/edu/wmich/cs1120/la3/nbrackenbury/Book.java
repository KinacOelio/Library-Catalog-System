
package edu.wmich.cs1120.la3.nbrackenbury;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Book extends LibraryItem{
 private String title;
 private String author;
 private String genre;
 private GregorianCalendar dueDate;

 
    
    
 public Book(String itemString)
 {
    super(itemString);
    String[] fields = itemString.split(",");
    this.title = fields[2];
    this.author = fields[3];
    this.genre = fields[4];
    GregorianCalendar dueDate = (GregorianCalendar)this.getDateCheckedOut().clone();
    dueDate.add(Calendar.DAY_OF_YEAR, 21); 
    setDateDue(dueDate);
 }
 
 @Override
 public String toString(){
 return String.format("Book Title: %s\n"
                    + "Author: %s\n"
                    + "Genre: %s\n"
                    + "Call number: %s\n"
                    + "Checked out: %b\n",
                      title, author, genre, this.getCallNumber(),this.isCheckedOut()
                     );
}//end toString
 
 @Override
 public GregorianCalendar getDateDue(){
 return this.dueDate;
 }

    
 @Override
 public void setDateDue(GregorianCalendar dateDue)
 {
 this.dueDate = dateDue;
 }

   





 
}//END BOOK CLASS
