package com.company;

public class ObjectA {
    private int privet;
    private String poka;
    private Class4 class4;
    private Numbers numbers;

    public ObjectA(int privet, String poka, Class4 class4, Numbers numbers) {
        this.privet = privet;
        this.poka = poka;
        this.class4 = class4;
        this.numbers = numbers;
    }

    public int getPrivet() {
        return privet;
    }

    public String getPoka() {
        return poka;
    }

    public Class4 getClass4() {
        return class4;
    }

    public Numbers getNumbers() {
        return numbers;
    }
}
