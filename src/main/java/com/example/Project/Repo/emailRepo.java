package com.example.Project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Project.Entity.email;

public interface emailRepo extends JpaRepository<email, Integer> {
}
