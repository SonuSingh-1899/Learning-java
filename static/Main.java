class StudentDetails {
    String name;
    int rollNo;
    static String school;

    StudentDetails(String n, int r) {
        name = n;
        rollNo = r;
    }

    static void changeSchool(String newName) {
        school = newName;
    }

    void display() {
        System.out.println(rollNo + " - " + name + " - " + school);
    }
}

public class Main {
    public static void main(String[] args) {
        StudentDetails.changeSchool("Delhi Public School");

        StudentDetails s1 = new StudentDetails("Sonu", 101);
        StudentDetails s2 = new StudentDetails("Amit", 102);
        StudentDetails s3 = new StudentDetails("Ravi", 103);

        s1.display();
        s2.display();
        s3.display();

        StudentDetails.changeSchool("Modern School");

        System.out.println("\nAfter changing school name:");
        s1.display();
        s2.display();
        s3.display();
    }
}
