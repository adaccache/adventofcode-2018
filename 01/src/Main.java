import data.FileReader;

import java.util.List;
import java.util.Optional;

class Main
{
    public static void main(String args[])
    {
        FileReader fileReader = new FileReader();
        List<Integer> data =  fileReader.getData();

        Optional<Integer> total = data.stream().reduce((a, b) -> a + b);

        System.out.println(total);

    }
} 