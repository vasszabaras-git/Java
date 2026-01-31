package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//files=class to work with files and directories
//Files.readString(path) → read a text file as a string
//Files.writeString(path, text) → write a string to a file
//Files.createDirectories(path) → create folders
//Files.newInputStream(path) → open a file to read bytes
//Files.newOutputStream(path) → open a file to write bytes

public class _4_3_javaNio_v_transferTo_binary {
    public static void main(String[] args) {

        Path fromPath = Path.of("C:/Users/ZamparasVasileios/IdeaProjects/CodingFactory Testbed/src/gr/aueb/cf/cf9/ch9/imagetest.jpg");
        Path toPath = Path.of("C:/Users/ZamparasVasileios/IdeaProjects/CodingFactory Testbed/src/gr/aueb/cf/cf9/ch9/imagetest-copy.jpg");

        try {
            binaryReadWrite(fromPath, toPath);
        } catch (IOException e) {
            System.out.println("Κάποιο a mistake happened.");
        }

    }

    public static void binaryReadWrite(Path fromPath, Path toPath) throws IOException {  //try with reasources, automatically calls close() on sourceStream and targetStream when the block ends.
        try (var sourceStream = Files.newInputStream(fromPath);     //var:let compiler determine the type of sourceStream. this is an inputStream. "pipe" from source file into the program.
             var targetStream = Files.newOutputStream(toPath);) {   //newOutputStream(target) opens or create the file at toPath. if the file exists it overwrites
            sourceStream.transferTo(targetStream);      // efficient, streaming σε chunks. It reads all bytes from the InputStream and writes them to the given OutputStream
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
