package com.amine.citiesapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RegisterRequestDto {
	
	@NotNull
	@NotBlank(message = "First name can't be blank")
	private String firstname;
	@NotNull
	@NotBlank(message = "Last name can't be blank")
	private String lastname;
	@NotNull
	@NotBlank(message = "Username name can't be blank")
	private String username;
	@NotNull
	@NotBlank(message = "Password name can't be blank")
	private String password;
	@NotNull
	@NotBlank(message = "Recaptcha token can't be blank")
	private String recaptchaToken;
	public RegisterRequestDto(String firstname, String lastname, String username, String password, String recaptchaToken) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.recaptchaToken = recaptchaToken;
	}
	
	public RegisterRequestDto() {}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getRecaptchaToken() {
		return recaptchaToken;
	}

	public void setRecaptchaToken(String recaptchaToken) {
		this.recaptchaToken = recaptchaToken;
	}

	@Override
	public String toString() {
		return "RegisterRequestDto [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + ", recaptchaToken=" + recaptchaToken + "]";
	}

	
	

}
