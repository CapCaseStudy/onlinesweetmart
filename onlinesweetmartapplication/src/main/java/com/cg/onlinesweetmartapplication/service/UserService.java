package com.cg.onlinesweetmartapplication.service;

import java.util.List;

import com.cg.onlinesweetmartapplication.exceptions.UserNotFoundException;
import com.cg.onlinesweetmartapplication.model.UserDTO;

public interface UserService {

	public UserDTO addUser(UserDTO user);

	public UserDTO updateUser(UserDTO user) throws UserNotFoundException;

	public UserDTO cancelUser(int userId) throws UserNotFoundException;

	public List<UserDTO> showAllUsers();
}
