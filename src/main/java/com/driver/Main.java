package com.driver;

public class Main {
  
    B objB=new B();
    String result= objB.meth();
}

class A{
    public String meth(){
    
        return "Invoking method from class A";
    }
}

class B extends A{
    public String meth() {
        return "Method is overridden in Extended class B";
     }
}