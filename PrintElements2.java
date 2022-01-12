import java.util.Scanner;

public class PrintElements2 {
    int arr[];//instance variable

    PrintElements2() {
        arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }


    }
}
    class Elements {
        public static void main(String[] args) {
            PrintElements2 obj1 = new PrintElements2();
            for (int i = 0; i < obj1.arr.length; i++) {
                System.out.println(obj1.arr[i]);

            }

        }

    }

