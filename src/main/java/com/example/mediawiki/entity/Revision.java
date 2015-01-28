package com.example.mediawiki.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Revision {

	@Id
	@Column(name = "rev_id")
	private Integer id;

	@Column(name = "rev_page")
	private Integer pageId;

	@Column(name = "rev_text_id")
	private Integer textId;

	@Lob
	@Column(name = "rev_comment", columnDefinition = "tinyblob")
	private String comment;

	@Column(name = "rev_user")
	private Integer user;

	@Lob
	@Column(name = "rev_user_text", columnDefinition = "VARBINARY")
	private String userText;

	@Lob
	@Column(name = "rev_timestamp", columnDefinition = "binary(14)")
	private String timestamp;

	@Column(name = "rev_minor_edit", columnDefinition = "TINYINT(3)")
	private Boolean isMinorEdit;

	@Column(name = "rev_deleted", columnDefinition = "TINYINT(3)")
	private Boolean isDeleted;

	@Column(name = "rev_len")
	private Integer length;

	@Column(name = "rev_parent_id")
	private Integer parentId;

	@Column(name = "rev_sha1", columnDefinition = "VARBINARY")
	private String sha1;

	@Column(name = "rev_content_model", columnDefinition = "VARBINARY")
	private String contentModel;

	@Column(name = "rev_content_format", columnDefinition = "VARBINARY")
	private String contentFormat;

}
