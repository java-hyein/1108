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
		System.out.println(year +"년 " + country+"국적의 "+artist+"가 부른 "+title);
	}
	
}

public class SongTest {

	public static void main(String[] args) {
		
		Song mySong = new Song(1978,"스웨덴","ABBA","Dancing Queen");
		mySong.show();
	}

}
