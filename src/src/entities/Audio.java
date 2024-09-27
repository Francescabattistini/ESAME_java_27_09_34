package entities;

import java.util.Random;

public class Audio extends ElementoMultimediale implements Riproducibile {
 Random random = new Random()
         private byte volume;
 private int durata;
  public  Audio (String titolo){
      super(titolo);
      this.durata =random.nextInt(2,13);
      this.volume =5;
  }




    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.titolo + " " + "!".repeat(this.volume));
        }
    }

    @Override
    public void alzaVolume() {
        if (this.volume < 10) {
            this.volume++;
            System.out.println("Volume di " + this.titolo + " alzato, il volume ora è " + this.volume);
        } else {
            System.out.println("Volume di " + this.titolo + " già al massimo!!");
        }
    }

    @Override
    public Void abbassaVolume() {
        if (this.volume > 1) {
            this.volume--;
            System.out.println("Volume di " + this.titolo + " abbassato, il volume ora è " + this.volume);
        } else {
            System.out.println("Volume di " + this.titolo + " già al minimo!!");
        }
    }
}
