package pl.odtwarzacz;

public class Test {
    public static void main(String[] args) {

        Song[] library = new Song[3];
        library[0] = new Song("Michael Jackson", "beat it", "Thriller");
        library[1] = new Song("Pearl Jam", "Even flow", "Ten");
        library[0] = new Song("Portishead", "Oven", "NYC Live");

        Player[] players = {new CDPlayer(library), new MP3Player(library)};

        players[0].play();
        players[0].stop();
        players[0].next();

        System.out.println();

        players[1].play();
        players[1].stop();
        players[1].next();
        players[1].prev();
        players[1].play();





    }
}
