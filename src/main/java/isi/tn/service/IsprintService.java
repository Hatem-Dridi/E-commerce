package isi.tn.service;

import isi.tn.entities.Sprint;

import java.util.List;

public interface IsprintService {
    Sprint saveSprint(Sprint sprint);

    List<Sprint> findAllSprints();
}

