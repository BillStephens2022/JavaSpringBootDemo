package com.billstephens.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// if you were to place a component outside the main folder, you would need
// to add it to the scanBasePackages.
//@SpringBootApplication(
//		scanBasePackages = {"com.billstephens.springboot.demo.mycoolapp",
//		"com.billstephens.springboot.demo.util"})


@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
