package com.example.JWT_RestAPI;

import com.example.JWT_RestAPI.controller.AuthController;
import com.example.JWT_RestAPI.model.LoginRequest;
import com.example.JWT_RestAPI.service.AuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.Authentication;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@SpringBootTest(classes={com.example.JWT_RestAPI.application.JwtRestApiApplication.class})
class UserTest {

	@Mock
	private AuthService authService;

	@InjectMocks
	private AuthController authController;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testLogin() {
		String username = "joao";
		String expectedToken = "mockedToken";

		LoginRequest loginRequest = new LoginRequest(username, "4321");
		when(authService.generateToken(anyString())).thenReturn(expectedToken);

		String token = authController.login(loginRequest);
		assertEquals(expectedToken, token);
	}

	@Test
	void testExtractUsername() {
		String token = "mockedToken";
		String expectedUsername = "joao";

		when(authService.extractUsername(anyString())).thenReturn(expectedUsername);

		String username = authController.extractUsername(token);
		assertEquals(expectedUsername, username);
	}

	@Test
	void testGetUser() {
		Authentication authentication = new MockAuthentication("joao");
		String expectedResponse = "User: joao";

		String response = authController.getUser(authentication);
		assertEquals(expectedResponse, response);
	}

	@Test
	void testOnlyAdmin() {
		Authentication authentication = new MockAuthentication("joao");
		String expectedResponse = "Admin: joao";

		String response = authController.onlyAdmin(authentication);
		assertEquals(expectedResponse, response);
	}

	@Test
	void testOnlyModerado() {
		Authentication authentication = new MockAuthentication("jade");
		String expectedResponse = "Moderado: jade";

		String response = authController.onlyModerado(authentication);
		assertEquals(expectedResponse, response);
	}

	@Test
	void testOnlyComum() {
		Authentication authentication = new MockAuthentication("jonathan");
		String expectedResponse = "Comum: jonathan";

		String response = authController.onlyComum(authentication);
		assertEquals(expectedResponse, response);
	}
}
