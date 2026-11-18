package com.bloodconnect.controller;
import com.bloodconnect.model.*; import com.bloodconnect.repo.BloodRequestRepository; import com.bloodconnect.service.MatchingService;
import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/requests") @CrossOrigin(origins="http://localhost:5173")
public class BloodRequestController {
 private final BloodRequestRepository repo; private final MatchingService matching;
 public BloodRequestController(BloodRequestRepository r,MatchingService m){repo=r;matching=m;}
 @GetMapping public List<BloodRequest> all(){return repo.findAll();}
 @PostMapping public BloodRequest create(@Valid @RequestBody BloodRequest r){return repo.save(r);}
 @GetMapping("/{id}/matches") public List<Donor> matches(@PathVariable Long id){return matching.findMatches(id);}
}
