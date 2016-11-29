import entry.LogIn;
import systemoperator.FileExist;

import java.io.IOException;

/**
 * Created by Rroks on 2016/11/27.
 */
public class main {
    public static void main(String[] args) throws IOException {
        FileExist.fileExist();
        LogIn.Logger();
    }
}
