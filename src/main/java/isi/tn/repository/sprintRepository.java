package isi.tn.repository;
import isi.tn.entities.Sprint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sprintRepository extends JpaRepository<Sprint,Long> {

}
