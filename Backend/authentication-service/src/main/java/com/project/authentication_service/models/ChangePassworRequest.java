package com.project.authentication_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ChangePassworRequest {
	
	private String email;
	private String password;
	private String confirmPassword;

}