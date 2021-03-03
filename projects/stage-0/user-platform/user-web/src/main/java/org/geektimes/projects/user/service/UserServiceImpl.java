package org.geektimes.projects.user.service;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.repository.UserRepository;
import org.geektimes.projects.user.sql.DBConnectionManager;

public class UserServiceImpl implements UserService{

	private static final UserRepository userRepositry = DatabaseUserRepository.getDatabaseUserRepository(DBConnectionManager.getDBConnectionManager());
	
	private final static UserServiceImpl userService = new UserServiceImpl();
	private UserServiceImpl() {
		
	}
	public static UserServiceImpl getUserService() {
		return userService;
	}
	@Override
	public boolean register(User user) {
		return userRepositry.save(user);
	}

	@Override
	public boolean deregister(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User queryUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepositry.getById(id);
	}

	@Override
	public User queryUserByNameAndPassword(String name, String password) {
		// TODO Auto-generated method stub
		return userRepositry.getByNameAndPassword(name, password);
	}

}
