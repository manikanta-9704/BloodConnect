package com.bloodconnect.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
@Entity @Table(name="blood_requests")
public class BloodRequest {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String patientName;
 @Enumerated(EnumType.STRING) @NotNull private BloodGroup bloodGroup;
 @NotBlank private String city; @NotBlank private String hospitalName;
 @Min(1) @Max(20) private int unitsRequired;
 @Enumerated(EnumType.STRING) @NotNull private Urgency urgency;
 @NotBlank private String contactPhone; private String status="OPEN";
 private LocalDateTime createdAt=LocalDateTime.now();
 public Long getId(){return id;} public String getPatientName(){return patientName;} public void setPatientName(String v){patientName=v;}
 public BloodGroup getBloodGroup(){return bloodGroup;} public void setBloodGroup(BloodGroup v){bloodGroup=v;}
 public String getCity(){return city;} public void setCity(String v){city=v;} public String getHospitalName(){return hospitalName;} public void setHospitalName(String v){hospitalName=v;}
 public int getUnitsRequired(){return unitsRequired;} public void setUnitsRequired(int v){unitsRequired=v;} public Urgency getUrgency(){return urgency;} public void setUrgency(Urgency v){urgency=v;}
 public String getContactPhone(){return contactPhone;} public void setContactPhone(String v){contactPhone=v;} public String getStatus(){return status;} public LocalDateTime getCreatedAt(){return createdAt;}
}
