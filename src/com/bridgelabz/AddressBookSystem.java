package com.bridgelabz;
import java.util.Scanner;

 class contacts {
     String firstname;
     String lastname;
     String city;
     long phoneNumber;


    public contacts(String firstname,String lastname,String city,long phoneNumber)
     {
         System.out.println("The Contact Details are as follows");
         this.firstname=firstname;
         this.lastname=lastname;
         this.city=city;
         this.phoneNumber=phoneNumber;

         System.out.println("Name of the contact is : "+this.firstname+" "+this.lastname);
         System.out.println("City is "+this.city);
         System.out.println("Phone number= "+this.phoneNumber);

     }



}

public class AddressBookSystem {

    public static void main(String[] args) {

        System.out.println("Welcome to address Book");
        Scanner s1=new Scanner(System.in);
        System.out.println("please enter the details of first contact(firstname,lastname,city,state and phone number)");
        contacts c1= new contacts(s1.nextLine(),s1.nextLine(),s1.nextLine(),s1.nextLong());
        Scanner s2=new Scanner(System.in);
        System.out.println("Please enter the details of second contact(firstname,lastname,city,state and phone number)");
        contacts c2= new contacts(s2.nextLine(),s2.nextLine(),s2.nextLine(),s2.nextLong());
        Scanner s3=new Scanner(System.in);
        System.out.println("Please enter the details of third contact(firstname,lastname,city,state and phone number)");
        contacts c3= new contacts(s3.nextLine(),s3.nextLine(),s3.nextLine(),s3.nextLong());


        }



    }

