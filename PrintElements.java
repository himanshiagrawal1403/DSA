import java.util.Scanner;

public class PrintElements {



        public static void main(String[] args) {
            int arr[];//declaraction
            arr = new int[5];//creation
            Scanner sc = new Scanner (System.in);
           System.out.println("enter the 5 elements");
            for(int i=0;i< arr.length;i++)
            {
                arr[i]= sc.nextInt();
            }
            for (int res:arr) {
                System.out.println(res);

            }
        }
    }

