package com.company;

public final class ObjectC extends ObjectB{
    private int day;
    private String month;
    public ObjectC(int privet, String poka, Class4 class4, Numbers numbers) {
        super(privet, poka, class4, numbers);
    }
    @Override
    public void method() {
        System.out.println("привет, как дела?");
    }
}
