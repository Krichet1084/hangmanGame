/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import my.homeScreen.*;
import my.howTo.*;
/**
 *
 * @author kshar1
 */
public class main {
    
    private static String isFirstLaunch=null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        homeScreen home = new homeScreen();
        home.setVisible(true);
        firstLaunch();
    }
    
    private static void firstLaunch(){
        try{
            Stream<String> lines = Files.lines(Paths.get("files/info.txt"));
            isFirstLaunch = (lines.skip(0).findFirst().get()).toLowerCase();
        }
        catch(IOException e){
            System.out.println(e);
        }
            if(isFirstLaunch.split(" ")[2].equals("true")){
                String newLine= "First Launch: false";
                try{
                    FileWriter myWriter = new FileWriter("files/info.txt", true);
                    myWriter.write(newLine);
                    myWriter.close();
                    howTo guide = new howTo();
                    guide.setVisible(true);
                }
                catch(IOException e){
                    System.out.println(e);
                }
            }
    }
}
