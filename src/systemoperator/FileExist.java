package systemoperator;

import java.io.File;
import java.io.IOException;

/**
 * Created by Rroks on 2016/11/27.
 */
public class FileExist {
    public static void fileExist() throws IOException {
        String[] files = {"librarian", "commonuser", "book", "cd", "dvd", "blueray"};
        for (int i = 0; i < files.length; i++){
            File file = new File(files[i]);
            if (!file.exists()){
                file.createNewFile();
            }
        }
    }
}
