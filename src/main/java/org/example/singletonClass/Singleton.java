package org.example.singletonClass;
// In this place, i created a class Singleton and  i am defining your attribute
public final class Singleton {


    // Note this attribute, it has to be static!
    private static Singleton instance;

    // Here, i am defining the value, that will receive
    public static  String value;


    // The construtor
    private Singleton(String value) {
        this.value = value;
    }


    // In this case, we can see this, what we do a verification if instance is null, if so, we craete a new instance, if not,  we return the last instance.
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }

        // returning the last instance

        // This is a singleton!!!
        return instance;
    }

    // Alternative for the resolve a problem from singleton, is a created method for update the instance

    public static void setValue(String newValue) {
        value = newValue;
    }
}
