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
public class Patient {
    private int id, card;
    private String firstName, lastName, middleName, phoneNumber, diagnosis;
    private LocalDate birthDate;
    
       public Patient(int id, String lastName, String firstName, String middleName, String phoneNumber, int card, String diagnosis, LocalDate birthDate, Address address) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.card = card;
        this.diagnosis = diagnosis;
        this.birthDate = birthDate;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    private Address address;

    public int getId() {
        return id;
    }

    public int getCard() {
        return card;
    }

    public String getdiagnosis() {
        return diagnosis;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString(){
        return "id: " + id + "\n"+
                "Фамилия: " + lastName + "\n"+
                "Имя: " + firstName + "\n"+
                "Отчество: " + middleName + "\n"+
                "Номер телефона: " + phoneNumber + "\n"+
                "Номер медицинской карточки: " + card + "\n" +
                "Диагноз: " + diagnosis + "\n"+
                "Дата рождения: " + birthDate + "\n"+
                "Адрес: " + address + "\n";
    }
    
}
