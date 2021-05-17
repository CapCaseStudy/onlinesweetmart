package com.cg.onlinesweetmartapplication.repository;

import java.util.List;


import com.cg.onlinesweetmartapplication.entity.User;
import com.cg.onlinesweetmartapplication.exceptions.UserNotFoundException;

public interface UserRepository  {

	public User addUser(User user);
	public User updateUser(User user) throws UserNotFoundException;
	public User cancelUser(int userId) throws UserNotFoundException;
	public List<User> showAllUsers();

}
