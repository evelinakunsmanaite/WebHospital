/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;

/**
 *
 * @author Administrator
 */
public class PatientsList {
     private static Patient[] patients;

    static Address addressPatient1 = new Address("ул. Чкалова", "19/2", "43");
    static Address addressPatient2 = new Address("ул. Людникова", "17", "249");
    static Address addressPatient3 = new Address("пр. Строителей", "7", "228");
    static Address addressPatient4 = new Address("ул. Молодёжная", "21", "78");
    static Address addressPatient5 = new Address("ул. Чкалова", "14/2", "27");
    static LocalDate birthDatePatient1 = LocalDate.of(2002, 10, 14);
    static LocalDate birthDatePatient2 = LocalDate.of(2002, 9, 25);
    static LocalDate birthDatePatient3 = LocalDate.of(2003, 7, 23);
    static LocalDate birthDatePatient4 = LocalDate.of(2003, 8, 25);
    static LocalDate birthDatePatient5 = LocalDate.of(2004, 12, 24);

    static {
        patients = new Patient[5];
        patients[0] = new Patient(1, "Рябицкий",  "Андрей", "Викторович", "+375 29 756 6487",
                1, "Простуда", birthDatePatient1, addressPatient1);
        patients[1] = new Patient(2, "Кунсманайте",  "Эвелина", "Арвидасовна", "+375 33 317 5235",
                2, "Грипп", birthDatePatient2, addressPatient2);
        patients[2] = new Patient(3, "Сараев",  "Никита", "Олегович", "+375 29 816 8761",
                3, "Лысина", birthDatePatient3, addressPatient3);
        patients[3] = new Patient(4, "Хлуденко",  "Александр", "Сергеевич", "+375 29 133 7228",
                4, "Гастрит", birthDatePatient4, addressPatient4);
        patients[4] = new Patient(5, "Рыбиков",  "Даниил", "Александрович", "+375 29 121 2851",
                5, "Отравление", birthDatePatient5, addressPatient5);
    }

    public static Patient[] getPatients() {
        return patients;
    }
    
    public static Patient getPatientById(int id) {
    for (Patient patient : patients) {
        if (patient.getId() == id) {
            return patient;
        }
    }
    return null; 
}
}
