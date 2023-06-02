/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Administrator
 */
public class Recipe {
    private int number;
    private Patient patient;
    private String drugName;
    private double dose;
    private String receptionMethod;

    public Recipe(int number, Patient patient, String drugName, double dose, String receptionMethod) {
        this.number = number;
        this.patient = patient;
        this.drugName = drugName;
        this.dose = dose;
        this.receptionMethod = receptionMethod;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getDose() {
        return dose;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public String getReceptionMethod() {
        return receptionMethod;
    }

    public void setReceptionMethod(String receptionMethod) {
        this.receptionMethod = receptionMethod;
    }

    @Override
    public String toString() {
        return "Recipe{" + "number=" + number + ", patient=" + patient + ", drugName=" + drugName + ", dose=" + dose + ", receptionMethod=" + receptionMethod + '}';
    }

    
    
}
