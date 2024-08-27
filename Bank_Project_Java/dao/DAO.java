package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.UserEntry;

public interface DAO extends CrudRepository<UserEntry, Long>{

}
