package org.example;

import org.example.singletonClass.Singleton;

public class Main {
    public static void main(String[] args) {

        // Here created two instance, both with values different
        Singleton singleton = Singleton.getInstance("TEST INSTANCE 1 ");
        Singleton singleton2= Singleton.getInstance("TEST INSTANCE 2 ");

        // But, as we can see, both isntances have the same value

        // SINGLETON!!!
        System.out.println(singleton.value);
        System.out.println(singleton2.value);

        // This a implementaions, cause several problems, some of them is
        // Goes against SOLID principles ["Our class is breaking the Single Responsibility Principle by trying to solve two problems at the same time:
                                        // Ensure that it is instantiated only once and provide a global access point to that instance."]
        // Dependency Injection [" instead of exposing them through interfaces, and we should code against interfaces, not implementations."]


        // Using the monostate solution, just call the method set
        singleton.setValue("VALUE INSTANCE 1");
        singleton2.setValue("VALUE INSTANCE 2");

        System.out.println(singleton.value);
        System.out.println(singleton2.value);


    }
}