/*
 * Program to Accept marks of 5 Students and
 * (a)Find out Maximum marks.
 * (b)Find out Minimum marks.
 */
import java.util.*;
public class MarksOfStudents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] marks = new int[5];
        int total=0;
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter marks for student " +(i + 1) + ": ");
            marks[i] = sc.nextInt();
           total=total+marks[i];
        }
             
        int maxMark = marks[0];
        int minMark = marks[0];
        
        for (int i = 1; i < 5; i++)
        {
            if (marks[i] > maxMark)
            {
                maxMark = marks[i];
            }
            if (marks[i] < minMark) 
            {
                minMark = marks[i];
            }
        }
        System.out.println("---------------");
        System.out.println("Total marks: "+total+"/500");
        System.out.println("---------------");
        System.out.println("Maximum marks: " + maxMark+"/100");
        System.out.println("Minimum marks: " + minMark+"/100");
        System.out.println("---------------");
        System.out.println("THANK YOU :)");
        
        sc.close();
    }
}