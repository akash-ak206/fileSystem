package com.sak.filesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FilesystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilesystemApplication.class, args);
	}

}
