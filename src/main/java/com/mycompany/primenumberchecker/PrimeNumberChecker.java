/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumberchecker;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class PrimeNumberChecker {
    
   public static boolean isPrime(int n){
      if(n <= 1){
      return false;
      }
   for (int i = 2; i <= Math.sqrt(n); i++)
   {
       if(n % i == 0){
           return false;
   }
   }
   return true;
   }
   
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
   
    System.out.print("Enter a number:");
    
    int num = scanner.nextInt();
    
    if (isPrime(num)){
        System.out.println(num + "is a prime number.");}
    else{
       System.out.println(num + "is not a prime number.");
    }
    }
}
