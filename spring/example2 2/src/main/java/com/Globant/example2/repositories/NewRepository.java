package com.Globant.example2.repositories;

import com.Globant.example2.entities.New;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewRepository extends JpaRepository<New,String> {
}
