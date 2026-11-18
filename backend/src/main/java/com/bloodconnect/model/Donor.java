package com.bloodconnect.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
@Entity @Table(name="donors")
public class Donor {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String fullName;
 @Enumerated(EnumType.STRING) @NotNull private BloodGroup bloodGroup;
 @NotBlank private String city;
 @NotBlank @Pattern(regexp="^[0-9+() -]{7,20}$") private String phone;
 @Email private String email;
 private boolean available=true;
 private LocalDateTime createdAt=LocalDateTime.now();
 public Long getId(){return id;} public String getFullName(){return fullName;} public void setFullName(String v){fullName=v;}
 public BloodGroup getBloodGroup(){return bloodGroup;} public void setBloodGroup(BloodGroup v){bloodGroup=v;}
 public String getCity(){return city;} public void setCity(String v){city=v;} public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;} public boolean isAvailable(){return available;} public void setAvailable(boolean v){available=v;}
 public LocalDateTime getCreatedAt(){return createdAt;}
}
