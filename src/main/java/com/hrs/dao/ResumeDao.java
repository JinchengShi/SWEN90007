package com.hrs.dao;

import com.hrs.model.Resume;

import java.util.List;

public interface ResumeDao {
	public void add(Resume resume);

	public void edit(Resume resume);

	public void delete(int resume);

	public Resume getResume(int idResume);

	public List getAllResume();
}
