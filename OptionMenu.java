package AtmMachineProject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
	
       Scanner menuInput = new Scanner(System.in);
      DecimalFormat moneyFormat = new DecimalFormat(" '$', ###, ##0.00");
  
       HashMap<Integer,Integer> data = new HashMap<Integer, Integer>();
       
         
       public void getLogin() throws IOException{
    	   
    	     int x=1;
    	     
    	 do{
    	     try {
    	    	 
    	    	 data.put(98400,7840);
    	    	 data.put(98401, 7830);
    	    	 
    	    	 System.out.println("Welcome Atm Machine Projent");
    	    	 System.out.println("Enter your Account Number");
    	    	   
    	    	 setCustomerNumber(menuInput.nextInt());
    	    	 
    	    	 System.out.println("Enter tha pin Number");
    	    	  setPinNumber(menuInput.nextInt());
    	    	 
    	     }catch(Exception e){
    	    	 System.out.println("\n"+ "Invalid Character(s)"+ "\n");
    	    	 x=2;
    	    	 break;
    	    }
    	     
    	     int cn = getCustomerNumber();
    	     int cp = getPinNumber();
    	     
    	     if(data.containsKey(cn) && data.get(cn) == cp) {
    	    	 getAccountType();
    	     }else {
    	    	 System.out.println("\n" + "Wrong Custumer Number Or Pin Number"+ "\n");
    	   
    	     }
    	     
          }while(x==2);
       }
       
      public void getAccountType() {
    	  
    	  System.out.println("Select tha Account you Want to Access: ");
    	  System.out.println(" Type 1 - Checking Account");
    	  System.out.println(" Type 2 - Saving Account");
    	  System.out.println(" Type 3 - Exit");
             System.out.print("Choice :");
    	  int selection =  menuInput.nextInt();
    	  
    	  switch(selection) {
    	    
    	  case 1:
    		  getCheckingAccount();
    		  break;
    	  
    	  case 2:
    		  getSavingAccount();
    		  break;
    	  
    	  
    	  case 3:
    		  System.out.println("Thank You for Using this ATM, bye." + "\n");
    		  break;
    		  
    		default:
    			System.out.println("\n"+ "Invalide  Choice"+ "\n");
    			break;
    	  }
      }
      
      public void getSavingAccount() {
    	  
    	  System.out.println("Saving Acount: ");
    	  System.out.println(" Type 1 -  Veiw Balance");
    	  System.out.println(" Type 2 -  Deposit Funds");
    	  System.out.println(" Type 3 -  Credit Funds");
    	  System.out.println(" Type 4 -  Exit");
    	  System.out.print("Choice: ");
    	  
    	  int selection = menuInput.nextInt();
    	  
    	  switch(selection) {
    	  
    	  case 1:
    		  System.out.println("Saving Account Balance: "+ moneyFormat.format(getSavingBalance()));
    	     getAccountType();
    	     break;
    	     
    	  case 2:
    		  getSavingCreditInput();
    		  getAccountType();
    		  break;
    		  
    	  case 3:
    		  getSavingDepositInput();
    		  getAccountType();
    		  break;
    		  
    	  case 4:
    		  System.out.println("Thank You for Using this ATM, bye." + "\n");
    		  break;
    		  
    		default:
    			System.out.println("\n"+ "Invalide  Choice"+ "\n");
    	       getSavingAccount();

    	  }
    	  
      }
      
      public void getCheckingAccount() {
    	  
    	  System.out.println("Checking Acount: ");
    	  System.out.println(" Type 1 -  Veiw Balance");
    	  System.out.println(" Type 2 -  Deposit Funds");
    	  System.out.println(" Type 3 -  Credit Funds");
    	
    	  System.out.println(" Type 4 -  Exit");
    	  System.out.print("Choice: ");
    	  
    	  int selection = menuInput.nextInt();
    	  
    	  switch(selection) {
    	  
    	  case 1:
    		  System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheakBalance()));
    	     getAccountType();
    	     break;
    	     
    	  case 2:
    		  getCheckingCreditInput();
    		  getAccountType();
    		  break;
    		  
    	  case 3:
    		  getCheckingDepositInput();
    		  getAccountType();
    		  break;
    		  
    	  case 4:
    		  System.out.println("Thank You for Using this ATM, bye." + "\n");
    		  break;
    		  
    		default:
    			System.out.println("\n"+ "Invalide  Choice"+ "\n");
    	       getCheckingAccount();

    	  }
    	  
      }

}
