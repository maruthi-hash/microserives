/**
 * 
 */
package com.maruthi.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maruthi.model.MovieDetails;

/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@RequestMapping("/{userId}")
	public List<MovieDetails> getCatalogDetails(@PathVariable("userId") String userId){
		
		return Collections.singletonList(
				new MovieDetails("Money Heist", "Crime", 5));
	}
}
