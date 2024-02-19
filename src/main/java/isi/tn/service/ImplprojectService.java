package isi.tn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isi.tn.entities.Project;
import isi.tn.repository.projectRepository;

@Service
public class ImplprojectService implements IprojectService{


	@Autowired
	projectRepository prepo;

	@Override
	public List<Project> findAllProjects() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

	@Override
	public Project saveProject(Project pro) {
		// TODO Auto-generated method stub
		return prepo.save(pro);
	}
}
