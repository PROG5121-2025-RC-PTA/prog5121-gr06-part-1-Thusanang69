/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_1;

/**
 *
 * @author khutso-pollen-masekwameng
 */
import java.util.Scanner;


public class Main{
    
    public static void SignUp(){
    
    
    }
    
    public static void SignIn(){
    
    
    }
    
    public static void main(String[] args){
        
	Scanner input = new Scanner(System.in);
                
                
	String firstname ,lastname ,username, password, phone;
        
	//Prompt and Receiving user inputs
        System.out.print("Enter First Name: ");
	firstname = input.nextLine();
        System.out.print("Enter Last Name: ");
	lastname = input.nextLine();
	System.out.print("Enter Username: ");
	username = input.nextLine();
	System.out.print("Enter Password: ");
	password = input.nextLine();
	System.out.print("Enter Phone Number (starting with South African international code (+27)): ");
	phone = input.nextLine();
		
	Login login = new Login();//Create and instantiate Login object
        
	boolean  validatePhone = login.checkCellPhoneNumber(phone);
	boolean  validateUsername = login.checkUserName(username);
	boolean  validatePassword = login.checkPasswordComplexity(password);
        
        //Checks and validate username
	if(validateUsername == true){
	    System.out.println("Username successfully captured.");
	}else{
           System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
	}
		
        
	if(validatePassword == true){
	    System.out.println("Password  successfully captured.");
	}else{
	    System.out.println("Password  is not correctly formatted; please ensure that the password contains at least eight characters, a capital and small letter, a number, and a special character.");
        }
        
	
        //Checks and validate phone number
	if(validatePhone == true){
	    System.out.println("Cell phone number successfully added.");
	}else{
	   System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
	}
	}
}