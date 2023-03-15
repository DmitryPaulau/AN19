package lesson7.clinic;

import java.util.Scanner;

public class Treatment_plan {
    public Treatment_plan() {
    }

    public static void treatment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Код лечения: ");
        int treatmentCode = scanner.nextInt();
        if (treatmentCode == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (treatmentCode == 2) {
            Dentist dentist = new Dentist();
            dentist.treat();

        } else {
            Therapist therapist = new Therapist();
            therapist.treat();
        }
    }
}
