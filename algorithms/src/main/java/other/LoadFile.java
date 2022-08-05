package other;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class LoadFile {

    public void firstWay() throws IOException {
        // https://www.industrialempathy.com/img/remote/ZiClJf-640w.avif
        URL url = new URL("https://www.google.com/");
        byte[] bytes = url.openStream().readAllBytes();
        for (byte b : bytes) {
            System.out.print(b);
        }
        System.out.println();
        System.out.println("Length: " + bytes.length);

        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println();
        System.out.println(s);
    }

    public void secondWay() throws IOException {
        File file = new File("C:\\Users\\Admin\\OneDrive\\Documents\\json.txt");
        byte[] bytes = Files.newInputStream(file.toPath()).readAllBytes();
        for (byte b : bytes) {
            System.out.print(b);
        }
        System.out.println();
        System.out.println("Length: " + bytes.length);

        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println();
        System.out.println(s);
    }

}
