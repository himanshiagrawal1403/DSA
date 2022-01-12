import java.util.Scanner;

public class Student {
    String name;
    int rollno;
    int marks;


    public Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}

     class NonPrimitiveTypeArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            Student arr[] = new  Student[5];

            for(int i=0;i<arr.length;i++)
            {
                arr[i]= new Student(sc.next(),sc.nextInt(),sc.nextInt());//object creation
            }
            for(int i=0;i< arr.length;i++)
            {
                System.out.println(arr[i].name + " "+ arr[i].marks +" " + arr[i].rollno  +" ");
            }

        }
    }

