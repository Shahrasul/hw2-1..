package com.company;

public class Main {

    public static void main(String[] args) {
        Class4 class4 = new Class4("go");
        ObjectB objectA = new ObjectB(27, "wolf",class4, Numbers.ONE);
        ObjectC objectB = new ObjectC(11,"cow",class4,Numbers.TWO);
        ObjectC objectC = new ObjectC(32,"pig",class4,Numbers.THREE);
        System.out.println("число - " + objectA.getPrivet() +
                "\nживотное - " +objectA.getPoka() +
                "\nкласс4 - " + class4.getPole() +
                "\nцифра - " + objectA.getNumbers());
        System.out.println("число - " + objectB.getPrivet() +
                "\nживотное - " +objectB.getPoka() +
                "\nкласс4 - " + class4.getPole() +
                "\nцифра - " + objectB.getNumbers());
        System.out.println("число - " + objectC.getPrivet() +
                "\nживотное - " +objectC.getPoka() +
                "\nкласс4 - " + class4.getPole() +
                "\nцифра - " + objectC.getNumbers());


    }


}
