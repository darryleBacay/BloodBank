import java.util.Scanner;

public class RunBloodData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1, input2;

        System.out.print("Enter blood type of patient: ");
        input1 = sc.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        input2 = sc.nextLine();
        sc.close();

        BloodData bd;
        if (input1.isBlank() && input2.isBlank()) {
            bd = new BloodData();
        } else {
            bd = new BloodData(input1, input2);
        }

        bd.display();

    }
}