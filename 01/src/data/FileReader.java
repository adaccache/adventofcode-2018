package data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FileReader {

    public List<String> getData(){
        String fileName = "/home/tony/Projects/adventofcode-2018/01/src/data/input.txt";
        List<String> respList = new ArrayList<>();
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(respList::add);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return respList;
    }

}
