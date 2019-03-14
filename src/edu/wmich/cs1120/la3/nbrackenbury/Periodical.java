
package edu.wmich.cs1120.la3.nbrackenbury;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Periodical extends LibraryItem{
 private String title;
 private String volume;
 private String issue;
 private String subject;
 private GregorianCalendar dueDate;
    

  public Periodical(String itemString)
 {
    super(itemString);
    String[] fields = itemString.split(",");
    this.title = fields[2];
    this.volume = fields[3];
    this.issue = fields[4];
    this.subject = fields[5];
    GregorianCalendar dueDate = (GregorianCalendar)this.getDateCheckedOut().clone();
    dueDate.add(Calendar.DAY_OF_YEAR, 7); 
    setDateDue(dueDate);
    
 } 
  
 @Override
 public String toString(){
 return String.format("Title: %s\n"
                    + "Volume: %s\n"
                    + "Issue: %s\n"
                    + "Subject: %s\n"
                    + "Call number: %s\n"
                    + "Checked out: %b\n",
                      title, volume, issue, subject, this.getCallNumber(),this.isCheckedOut()
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

    
  
  
  
    
}//END PERIODICAL CLASS
