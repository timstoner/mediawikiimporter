package com.example.mediawiki.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mediawiki.entity.Revision;

public interface RevisionRepository extends JpaRepository<Revision, Integer> {

}
