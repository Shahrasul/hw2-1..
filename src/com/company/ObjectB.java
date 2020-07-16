package com.company;

public class ObjectB extends ObjectA {
    private int year;
    private String name;
    public ObjectB(int privet, String poka, Class4 class4, Numbers numbers) {
        super(privet, poka, class4, numbers);
    }
    public void method() {
        System.out.println("привет");
    }
    public final void method(String house){
        System.out.println("пока");
    }
}

