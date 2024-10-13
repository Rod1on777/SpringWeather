package com.RodionKor.spring;

import com.RodionKor.spring.DTO.CurrentResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Response;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Application.class, args);
	}
}
