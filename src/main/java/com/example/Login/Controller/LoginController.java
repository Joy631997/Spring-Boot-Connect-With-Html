package com.example.Login.Controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login/")
public class LoginController {

	@RequestMapping(value = "cont", method = RequestMethod.GET)
	public ResponseEntity<?> loginMethod(@RequestParam Map<String, String> reqParam) throws Exception {
		System.out.println(reqParam);
		String user = reqParam.get("name");
		String pass = reqParam.get("pass");

		String userName = "joy";
		String password = "123";

		if (userName.equals(user) && password.equals(pass)) {
			reqParam.put("Status", "Login Successfully");
		} else {
			reqParam.put("Status", "Incorrect Credentials");
		}

		return new ResponseEntity<>(reqParam, HttpStatus.OK);
	}
}
