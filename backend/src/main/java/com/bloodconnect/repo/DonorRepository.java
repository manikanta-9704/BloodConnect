package com.bloodconnect.repo;
import com.bloodconnect.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface DonorRepository extends JpaRepository<Donor,Long> { List<Donor> findByAvailableTrueAndCityIgnoreCase(String city); }
