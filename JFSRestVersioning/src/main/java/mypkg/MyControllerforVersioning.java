package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerforVersioning {
	
	//@GetMapping("v1/user")
	@GetMapping(value="/user/param", params="version=1")
	public User createUser(){
		return new User("Mithra Joshvi");
	}
	
	
	//@GetMapping("v2/user")
	@GetMapping(value="/user/param", params="version=2")
	public UserV2 createUserV2(){
   UserName name=new UserName("Mithra","Joshvi");
UserV2 obj2=new UserV2(name);
return obj2;


//return new UserV2(new UserName("Mithra","Joshvi"));
	}

}
