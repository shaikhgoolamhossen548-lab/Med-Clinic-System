/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author Admin
 */
public class Doctor {
   private int id;
    private String lastName;
    private String firstName;
    private String specialization;
    private String contactNumber;
    private String homeAddress;

    public Doctor(int id, String lastName, String firstName, String specialization, 
                  String contactNumber, String homeAddress) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
        this.homeAddress = homeAddress;
    }

    // Getters
    public int getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getFullName() { return firstName + " " + lastName; }
    public String getSpecialization() { return specialization; }
    public String getContactNumber() { return contactNumber; }
    public String getHomeAddress() { return homeAddress; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public void setHomeAddress(String homeAddress) { this.homeAddress = homeAddress; }
}
