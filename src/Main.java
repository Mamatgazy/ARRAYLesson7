import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[5]; //Массив
//        array[0] =455;
//        array[1]=279;
//        array[2]=543;
//        array[3]=4;
//        array[4]=75;
        //               0    1    2   3   4

//        int[] array1 = {455, 279, 543, 4, 75};

//        int[] q = new int[5];
//        q[0] =100000;
//        q[1]=200000;
//        q[2]=30000;
//        q[3]=400000;
//        q[4]=500000;
//
//        int[] q = {100000, 200000, 30000, 400000, 500000};
        // индекс       0   1   2   3    4   5   6     7   8   9  10
//        int[] array = {121,242,353,4545,466,434,6545,6576,878,989,444};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        Random random= new Random();
        int[] array = new int[10];
        int summ =0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            summ = summ + array[i];
            System.out.print(array[i]+" ");
        }
        System.out.println("\n Массивдин сандарынын арифметикалык орточо саны = "+(summ/array.length));





    }
}