import java.util.Scanner;
import java.util.Arrays;

public class ArrayListRepeatingNumbers {

    static void CreateArrayList(int[] ArrayList, int size){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++)
        {
            System.out.print(i + ". item:  ");
            ArrayList[i] = input.nextInt();
        }
        System.out.print("Your ArrayList:  " + Arrays.toString(ArrayList));
        System.out.println();
    }
    static boolean IsRepeating(int[] ArrayList, int value){
        for (int i : ArrayList)
        {
            if (i == value)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("How many item for ArrayList:  ");
        int ArraySize = input.nextInt();

        int[] MyArrayList = new int[ArraySize];
        //Creating ArrayList By User (Method)
        CreateArrayList(MyArrayList, ArraySize);


        //int[] MyArrayList = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] DuplicateArrayList = new int[MyArrayList.length];
        int StartIndex = 0;
        for (int i = 0; i < MyArrayList.length; i++) {
            for (int j = 0; j < MyArrayList.length; j++) {
                if ((i != j) && (MyArrayList[i] == MyArrayList[j])) {
                    if (!IsRepeating(DuplicateArrayList, MyArrayList[i])) {
                        DuplicateArrayList[StartIndex++] = MyArrayList[i];
                    }
                }
            }
        }
        System.out.println("Repeated Numbers: ");
        for (int K : DuplicateArrayList){
            if (K != 0){
                System.out.print(K);
                System.out.print(" - ");

            }
        }
        System.out.println();
        System.out.println("Repeated Even Numbers in ArrayList: ");
        for (int L : DuplicateArrayList){
            if (L % 2 == 0 && L != 0){
                System.out.print(L);
                System.out.print(" - ");
            }
        }

    }
}
