package com.example.demoD;
import org.springframework.data.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CheckinRepository extends JpaRepository<Checkin,Integer>{


}
