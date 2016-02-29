import java.util.Scanner;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
/**
 * This will automatically move the app to someone's calculator when run
 * 
 * @author Kevin Sikes
 * @version 2/18/16
 */
public class Move
{
    String usernm = "";
    /**
     * receives input from user to find the location of the documents folder
     */
    public void Move(){
        String input = "";
        System.out.println("Make sure that the Physics program file is in your documents folder. Then please input your username so it can find the folder. Just type it below and then hit enter.");
        Scanner inp = new Scanner(System.in);
        usernm = inp.nextLine();
        move();
    }
    
    /**
     * physics file MUST be in Documents folder to work
     * moves the file to the calculator
     * currently: copies the file from documents to desctop
     * TODO: have it copy the file to the calculator, need to find out how to acess calculator and where to put file
     */
    private void move(){
        try{
            Path start = Paths.get("C:/Users/" + usernm +"/Documents/PhysicsCOPYtest.txt");
            Path newdir = Paths.get("C:/Users/"+ usernm +"/Desktop/PhysicsCOPYtest.txt");//TODO need to find where the calculator is
            Files.move(start, newdir, StandardCopyOption.ATOMIC_MOVE);
            System.out.println("The file has been sucsessfully moved to your calculator!");
        }
        catch(IOException e){
            System.out.println("IOException");
            e.printStackTrace();
            System.exit(1);
        }
        catch(FileSystemNotFoundException e){
           System.out.println("File system not found");
            e.printStackTrace();
            System.exit(1);
        }
        catch(InvalidPathException e){
            System.out.println("Invalid path");
            e.printStackTrace();
            System.exit(1);
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
