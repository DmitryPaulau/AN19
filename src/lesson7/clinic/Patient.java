package lesson7.clinic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lesson7.clinic.Treatment_plan.CUNGEONCODE;
import static lesson7.clinic.Treatment_plan.DENTISTCODE;

public class Patient {

    public void treatment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Код лечения: ");
        int treatmentCode = scanner.nextInt();
        if (treatmentCode == CUNGEONCODE) {
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (treatmentCode == DENTISTCODE) {
            Dentist dentist = new Dentist();
            dentist.treat();
        } else {
            Therapist therapist = new Therapist();
            therapist.treat();
        }
    }
}
