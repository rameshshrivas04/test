package com.sird.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sird.domain.Assembly;

public interface AssemblyRepository extends CrudRepository<Assembly, Integer> {

	List <Assembly> findAll();
}
