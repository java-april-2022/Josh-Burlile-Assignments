package com.codingdojo.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 200)
    private String name;
    @NotBlank
    @Size(min = 3, max = 200)
    private String creator;
    @NotBlank
    @Size(min = 2, max = 40)
    private String currentVersion;
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Language() {
    }
    
    
    
    public Language(Long id, @NotBlank @Size(min = 3, max = 200) String name,
			@NotBlank @Size(min = 3, max = 200) String creator,
			@NotBlank @Size(min = 2, max = 40) String currentVersion, Date createdAt, Date updatedAt) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

//	public Book(String title, String desc, String lang, int pages) {
//        this.title = title;
//        this.description = desc;
//        this.language = lang;
//        this.numberOfPages = pages;
//    }

    //insert getters and setters here    
   
    
    
    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCreator() {
		return creator;
	}



	public void setCreator(String creator) {
		this.creator = creator;
	}



	public String getCurrentVersion() {
		return currentVersion;
	}



	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}



	public Date getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}



	public Date getUpdatedAt() {
		return updatedAt;
	}



	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}



	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}