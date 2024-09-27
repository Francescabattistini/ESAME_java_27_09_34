package entities;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("Foto");
        Video video = new Video("The Lord of Rings");
        Audio audio = new Audio("Orchestra");

        video.alzaVolume();
        video.play();
        img.abbassaLuminosita();
        img.show();
        audio.abbassaVolume();
        audio.play();
    }
}
