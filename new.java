import java.util.Scanner;

class Student
{
    int roll;   // removed 'mm'
    String name;
    int[] marks = new int[5];
    int total;
   
    void assignDetail(Scanner sc)
    {
       
        System.out.print("Enter name: ");
        name = sc.nextLine();
       
        System.out.print("Enter roll: ");
        roll = sc.nextInt();
    }
   
    void assignMarks(Scanner sc)
    {
        System.out.println("Enter marks of 5 subjects:");
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
   
    void calculateTotal()
    {
        total = 0;
        for(int m : marks)
        {
            total += m;
        }
    }
   
    String calculateGrade()
    {
        double percent = total / 5.0;
        if(percent >= 80) return "A";
        else if(percent >= 60) return "B";
        else if(percent >= 40) return "C";
        return "F";
    }
   
    void display()
    {
        System.out.println("\nStudent Result");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Grade: " + calculateGrade());
    }
}
import java.util.Scanner;
class Result
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.assignDetail(sc);
        s.assignMarks(sc);
        s.calculateTotal();
        s.display();
    }
}
