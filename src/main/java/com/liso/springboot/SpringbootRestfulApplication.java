package com.liso.springboot;

import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

@SpringBootApplication
public class SpringbootRestfulApplication {

	private static final String dateFormat = "yyyy-MM-dd";
	private static final String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulApplication.class, args);
	}

	@Bean
	private Jackson2ObjectMapperBuilderCustomizer jsonCustomizer() {
		return builder -> {
			builder.simpleDateFormat(dateFormat);
			builder.serializers(new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(dateFormat)));
			builder.serializers(new LocalDateSerializer(DateTimeFormatter.ofPattern(dateFormat)));
		};
	}
}
