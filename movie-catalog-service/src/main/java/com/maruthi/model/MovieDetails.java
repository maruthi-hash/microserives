/**
 * 
 */
package com.maruthi.model;

/**
 * @author Admin
 *
 */
public class MovieDetails {

	public String name;
	public String desc;
	public int rating;
	
	
	/**
	 * @param name
	 * @param desc
	 * @param rating
	 */
	public MovieDetails(String name, String desc, int rating) {
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
