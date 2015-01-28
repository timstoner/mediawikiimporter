package com.example.mediawiki.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mediawiki.entity.Page;

public interface PageRepository extends JpaRepository<Page, Integer> {

}
