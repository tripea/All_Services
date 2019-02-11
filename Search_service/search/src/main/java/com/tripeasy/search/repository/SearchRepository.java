package com.tripeasy.search.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripeasy.search.entity.Search;

@Repository
public interface SearchRepository extends JpaRepository<Search, Integer>{
	
	 List<Search> findAllByType(String type);
	 

}
