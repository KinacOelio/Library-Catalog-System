
package edu.wmich.cs1120.la3.nbrackenbury;


public class Periodical extends LibraryItem{
 private String title;
 private String volume;
 private String issue;
 private String Subject;
    

  public Periodical(String itemString)
 {
    super(itemString);
    String[] fields = itemString.split(",");
    this.title = fields[2];
    this.volume = fields[3];
    this.issue = fields[4];
    this.Subject = fields[5];
 } 
    
}//END PERIODICAL CLASS
