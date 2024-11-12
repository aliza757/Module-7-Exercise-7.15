import java.util.ArrayList;
import java.util.Scanner;

public class ElimDupes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int[] distinctList = eliminateDuplicates(list);

        System.out.print("The distinct numbers are: ");
        for (int num : distinctList) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> distinctList = new ArrayList<>();

        for (int value : list) {
            if (!distinctList.contains(value)) {
                distinctList.add(value);
            }
        }

        int[] result = new int[distinctList.size()];
        for (int i = 0; i < distinctList.size(); i++) {
            result[i] = distinctList.get(i);
        }

        return result;
    }
}