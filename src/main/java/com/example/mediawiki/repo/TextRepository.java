package com.example.mediawiki.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mediawiki.entity.Text;

public interface TextRepository extends JpaRepository<Text, Integer> {

}
