package admission;
import admission.*;
import education.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    Student_Details student = new Student_Details();
    System.out.println("Enter Student name : ");    
    student.name = scanner.nextLine();    
    System.out.println("Enter dept : ");
    student.dept = scanner.nextLine();
    System.out.println("Enter dob : ");
    student.dob = scanner.nextInt();

    scanner.nextLine(); //handling

    Library lib = new Library();
    System.out.println("Enter book_name : ");
    lib.book_name = scanner.nextLine();
    System.out.println("Enter issue_date : ");
    lib.issue_date = scanner.nextInt();
    System.out.println("Enter return_date : ");
    lib.return_date = scanner.nextInt();

    scanner.nextLine();//handling

    Assignment as = new Assignment();
    System.out.println("Enter Assign subject: ");
    as.assign_subject = scanner.nextLine();
    System.out.println("Enter Assign number: ");
    as.assign_no = scanner.nextInt();
    System.out.println("Enter Assign marks: ");
    as.marks_on_assign = scanner.nextInt();

    scanner.nextLine();//handling

    Exam exam = new Exam();
    System.out.println("Enter Exam subject: ");
    exam.subject = scanner.nextLine();
    System.out.println("Enter Exam marks: ");
    exam.marks = scanner.nextInt();
    int ch=0;
    while(true)
    {
    System.out.println("\n1.Student_Details\n2.Book Details\n3.Assignment Details\n4.Exam Details\n5.Exit");
    ch = scanner.nextInt();
           switch(ch)
            {
                case 1:
                {
                   student.display();
                    break;
                }
                case 2:
                {
                    lib.display();
                    break;
                }
                case 3:
                {
                    as.display();
                    break;
                }
                case 4:
                {
                    exam.display();
                    break;
                }
                case 5: 
                    return;
                default:
                {
                    System.out.println("Wrong Input");
                    break;
                }
            }
        }
    }
}
