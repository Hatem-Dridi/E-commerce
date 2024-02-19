package isi.tn.service;

import java.util.List;



import isi.tn.entities.Project;

public interface IprojectService {

	List<Project> findAllProjects();

	Project saveProject(Project pro);

}
