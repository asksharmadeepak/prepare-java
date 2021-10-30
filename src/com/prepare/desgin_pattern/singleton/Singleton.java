package com.prepare.desgin_pattern.singleton;

//Double Locking of Critical Section
//Final Class
//Prevent Singleton Pattern From Reflection
//Deserialization
//Cloning

import java.io.Serializable;

final public class Singleton implements Serializable, Cloneable {

    private static Singleton instance = null;

    private Singleton() {
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException  {
        throw new CloneNotSupportedException();
    }

    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance=  new Singleton();
                }
            }
        }
        return instance;
    }

}
