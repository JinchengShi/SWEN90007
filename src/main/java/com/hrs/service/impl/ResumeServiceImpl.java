package com.hrs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrs.dao.ResumeDao;
import com.hrs.model.Resume;
import com.hrs.service.ResumeService;

@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired
	private ResumeDao resumeDao;

	@Transactional
	public void add(Resume resume) {
		// TODO Auto-generated method stub
		resumeDao.add(resume);
	}

	@Transactional
	public void edit(Resume resume) {
		// TODO Auto-generated method stub
		resumeDao.edit(resume);
	}

	@Transactional
	public void delete(int resume) {
		// TODO Auto-generated method stub
		resumeDao.delete(resume);
	}

	@Transactional
	public Resume getResume(int idResume) {
		// TODO Auto-generated method stub
		return resumeDao.getResume(idResume);
	}

	@Transactional
	public List getAllResume() {
		// TODO Auto-generated method stub
		return resumeDao.getAllResume();
	}

}
