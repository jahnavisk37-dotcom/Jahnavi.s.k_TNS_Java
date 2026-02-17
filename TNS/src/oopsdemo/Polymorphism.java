 package oopsdemo;

class Bird {
 void sound() {
     System.out.println("Bird makes a sounds");
 }
}

class pigeon extends Bird {
 void sound() {
     System.out.println("Pigeon sounds");
 }
}

class parrot extends Bird {
 void sound() {
     System.out.println("parrot sounds");
 }
}

public class Polymorphism {
 public static void main(String[] args) {

     Bird a;

     a = new pigeon();   
     a.sound();

     a = new parrot();  
     a.sound();
 }
}