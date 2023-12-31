package com.project.onlinegrocerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinegrocerystore.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
