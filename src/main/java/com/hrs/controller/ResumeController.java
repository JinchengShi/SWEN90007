package com.hrs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hrs.model.Resume;
import com.hrs.service.ResumeService;

@Controller
public class ResumeController {
	@Autowired
	private ResumeService resumeService;

	@RequestMapping("/jobseeker/jobseekerpage")
	public String setupForm(Map<String, Object> map) {
		Resume resume = new Resume();
		map.put("resume", resume);
		map.put("resumeList", resumeService.getAllResume());
		return "resume";
	}

	@RequestMapping(value = "/resume.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Resume resume, BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		Resume resumeResult = new Resume();
		switch (action.toLowerCase()) { 
		case "add":
			resumeService.add(resume);
			resumeResult = resume;
			break;
		case "edit":
			resumeService.edit(resume);
			resumeResult = resume;
			break;
		case "delete":
			resumeService.delete(resume.getIdResume());
			resumeResult = new Resume();
			break;
		case "search":
			Resume searchedresume = resumeService.getResume(resume.getIdResume());
			resumeResult = searchedresume != null ? searchedresume : new Resume();
			break;
		}
		map.put("resume", resumeResult);
		map.put("resumeList", resumeService.getAllResume());
		return "resume";
	}
}
