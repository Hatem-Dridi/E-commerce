package isi.tn.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import isi.tn.entities.User;
import isi.tn.repository.userRepository;

@Service
public class ImpluserService implements IuserService {
	
	@Autowired
	userRepository urepos;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return urepos.save(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return urepos.findAll();
	}

	

}
