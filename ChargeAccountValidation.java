/**
 * Dylan Klingensmith
 * CH7PC3 - Charge Account Validation
 * AP Computer Science 
 * Date
 */

import java.util.Scanner;

public class ChargeAccountValidation {

    public static void main(String[] args) {
        
        //Establish ChargeAccount object, scanner, and variables
        ChargeAccount account = new ChargeAccount();
        
        Scanner keyboard = new Scanner(System.in);
        int accountNumber;
        boolean valid;
        
        //Get charge account number from user and determine if the charge
        //number is valid
        System.out.println("Input the charge account number.");
        accountNumber = keyboard.nextInt();
        
        valid = account.compareAccountNumbers(accountNumber);
        
        //Return message based on validity of account number
        if (valid == true)  {
            
            System.out.println("The charge account number is valid.");
            
        } else if (valid == false)  {
            
            System.out.println("The charge account number is invalid.");
            
        }
        
        
        
        
    }

}
