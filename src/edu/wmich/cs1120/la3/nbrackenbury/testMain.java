
package edu.wmich.cs1120.la3.nbrackenbury;

public class testMain {

public static void main(String[] args) {

    
	Scanner keyboard = new Scanner(System.in);
        IController control = new Controller(keyboard);
        control.readInput("input.txt"); 
        String response = "";
        boolean quitFlag = false; 
                 while (!quitFlag)
                 {             
                     control.showMenu();             
                 response = keyboard.nextLine();             
                 System.out.println();  
                 
                 switch (response) 
                   {  
                   case "1": control.displayCollection(); break;                 
                   case "2": control.checkoutMaterials(); break;
                   case "3": quitFlag = true; break;
                   }
                 }
                 System.out.println("Good bye!");
                 keyboard.close();
    }
}