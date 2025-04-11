/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkusername_method;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;

public class CheckUsername_Method {
    
    
    public static boolean checkusername(String username){
    
        if(username.contains("_") && username.length() <=5){
        
            return true;
        
        }else{
        return false;
        }
    
    }

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter your surname: ");
        String surname = scan.nextLine();
        System.out.println("Hello World!");
        
        
        while(true){
            
            System.out.println("Enter username: ");
            String username = scan.nextLine();
            
            if(checkusername(username)){
            
                System.out.println("Username succesfully captured!!");
                break;
            }else{
            
            System.out.println("username is not correctly formatted");
            }
        
        
        }
    }
}
