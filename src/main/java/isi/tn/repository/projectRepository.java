package isi.tn.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import isi.tn.entities.*;
@Repository
public interface projectRepository extends JpaRepository<Project,Long> {

}
