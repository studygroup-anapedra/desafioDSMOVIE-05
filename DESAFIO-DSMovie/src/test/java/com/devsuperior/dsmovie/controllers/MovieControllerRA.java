package com.devsuperior.dsmovie.controllers;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
@AutoConfigureMockMvc
public class MovieControllerRA {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void findAllShouldReturnOkWhenMovieNoArgumentsGiven() throws Exception {
		mockMvc.perform(get("/movies"))
				.andExpect(status().isOk())
				.andDo(print());
	}

	@Test
	public void findAllShouldReturnPagedMoviesWhenMovieTitleParamIsNotEmpty() {
	}

	@Test
	public void findByIdShouldReturnMovieWhenIdExists() {
	}

	@Test
	public void findByIdShouldReturnNotFoundWhenIdDoesNotExist() {
	}

	@Test
	public void insertShouldReturnUnprocessableEntityWhenAdminLoggedAndBlankTitle() throws JSONException {
	}

	@Test
	public void insertShouldReturnForbiddenWhenClientLogged() throws Exception {
	}

	@Test
	public void insertShouldReturnUnauthorizedWhenInvalidToken() throws Exception {
	}

}
