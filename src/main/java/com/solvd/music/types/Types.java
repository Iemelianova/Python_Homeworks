package com.solvd.music.types;

import org.apache.log4j.Logger;

import com.solvd.music.MusicEras;
import com.solvd.music.rhythm.Rhythm;

public class Types extends MusicEras {

	private String genre;
	
	private final static Logger LOGGER = Logger.getLogger(Types.class);


	public Types() {
	}

	public Types(int century, String era, String genre) {
		super(century, era);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;

	}
	
	@Override
	public void printInfo() {
		Types t = new Types();
		LOGGER.info("Century: " + getCentury());
		LOGGER.info("Music era: " + getEra());
		LOGGER.info("Genre of music: " + getGenre());
	}

	
}