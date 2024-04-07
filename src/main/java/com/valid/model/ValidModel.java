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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    
    @Column(nullable = false, unique = true)
    @NotNull(message="empId cannot be null")
    @Min(value=2, message="empId should be >=2")
    @Max(value=8, message="empId should be <=8")
    private Long empId; 
    
    @NotNull(message="name cannot be null")
    @NotBlank(message="name cannot be empty")
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
    @NotNull(message="age cannot be null")
    private Long age;
}
