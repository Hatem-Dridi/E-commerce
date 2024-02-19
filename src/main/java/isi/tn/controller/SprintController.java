package isi.tn.controller;


import isi.tn.entities.Project;
import isi.tn.entities.Sprint;
import isi.tn.service.IprojectService;
import isi.tn.service.IsprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SprintController {

    @Autowired
    IsprintService sprserv;

    @GetMapping("/sprints")
    public List<Sprint> getAllSprints() {
        List<Sprint> spr = sprserv.findAllSprints();

        return spr;

    }

    @PostMapping("/addsprint")
    public Sprint createSprint(@Valid @RequestBody Sprint spr) {
        return sprserv.saveSprint(spr);
    }
}
