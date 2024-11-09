package com.project.authentication_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data


public class RolePojo {
	private long roleId;
	private String name;

	private UserCredentialPojo usersCrentials;

}
