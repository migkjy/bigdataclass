package org.zerock.service;

import org.zerock.dto.LoginDto;
import org.zerock.dto.UserDto;

public interface UserService {
	
	public UserDto login(LoginDto lDto) throws Exception;
	
}
