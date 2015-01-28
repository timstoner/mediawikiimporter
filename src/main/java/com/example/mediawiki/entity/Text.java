package com.example.mediawiki.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Text {

	@Id
	@Column(name = "old_id")
	private Integer id;

	@Lob
	@Column(name = "old_text", columnDefinition = "mediumblob")
	private String text;

	@Lob
	@Column(name = "old_flags", columnDefinition = "tinyblob")
	private String flags;

}
