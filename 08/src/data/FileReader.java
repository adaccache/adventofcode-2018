package data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileReader {

    public List<Integer> getData(){
        String fileName = "/Users/adaccache/Projects/personal/adventofcode-2018/08/src/data/input.txt";
        List<Integer> respList = new ArrayList<>();
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(a ->respList.add(Integer.parseInt(a)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return respList;
    }

}
