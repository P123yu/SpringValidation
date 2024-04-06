package com.valid.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ValidModel {
	
	@Valid
	
	@Id
	private Long rollNo;
	
	@NotNull(message="name cannot be null")
	@NotEmpty(message="name cannot be empty")
	private String name;
	
	@NotNull(message="email cannot be null")
	@NotBlank(message="email cannot be blank")
	@Email(message="please enter valid email")
	private String email;
	
	@NotNull(message="password cannot be null")
	@NotBlank(message="password cannot be blank")
	@Size(min=2,max=8,message="size should be >=2 to <=8")
	@Pattern(regexp="^[a-zA-Z0-9]+$",message="accept alphabets and numbers only")
	private String password;
	
	@Min(value=18,message="min age is 18")
	@Max(value=30,message="max age is 30")
	private Long age;

}
