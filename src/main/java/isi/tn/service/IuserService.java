package isi.tn.service;




import java.util.List;

import isi.tn.entities.User;

public interface IuserService {

	User saveUser(User user);

	List<User> findAllUsers();


}
