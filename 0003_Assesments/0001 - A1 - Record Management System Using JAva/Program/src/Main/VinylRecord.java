package Main;

public class VinylRecord {

	// private variables to this method
	private int id;
	private String title;
	private String artist;
	private int year;
	private String genre;

	// constructor method
	public VinylRecord(int id, String title, String artist, int year, String genre) {
		super();
		this.id = id;
		this.title = title.toLowerCase(); // formats data to be lower case to ease other functions
		this.artist = artist.toLowerCase();// formats data to be lower case to ease other functions
		this.year = year;
		this.genre = genre.toLowerCase();// formats data to be lower case to ease other functions

	}// constructor

	// getter and setter methods used to change the values of the object.
	public int getID() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// ToString method that returns the instance in a CSV ready format
	@Override
	public String toString() {
		return id + "," + title + "," + artist + "," + year + "," + genre;
	}// ToSting

}
