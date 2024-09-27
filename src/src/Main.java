import entities.*;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        ElementoMultimediale[] playlist = new ElementoMultimediale[5];

        for(int i = 0; i < 5; i++){ System.out.println(i + 1 + ". Cosa vuoi aggiungere alla playlist?");

            String mediaType = user.nextLine().toLowerCase();
            System.out.println("Titolo?");
            String title = user.nextLine();
            if (Objects.equals(title, "")) {
                System.out.println("Dovevi inserire un titolo, riprova.");
                i--;
            } else {
                switch (mediaType) {
                    case "video":
                        playlist[i] = new Video(title);
                        break;
                    case "audio":
                        playlist[i] = new Audio(title);
                        break;
                    case "immagine":
                        playlist[i] = new Immagine(title);
                        break;
                    default:
                        System.out.println("Tipo di media inesistente, riprova.");
                        i--;
                        break;
                }
            }
        }
        String input;

int opzione;

        do {

            System.out.print("Scegli quale elemento eseguire (1-5) o 0 per uscire: ");
            opzione = user.nextInt();


            switch (opzione) {
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                case 1:
                    if (playlist[0] instanceof Riproducibile) {
                        ((Riproducibile) playlist[0]).play();
                    } else {
                        ((Static) playlist[0]).show();
                    }
                    break;
                case 2:
                    if (playlist[1] instanceof Riproducibile) {
                        ((Riproducibile) playlist[1]).play();
                    } else {
                        ((Static) playlist[1]).show();
                    }
                    break;
                case 3:
                    if (playlist[2] instanceof Riproducibile) {
                        ((Riproducibile) playlist[2]).play();
                    } else {
                        ((Static) playlist[2]).show();
                    }
                    break;
                case 4:
                    if (playlist[3] instanceof Riproducibile) {
                        ((Riproducibile) playlist[3]).play();
                    } else {
                        ((Static) playlist[3]).show();
                    }
                    break;
                case 5:
                    if (playlist[4] instanceof Riproducibile) {
                        ((Riproducibile) playlist[4]).play();
                    } else {
                        ((Static) playlist[4]).show();
                    }
                    break;
                default:
                    System.out.println("Devi premere un numero da 1 a 5 per riprodurre o 0 per uscire!");
            }
        } while (opzione !=0);
  user.close();
    }
}