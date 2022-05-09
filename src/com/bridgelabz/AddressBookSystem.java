package com.bridgelabz;
import java.util.Scanner;

 class contacts {
     String firstname;
     String lastname;
     String city;
     String phoneNumber;




    public contacts(String firstname,String lastname,String city,String phoneNumber)
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

    static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to address Book");
        System.out.println("please enter the details of first contact(firstname,lastname,city, phone number)");
        contacts c1= new contacts(s.next(),s.next(),s.next(),s.next());
        System.out.println("Please enter the details of second contact(firstname,lastname,city,phone number)");
        contacts c2= new contacts(s.next(),s.next(),s.next(),s.next());
        System.out.println("Please enter the details of third contact(firstname,lastname,city phone number)");
        contacts c3= new contacts(s.next(),s.next(),s.next(),s.next());

        System.out.println("enter the contact firstname whose number need to be changed ");
        String name=s.next();
        if(name.equals(c1.firstname))
        {
            System.out.println("enter the number to be replaced for "+c1.firstname);
            c1.phoneNumber=s.next();
            System.out.println("Updated Details of "+c1.firstname+c1.lastname+" is, City: "+c1.city+" Phone Number "+ c1.phoneNumber);
        }
        else  if(name.equals(c2.firstname))
        {
            System.out.println("enter the number to be replaced for "+c2.firstname);
            c2.phoneNumber=s.next();
            System.out.println("Updated Details of "+c2.firstname+c2.lastname+" is, City: "+c2.city+" Phone Number "+ c2.phoneNumber);
        }
        else{
            System.out.println("enter the number to be replaced for "+c3.firstname);
            c3.phoneNumber=s.next();
            System.out.println("Updated Details of "+c3.firstname+c3.lastname+" is ,City: "+c3.city+" Phone Number "+ c3.phoneNumber);
        }

        System.out.println("enter the contact firstname whose number need to be deleted ");
        String nameToBeDeleted=s.next();
        if(nameToBeDeleted.equals(c1.firstname))
        {
            c1.phoneNumber= null;
            System.out.println("Updated Details of "+c1.firstname+c1.lastname+" is, City: "+c1.city+" Phone Number "+ c1.phoneNumber);
        }
        else  if(name.equals(c2.firstname))
        {
            c2.phoneNumber=null;
            System.out.println("Updated Details of "+c2.firstname+c2.lastname+" is, City: "+c2.city+" Phone Number "+ c2.phoneNumber);
        }
        else{
            c3.phoneNumber=null;
            System.out.println("Updated Details of "+c3.firstname+c3.lastname+" is ,City: "+c3.city+" Phone Number "+ c3.phoneNumber);
        }

        }
    }

