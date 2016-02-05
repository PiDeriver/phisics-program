//https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#move-java.nio.file.Path-java.nio.file.Path-java.nio.file.CopyOption...-
/**
 * Write a description of class Move here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Move
{
    
    /**
     * Constructor for objects of class Move
     */
    public Move()
    {
        move();
    }

    public static Path move(Path source, Path target, CopyOption... options){
        Path source = ;
        Path newdir = ;
        Files.move(source, newdir.resolve(source.getFileName()), ATOMIC_MOVE);
    }
}
