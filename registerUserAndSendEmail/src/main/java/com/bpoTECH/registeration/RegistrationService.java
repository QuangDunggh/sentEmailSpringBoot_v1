package com.bpoTECH.registeration;

import org.springframework.stereotype.Service;

import com.bpoTECH.appUser.AppUser;
import com.bpoTECH.appUser.AppUserRole;
import com.bpoTECH.appUser.AppUserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegistrationService {

	private final EmailValidator emailValidator;

	private final AppUserService appUserService;

	public String register(RegistrationRequset request) {
		boolean isValidEmail = emailValidator.test(request.getEmail());
		if (!isValidEmail) {
			throw new IllegalStateException("email not valid");
		}
		return appUserService.signUpUser(new AppUser(request.getFirstName(), request.getLastName(), request.getEmail(),
				request.getPassword(), AppUserRole.USER));
	}

}
