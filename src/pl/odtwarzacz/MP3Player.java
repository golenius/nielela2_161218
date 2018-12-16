package pl.odtwarzacz;

public class MP3Player extends MusicPlayer implements Player{


    public MP3Player(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("MP3: Gra muzyka" + getCurrentSong());

    }

    @Override
    public void pause() {
        System.out.println("MP3: Pauza w odtwarzaniu muzyki" + getCurrentSong());

    }

    @Override
    public void stop() {
        System.out.println("MP3: Stop - muzyka nie gra");

    }

    /*@Override
    public void next() {
        System.out.println("MP3: Nastepny utwor");

    }

    @Override
    public void prev() {
        System.out.println("MP3: Poprzedni utwor");

    }*/
}
