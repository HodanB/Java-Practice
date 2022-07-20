package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //How to Make Table
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AI
	private Integer id;
	
//	@Column(name = "bookTitle", nullable =  false, unique = true)
	private String title;
	private String author;
	private String genre;
	private int pages;
	private String releaseYear; 
	
	public Book() {
		super();

	}

	public Book(String title, String author, String genre, int pages, String releaseYear) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
		this.releaseYear = releaseYear;
	}

	public Book(Integer id,String title, String author, String genre, int pages, String releaseYear) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
		this.releaseYear = releaseYear;
		
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.pages;
		result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
		result = prime * result + ((this.author == null) ? 0 : this.author.hashCode());
		result = prime * result + ((this.genre == null) ? 0 : this.genre.hashCode());
		result = prime * result + ((this.releaseYear == null) ? 0 : this.releaseYear.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (this.pages != other.pages)
			return false;
		if (this.title == null) {
			if (other.title != null)
				return false;
		} else if (!this.title.equals(other.title))
			return false;
		if (this.author == null) {
			if (other.author != null)
				return false;
		} else if (!this.author.equals(other.author))
			return false;
		if (this.genre == null) {
			if (other.genre != null)
				return false;
		} else if (!this.genre.equals(other.genre))
			return false;
		if (this.releaseYear == null) {
			if (other.releaseYear != null)
				return false;
		} else if (!this.releaseYear.equals(other.releaseYear))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", pages=" + pages
				+ ", releaseYear=" + releaseYear + "]";
	}
	
	

}
