package com.hrs.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrs.dao.ResumeDao;
import com.hrs.model.Resume;

@Repository
public class ResumeDaoImpl implements ResumeDao {

	@Autowired
	private SessionFactory session;

	@Override
	public void add(Resume resume) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(resume);
	}

	@Override
	public void edit(Resume resume) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(resume);
	}

	@Override
	public void delete(int idResume) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getResume(idResume));
	}

	@Override
	public Resume getResume(int idResume) {
		// TODO Auto-generated method stub
		return (Resume) session.getCurrentSession().get(Resume.class, idResume);
	}

	@Override
	public List getAllResume() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Resume").list();
	}

}
