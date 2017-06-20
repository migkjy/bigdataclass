package org.zerock.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.dto.LoginDto;
import org.zerock.dto.UserDto;
import org.zerock.persistence.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDao dao;
	
	@Override
	public UserDto login(LoginDto lDto) throws Exception {
		return dao.login(lDto);
	}

}
