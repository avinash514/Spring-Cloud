package com.example.TestSpringCloud;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@EnableBatchProcessing
@SpringBootApplication
public class TestSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringCloudApplication.class, args);
	}
}
