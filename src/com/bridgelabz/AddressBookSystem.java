package com.bridgelabz;
import java.util.Scanner;

 class contacts {
     String firstname;
     String lastname;
     String city;
     String state;
     long pnumber;


     contacts(String firstname,String lastname,String city,String state,long pnumber)
     {
         this.firstname=firstname;
         this.lastname=lastname;
         this.city=city;
         this.state=state;
         this.pnumber=pnumber;

         System.out.println(this.firstname);
         System.out.println(this.lastname);
         System.out.println(this.city);
         System.out.println(this.state);
         System.out.println(this.pnumber);

     }


}



public class AddressBookSystem {

    public static void main(String[] args) {

        System.out.println("Welcome to address Book");
        System.out.println("The details of first contact");
        contacts c1= new contacts("RAM","A","bangalore","Karnataka",755980522);
        System.out.println("The details of Second contact");
        contacts c2= new contacts("SHAM","B","bangalore","Karnataka",264515123);
        System.out.println("The details of third contact");
        contacts c3= new contacts("RAJU","C","bangalore","Karnataka",983726152);


        }



    }

