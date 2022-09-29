package com.example.SpringFamily.Repo;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringFamily.Entity.Small;
public interface FamRepo extends JpaRepository<Small, Id>{

}
