package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class _4_1_javaNio_v_files_writeString {

        public static void main(String[] args) {

            Path myPath = Path.of("C:/Users/ZamparasVasileios/IdeaProjects/CodingFactory Testbed/src/gr/aueb/cf/cf9/ch9/vas_textwriter.txt");

            try {
                textWriter(myPath);
            } catch (IOException e) {
                System.out.println("a mistake happened.");
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
}
