package isi.tn.service;

import isi.tn.entities.Sprint;
import isi.tn.entities.User;
import isi.tn.repository.sprintRepository;
import isi.tn.service.IsprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImplsprintService implements IsprintService {

    @Autowired
    sprintRepository sprrepo;

    @Override
    public List<Sprint> findAllSprints() {
        // TODO Auto-generated method stub
        return sprrepo.findAll();
    }

    @Override
    public Sprint saveSprint(Sprint spr) {
        // TODO Auto-generated method stub
        return sprrepo.save(spr);
    }
}


