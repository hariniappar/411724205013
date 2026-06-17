import java.util.Scanner;

public class StudentManagement{
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

        int[] id = new int[100];
        String[] name = new String[100];
        int[] age = new int[100];
        String[] gender = new String[100];
        String[] department = new String[100];
        String[] email = new String[100];
        String[] phone = new String[100];
        double[] cgpa = new double[100];

    int count = 0;
    int choice;

    do {
        System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. update student");
        System.out.println("5. Exit");
        System.out.print("Enter Choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

             case 1:
                System.out.print("Enter Student ID: ");
                id[count] = sc.nextInt();
                    sc.nextLine();

                System.out.print("Enter Name: ");
                name[count] = sc.nextLine();

                System.out.print("Enter Age: ");
                age[count] = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Gender: ");
                gender[count] = sc.nextLine();

                System.out.print("Enter Department: ");
                department[count] = sc.nextLine();
                System.out.print("Enter Email: ");
                email[count] = sc.nextLine();
                System.out.print("Enter Phone Number: ");
                phone[count] = sc.nextLine();
                System.out.print("Enter CGPA: ");
                cgpa[count] = sc.nextDouble();
                count++;
                System.out.println("Student Added Successfully!");
                break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Student Records Found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\n----- Student Details -----");
                            System.out.println("ID         : " + id[i]);
                            System.out.println("Name       : " + name[i]);
                            System.out.println("Age        : " + age[i]);
                            System.out.println("Gender     : " + gender[i]);
                            System.out.println("Department : " + department[i]);
                            System.out.println("Email      : " + email[i]);
                            System.out.println("Phone      : " + phone[i]);
                            System.out.println("CGPA       : " + cgpa[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            System.out.println("\nStudent Found");
                            System.out.println("ID         : " + id[i]);
                            System.out.println("Name       : " + name[i]);
                            System.out.println("Age        : " + age[i]);
                            System.out.println("Gender     : " + gender[i]);
                            System.out.println("Department : " + department[i]);
                            System.out.println("Email      : " + email[i]);
                            System.out.println("Phone      : " + phone[i]);
                            System.out.println("CGPA       : " + cgpa[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;
                case 4:
                   System.out.print("Enter Student ID to Update: ");
                   int updateId = sc.nextInt();
                   sc.nextLine();

                boolean updated = false;

    for (int i = 0; i < count; i++) {
        if (id[i] == updateId) {

            System.out.print("Enter New Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter New Age: ");
            age[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Gender: ");
            gender[i] = sc.nextLine();

            System.out.print("Enter New Department: ");
            department[i] = sc.nextLine();

            System.out.print("Enter New Email: ");
            email[i] = sc.nextLine();

            System.out.print("Enter New Phone Number: ");
            phone[i] = sc.nextLine();

            System.out.print("Enter New CGPA: ");
            cgpa[i] = sc.nextDouble();

            System.out.println("Student Updated Successfully!");
            updated = true;
            break;
        }
    }

    if (!updated) {
        System.out.println("Student Not Found!");
    }
    break;
                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
    case 4:
    System.out.print("Enter Student ID to Update: ");
    int updateId = sc.nextInt();
    sc.nextLine();

    boolean updated = false;

    for (int i = 0; i < count; i++) {
        if (id[i] == updateId) {

            System.out.print("Enter New Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter New Age: ");
            age[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Gender: ");
            gender[i] = sc.nextLine();

            System.out.print("Enter New Department: ");
            department[i] = sc.nextLine();

            System.out.print("Enter New Email: ");
            email[i] = sc.nextLine();

            System.out.print("Enter New Phone Number: ");
            phone[i] = sc.nextLine();

            System.out.print("Enter New CGPA: ");
            cgpa[i] = sc.nextDouble();

            System.out.println("Student Updated Successfully!");
            updated = true;
            break;
        }
    }

    if (!updated) {
        System.out.println("Student Not Found!");
    }
    break;
}