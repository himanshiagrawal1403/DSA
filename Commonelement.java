import java.util.Arrays;


public class Commonelement {
    public static void main(String[] args) {


    int arr1[]={1,2,3,4,5};
   int arr2[]={8,9,10,2,3};

        System.out.println(Arrays.toString(arr1));
     System.out.println(Arrays.toString(arr2));

        for (int a = 0; a < arr1.length; a++) {
            for(int j=0;j<arr2.length;j++){
                if (arr1[a]==arr2[j]){
                    System.out.print(arr1[a]+ " ");
                }
            }

        }


}}
