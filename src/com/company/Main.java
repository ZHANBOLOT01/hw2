package com.company;

public class Main {

    public static void main(String[] args) {
        // dz 1
        System.out.println(nameofMetod(25, 18));
        System.out.println(nameofMetod(35, 12));
        System.out.println(nameofMetod(3, 2));
        System.out.println(nameofMetod(12, 45));
        System.out.println(nameofMetod(52, 55));


        // dz 2
        int tempreture = 24;
        int ageRandom = generateRandomAge();
        System.out.println(nameofMetod(tempreture, ageRandom) + " With Random Age");
    }
//первое дз

    private static String nameofMetod(int tempreture, int age) {

        if (age > 20 && age < 45 && tempreture > -20 && tempreture < 30) {
            return "Можно идти гулять ";
        } else if (age < 20 && age > 0 && tempreture >= 0 && tempreture < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && tempreture >= -10 && tempreture < 25) {
            return "Можно идти гулять";
        } else
            return "Оставайтесь дома";
    }

    //второе дз
    public static int generateRandomAge() {
        int a = 0;
        int b = 20;
        int randomAge = a + (int) (Math.random() * b);
        return randomAge;
    }
}


