package HW_1;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 5, 44, 33, 8, 14, 10};
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if ((arr[i]%2 == 0) && (arr[i] > 10)){
                count = count +1;

                System.out.println("Четное число " + arr[i]);
                System.out.println("Count: " + count );

            }
        }

    }
}