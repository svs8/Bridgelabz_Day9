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
        System.out.println("please enter the details of first contact(firstname,lastname,city, phone number)");
        contacts c1= new contacts(s1.nextLine(),s1.nextLine(),s1.nextLine(),s1.nextLong());
        Scanner s2=new Scanner(System.in);
        System.out.println("Please enter the details of second contact(firstname,lastname,city,phone number)");
        contacts c2= new contacts(s2.nextLine(),s2.nextLine(),s2.nextLine(),s2.nextLong());
        Scanner s3=new Scanner(System.in);
        System.out.println("Please enter the details of third contact(firstname,lastname,city phone number)");
        contacts c3= new contacts(s3.nextLine(),s3.nextLine(),s3.nextLine(),s3.nextLong());

        System.out.println("enter the contact firstname whose number need to be changed ");
        Scanner s4=new Scanner(System.in);
        String name=s4.nextLine();
        if(name.equals(c1.firstname))
        {
            System.out.println("enter the number to be replaced for "+c1.firstname);
            c1.phoneNumber=s4.nextLong();
            System.out.println("Updated Details of "+c1.firstname+c1.lastname+"is, City: "+c1.city+" Phone Number "+ c1.phoneNumber);
        }
        else  if(name.equals(c2.firstname))
        {
            System.out.println("enter the number to be replaced for "+c2.firstname);
            c2.phoneNumber=s4.nextLong();
            System.out.println("Updated Details of "+c2.firstname+c2.lastname+"is, City: "+c2.city+" Phone Number "+ c2.phoneNumber);
        }
        else{
            System.out.println("enter the number to be replaced for "+c3.firstname);
            c3.phoneNumber=s4.nextLong();
            System.out.println("Updated Details of "+c3.firstname+c3.lastname+"is ,City: "+c3.city+" Phone Number "+ c3.phoneNumber);
        }


        }



    }

