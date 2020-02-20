package HC2020;

import IO.FileIO;
import IO.Inparser;

import java.io.File;

public class ScoreTest {

    public static void main(String[] args){
        File testFile = FileIO.getFile("in/e_so_many_books.txt");
        Inparser ip = new Inparser(testFile);

        Score score = new Score();
        System.out.println(score.getScore(FileIO.getFile("out/output.txt"), ip));
    }

}
