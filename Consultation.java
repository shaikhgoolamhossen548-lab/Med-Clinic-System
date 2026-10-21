/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author Admin
 */
public class Consultation {
   private int id;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String remark;

    public Consultation(int id, Patient patient, Doctor doctor, String date, String remark) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.remark = remark;
    }

    // Getters
    public int getId() { return id; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public String getDate() { return date; }
    public String getRemark() { return remark; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setPatient(Patient patient) { this.patient = patient; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }
    public void setDate(String date) { this.date = date; }
    public void setRemark(String remark) { this.remark = remark; }
}
