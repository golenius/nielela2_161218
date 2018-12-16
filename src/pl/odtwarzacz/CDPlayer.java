package pl.odtwarzacz;

public class CDPlayer extends MusicPlayer implements Player{

    public CDPlayer(Song[] library) {
        super(library);
    }

    @Override
    public void play() {

        System.out.print("CD: Gra muzyka..." + getCurrentSong());
        setStatus(1);
         }

    @Override
    public void pause() {
        System.out.println("CD: Pauza w odtwarzaniu muzyki" + getCurrentSong());
        setStatus(2);
    }

    @Override
    public void stop() {
        System.out.println("CD: Stop - muzyka nie gra");
        setStatus(0);
    }


}
