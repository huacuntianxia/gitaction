package com.example.gitaction;

import com.example.gitaction.service.Helloword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitactionApplication {

	@Autowired
	Helloword helloword;

	public static void main(String[] args) {
		SpringApplication.run(GitactionApplication.class, args);
	}

	public int calulate(int a, int b)
	{
		int c = a *b;
		c +=1;
		return c;
	}

}
