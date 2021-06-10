package com.dwes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="comments")
public class Comment {

	@Id
	@GeneratedValue
	private int id;
	private String content;
	
	@ManyToOne
    @JoinColumn(name="post_id", nullable=false)
	@JsonIgnore
	private Post post;
	
	
	
	public Comment(String content, Post post) {
		this.content = content;
		this.post = post;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
	
	
}
