
package edu.wmich.cs1120.la3.nbrackenbury;


public class Book extends LibraryItem{
 private String title;
 private String Author;
 private String genre;
 
    
    
 public Book(String itemString)
 {
    super(itemString);
    String[] fields = itemString.split(",");
    this.title = fields[2];
    this.Author = fields[3];
    this.genre = fields[4];
 }   
    
   





 
}//END BOOK CLASS
