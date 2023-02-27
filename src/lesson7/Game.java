package lesson7;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Game {
    enum GameType {
        soccer,
        hockey,
        rugby

    }
    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
    public void writeToFile(String fileName, String text) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. cannot write... ");
            e.printStackTrace();
        }
    }

    public static void writeNumOfPlayersPerTeam(GameType game){
        try {

            switch (game) {
                case soccer:
                    String file = "Soccer.txt";
                    Game soccer = new Game();
                    soccer.createFile(file);
                    soccer.writeToFile(file, "11");
                    break;

                case hockey:
                    file = "Hockey.txt";
                    Game hockey = new Game();
                    hockey.createFile(file);
                    hockey.writeToFile(file, "6");
                    break;

                case rugby:
                    file = "Rugby.txt";
                    Game rugby = new Game();
                    rugby.createFile(file);
                    rugby.writeToFile(file, "15");;
                    break;

            }
        } catch (Exception err) {
            System.out.println("Invalid game type");;
        }
    }
}
