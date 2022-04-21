package com.javaex.ex04;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public void setTitle(String tt) {
		title = tt;
	}
	public void setArtist(String art) {
		artist = art;
	}
	public void setAlbum(String ab) {
		album = ab;
	}
	public void setComposer(String cp) {
		composer = cp;
	}
	public void setYear(int ya) {
		year = ya;
	}
	public void setTrack(int tr) {
		track = tr;
	}
	
	public void draw() {
		System.out.printf("%s, %s (%s, %d ,%d번 track, %s 작곡)\n",artist, title, album, year, track, composer);
	}
}	
	
