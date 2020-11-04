package com.car.washing.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class DriverDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long driverDetailsId;

	@ManyToOne
	@JoinColumn(name = "driverId")
	@JsonIgnore
	private Driver driver;

	@Column(columnDefinition = "TEXT")
    private String commentCotents;

//    private User from ;
    
    private int commentStarts;

    @Lob
    @Basic(fetch=FetchType.EAGER)
    private byte[] commentPhoto ;
    
    private long commentCount = 0 ;
    
    @ManyToOne
    private User user;

    @Column(columnDefinition="DATETIME")
    private Date commentDate;
    
	public Long getDriverDetailsId() {
		return driverDetailsId;
	}

	public void setDriverDetailsId(Long driverDetailsId) {
		this.driverDetailsId = driverDetailsId;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getCommentCotents() {
		return commentCotents;
	}

	public void setCommentCotents(String commentCotents) {
		this.commentCotents = commentCotents;
	}

	public int getCommentStarts() {
		return commentStarts;
	}

	public void setCommentStarts(int commentStarts) {
		this.commentStarts = commentStarts;
	}

	public byte[] getCommentPhoto() {
		return commentPhoto;
	}

	public void setCommentPhoto(byte[] commentPhoto) {
		this.commentPhoto = commentPhoto;
	}

	public long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
}
