package com.java.practice.java8Examples;

public class Greeter {

    private static final long serialVersionUID = 5462223600l;

    public void greet(Greeting greeting){
       greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        //Greeting helloWorldGreting = new HelloWorldGreting();

       Greeting lambdaGreeting = ()->System.out.println("Hello Java 8");

       Greeting innerClassGreeting = new Greeting() {
           @Override
           public void perform() {
               System.out.println("Hello Java 8");
           }
       };
        greeter.greet(lambdaGreeting);
        greeter.greet(()->System.out.println("Hello Java 8"));
        greeter.greet(innerClassGreeting);
    }
}


