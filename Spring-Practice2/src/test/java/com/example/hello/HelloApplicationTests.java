package com.example.hello;

import com.example.hello.dto.User2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-------------------------------");

		// Text JSON -> Object
		// Object -> Text JSON

		// controller req json(text) -> object
		// response object ->json(text)

		var objectMapper = new ObjectMapper();
		
		// object -> text
		// object mapper get method를 활용
		var user = new User2("codediary18",15,"010-1234-5889");
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		// text -> object
		// object mapper는 default 생성자를 필요로 함
		var objectUser = objectMapper.readValue(text,User2.class);
		System.out.println(objectUser);
	}

}
