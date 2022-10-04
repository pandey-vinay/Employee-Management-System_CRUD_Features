package assignment.infoware.service;

import assignment.infoware.dto.UserRegistrationDto;
import assignment.infoware.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
