package org.zerock.persistence;

import org.zerock.dto.LoginDto;
import org.zerock.dto.UserDto;

public interface UserDao {
	public UserDto login(LoginDto lDto) throws Exception;
	
}
