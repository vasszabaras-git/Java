//edw h vasikh domh einai to Path. create the parent directory (till nio.txt) and den uparxei

package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Demo of java.nio.file package. //C:\Users\ZamparasVasileios\IdeaProjects\CodingFactory Testbed\src\gr\aueb\cf\cf9\ch9
 */
public class _4_0_javaNio_read_write {

    public static void main(String[] args) {

        Path textTarget = Path.of("C:/Users/ZamparasVasileios/IdeaProjects/CodingFactory Testbed/src/gr/aueb/cf/cf9/ch9/vas_textwriter.txt");

        Path source = Path.of("C:/Users/a8ana/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/aueb.jpg");
        Path target = Path.of("C:/Users/a8ana/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/aueb-copy.jpg");

        try {
            textWriter(textTarget);
            textReader(textTarget);
            binaryReadWrite(source, target);
        } catch (IOException e) {
            System.out.println("Κάποιο a mistake happened.");
        }
    }

    public static void textWriter(Path path) throws IOException {    //it gets the path, this path has also the "/file.txt"
        Files.createDirectories(path.getParent());                   // we need to make sure the parent exists, if not it creates it
        Files.writeString(
                path,                                                //this is the path
                "Hello Coding",                                      //this will be written inside the file
                StandardCharsets.UTF_8,                              //text encoding
                StandardOpenOption.CREATE,                           //create if the file doesnt exist
                StandardOpenOption.APPEND                            //append, if this is missing java will overwrite what exists there
        );
    }

    public static void textReader(Path path) throws IOException {
        String text = Files.readString(                             // Functional Programming
                path,
                StandardCharsets.UTF_8
        );
        System.out.println(text);
    }

    public static void binaryReadWrite(Path source, Path target) throws IOException {
        try (var sourceStream = Files.newInputStream(source);
             var targetStream = Files.newOutputStream(target);) {
            sourceStream.transferTo(targetStream);      // efficient, streaming σε chunks
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}