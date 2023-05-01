package zad8;

import java.util.Arrays;

public class Main{
   public static void main(String[] args){
       Student[] students = {
               new Student("Jan", "Kowalski", "s12345"),
               new Student("Anna", "Nowak", "s54321"),
               new Student("Piotr", "Szymański", "s23456")
       };

       Arrays.sort(students);

       for (Student student : students) {
           System.out.println(student.getImie() + " " + student.getNazwisko() + " (" + student.getIndeks() + ")");
       }
   }
}
