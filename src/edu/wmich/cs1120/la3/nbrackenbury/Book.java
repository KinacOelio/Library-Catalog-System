
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
    this.dueDate = (GregorianCalendar)this.getDateCheckedOut().clone();
    this.dueDate.add(Calendar.DAY_OF_YEAR, 21); 
 }
 
 @Override
 public String toString(){
 return String.format("Book Title: %s\n"
                    + "Author: %s\n"
                    + "Genre: %s\n"
                    + "Call number: %s\n"
                    + "Ckecked out: %b",
                      title, author, genre, this.getCallNumber(),this.isCheckedOut()
                     );
}
 
 @Override
 public GregorianCalendar getDateDue(){
 
 return this.getDateCheckedOut();

 }

    
 @Override
 public void setDateDue(GregorianCalendar dateDue)
 {
 
 }

   





 
}//END BOOK CLASS
