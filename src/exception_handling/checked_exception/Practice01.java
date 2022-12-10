package exception_handling.checked_exception;

import java.io.File;
import java.io.IOException;

public class Practice01 {
    public static void main(String[] args) throws InterruptedException, IOException {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            Thread.sleep(250); // recommended to be handled with try-catch
        }

        File file = new File("Hello.xls");

        file.createNewFile();
        Thread.sleep(5000);
        file.delete();


    }
}
