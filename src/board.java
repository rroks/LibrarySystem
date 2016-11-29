import operations.AddUser;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import systemoperator.FileExist;
import users.Librarian;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Rroks on 2016/11/28.
 */
public class board {
    public static void main(String[] args) throws IOException {
        color COLOR = null;
        for (color cl: color.values()){
            if ("rEd".equalsIgnoreCase(cl.toString())){
                COLOR = cl;
            }
        }
        System.out.print(COLOR.toString());
    }
    public enum color {
        Red("red"), Yellow("yellow"), Blue("blue");
        private String name;

        color(String cl) {
            this.name = cl;
        }
    }
}
