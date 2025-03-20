package sber_practice;

public class sayHi {
    public static void main (String[] args){
        sayHi("чувак");
    }
    public static void sayHi(String name){
        String welocmeText = "Добро пожаловать на курс, ";
        System.out.println(welocmeText + name + "!");

        int[] numberArray = new int[10];
        int i = 0;
        while (i < 10) {
            numberArray[i] = i;
            i++;
        }
        i = 0;
        while (i < 10) {
            System.out.println((i+1) + "-й элемент массива = " +  numberArray[i]);
            i++;
        }
        //int[] сolor = {255, 126, 255}; Коротая запись массива
    }


}
