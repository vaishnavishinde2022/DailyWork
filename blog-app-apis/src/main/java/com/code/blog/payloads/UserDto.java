package com.code.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
//Dto = data transfer object
public class UserDto 
{
	  private int id;
	  
	  @NotEmpty
	  @Size(min = 4,message="Username must be min of 4 characters !!")
	  private String name;
	  
	  @Email(regexp="[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",message="Email address is not valid !!")
	  private String email;
	  
	  @NotEmpty
	  @Size(min = 3,max = 10,message="Password must be min of 3 chars and max of 10 chars !!")
	  private String password;
	  
	  @NotEmpty
	  private String about;
}
