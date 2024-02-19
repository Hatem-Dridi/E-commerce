package isi.tn.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isi.tn.entities.Project;
import isi.tn.service.*;

@RestController
@RequestMapping("/api")
public class ProjectController {
	
	@Autowired 
	IprojectService pserv;
	
	@GetMapping("/projects")
	public List<Project> getAllProject() {
		List<Project> pro = pserv.findAllProjects();

        return pro;
	    
	}
	
	@PostMapping("/addproject")
	public Project createProject(@Valid @RequestBody Project pro) {
	    return pserv.saveProject(pro);
	}

}
