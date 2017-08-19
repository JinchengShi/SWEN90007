package com.hrs.service;

import java.util.List;

import com.hrs.model.Resume;

public interface ResumeService {
	public void add(Resume resume);

	public void edit(Resume resume);

	public void delete(int resume);

	public Resume getResume(int idResume);

	public List getAllResume();
}
