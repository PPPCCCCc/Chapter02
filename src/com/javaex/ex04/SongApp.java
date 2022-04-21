package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		Song iu = new Song();
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("Real");
		iu.setComposer("이민수");
		iu.setYear(2010);
		iu.setTrack(3);
		
		Song bing = new Song();
		bing.setTitle("거짓말");
		bing.setArtist("BIGBANG");
		bing.setAlbum("Always");
		bing.setComposer("G-DRAGON");
		bing.setYear(2007);
		bing.setTrack(2);
		
		Song bb = new Song();
		bb.setTitle("벚꽃엔딩");
		bb.setArtist("버스커버스커");
		bb.setAlbum("버스커버스커1집");
		bb.setComposer("장범준");
		bb.setYear(2012);
		bb.setTrack(4);
		
		iu.draw();
		bing.draw();
		bb.draw();
		
	}

}
