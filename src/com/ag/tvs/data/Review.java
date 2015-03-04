package com.ag.tvs.data;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@XmlRootElement(name = "product")
public class Review implements Serializable {

	
	private String name = null;
	private String description = null;
	private double rating = 0.0D;
	private String date = null;
	private String prettyDate = null;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getPrettyDate() {
		Date date = new Date();
		date.setTime(new Long(this.date));
		SimpleDateFormat format = new SimpleDateFormat("M/dd/yyyy hh:mm a");
		return format.format(date);
	}

}