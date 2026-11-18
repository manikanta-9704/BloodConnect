package com.bloodconnect.controller;
import com.bloodconnect.model.Donor; import com.bloodconnect.repo.DonorRepository;
import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/donors") @CrossOrigin(origins="http://localhost:5173")
public class DonorController {
 private final DonorRepository repo; public DonorController(DonorRepository r){repo=r;}
 @GetMapping public List<Donor> all(){return repo.findAll();}
 @PostMapping public Donor create(@Valid @RequestBody Donor d){return repo.save(d);}
}
