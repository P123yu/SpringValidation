package com.valid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valid.model.ValidModel;

public interface ValidRepository extends JpaRepository<ValidModel,Long> {

}
