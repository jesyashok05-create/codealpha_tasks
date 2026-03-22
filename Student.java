import java .util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java. util.Scanner;

class Student{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> grades=new ArrayList<>();
        System.out.println("Enter thr number of students");
        int a= in.nextInt();
        in.nextLine();

        for(int i=0;i<a;i++){
            System.out.println("Enter the grade of students" +(i+1)+ "");
            grades.add(in.nextInt());
            System.out.println("grade added sucessfull");

        }
        System.out.println("All students Grades:"+grades);

        double num=0;
        for(double grade: grades){
            num += grade;
        }
        double average=num /grades.size();
        int Highest=Collections.max(grades);
        int lowest=Collections.min(grades);

        System.out.println("\n   Summary report");
        System.err.println("All the students grade");
        System.out.println("Average Grade:"+average); 
        System.out.println("Highest grade:"+Highest);
        System.out.println("Lowest grade:"+lowest);


    }
}