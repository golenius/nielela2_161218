package pl.odtwarzacz;

public class Song {
    private String artist;
    private String title;
    private String album;
    //private int year;

    public Song(String artist, String title, String album) {
        this.artist = artist;
        this.title = title;
        this.album = album;
       // this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
