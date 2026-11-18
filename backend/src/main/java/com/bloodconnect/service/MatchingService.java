package com.bloodconnect.service;
import com.bloodconnect.model.*;
import com.bloodconnect.repo.*;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class MatchingService {
 private final DonorRepository donors; private final BloodRequestRepository requests;
 public MatchingService(DonorRepository d,BloodRequestRepository r){donors=d;requests=r;}
 // Exact-group/city filter is a demo lead generator, not a medical compatibility calculation.
 public List<Donor> findMatches(Long id){
  BloodRequest req=requests.findById(id).orElseThrow(()->new NoSuchElementException("Blood request not found"));
  return donors.findByAvailableTrueAndCityIgnoreCase(req.getCity()).stream().filter(d->d.getBloodGroup()==req.getBloodGroup()).toList();
 }
}
