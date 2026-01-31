package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class _4_2_javaNio_v_files_readString {

    public static void main(String[] args) throws IOException {
        Path myPath = Path.of("C:/Users/ZamparasVasileios/IdeaProjects/CodingFactory Testbed/src/gr/aueb/cf/cf9/ch9/vas_textwriter.txt");//this file MUST EXIST!!

        try{
            textReader(myPath);
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public static void textReader(Path path) throws IOException {
        String text = Files.readString(
                                        path,
                                        StandardCharsets.UTF_8
        );
        System.out.println("ok?? \n");
        System.out.println(text);
    }
}
