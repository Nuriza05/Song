import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Song song = new Song("Title: Ay yuzlum","\nAuthor: Murat Gogebakan","\nText: \nZaman hanci bulut yolcu\nSimdi gitti en son yolcu\nBitmedi mi hasretin borcu\nNeredesin ay yuzlum!");
fileReader();

        try(FileWriter fileWriter = new FileWriter("myText.txt")){
            fileWriter.write(song.getTitle());
            fileWriter.write(song.getAuthor());
            fileWriter.write(song.getText());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileReader() {
        try (FileReader fileReader = new FileReader("myText.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}