package com.hrs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resume {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // for autonumber
	private int idResume;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int age;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String education;
	@Column
	private String experience;
	@Column
	private String honor;

	public Resume() {
	}

	public Resume(int idResume, String firstname, String lastname, int age, String phone, String email,
			String education, String experience, String honor) {
		super();
		this.idResume = idResume;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.education = education;
		this.experience = experience;
		this.honor = honor;
	}

	public int getIdResume() {
		return idResume;
	}

	public void setIdResume(int idResume) {
		this.idResume = idResume;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getHonor() {
		return honor;
	}

	public void setHonor(String honor) {
		this.honor = honor;
	}
}
