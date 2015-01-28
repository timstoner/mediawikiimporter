package com.example.mediawiki.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Page {

	@Id
	@Column(name = "page_id")
	private Integer id;

	@Column(name = "page_namespace")
	private Integer namespace;

	@Column(name = "page_title", columnDefinition = "VARBINARY")
	private String title;

	@Lob
	@Column(name = "page_restrictions", columnDefinition = "tinyblob")
	private String restrictions;

	@Column(name = "page_counter")
	private Long counter;

	@Column(name = "page_is_redirect", columnDefinition = "TINYINT(3)")
	private Boolean isRedirect;

	@Column(name = "page_is_new", columnDefinition = "TINYINT(3)")
	private Boolean isNew;

	@Column(name = "page_random")
	private Double random;

	@Lob
	@Column(name = "page_touched", columnDefinition = "binary(14)")
	private String touched;

	@Column(name = "page_links_updated")
	private byte[] linksUpdated;

	@Column(name = "page_latest")
	private Integer latest;

	@Column(name = "page_len")
	private Integer length;

	@Column(name = "page_content_model", columnDefinition = "VARBINARY")
	private String contentModel;

	@Column(name = "page_lang", columnDefinition = "VARBINARY")
	private String lang;

}
