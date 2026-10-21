/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author Admin
 */
public class Patient {
   
    private String nic;
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String gender;
    private String homeAddress;
    private String contactNumber;

    public Patient(String nic, String lastName, String firstName, String dateOfBirth, 
                   String gender, String homeAddress, String contactNumber) {
        this.nic = nic;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getNic() { return nic; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getFullName() { return firstName + " " + lastName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getGender() { return gender; }
    public String getHomeAddress() { return homeAddress; }
    public String getContactNumber() { return contactNumber; }

    // Setters
    public void setNic(String nic) { this.nic = nic; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setGender(String gender) { this.gender = gender; }
    public void setHomeAddress(String homeAddress) { this.homeAddress = homeAddress; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}
    
    
    
    

