package java_bank;
class Song{
	String title,artist,country;
	int year;
	
	Song(int year,String country, String artist, String title ){
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	Song(){}
	
	public void show() {
		System.out.println(year +"�� " + country+"������ "+artist+"�� �θ� "+title);
	}
	
}

public class SongTest {

	public static void main(String[] args) {
		
		Song mySong = new Song(1978,"������","ABBA","Dancing Queen");
		mySong.show();
	}

}
