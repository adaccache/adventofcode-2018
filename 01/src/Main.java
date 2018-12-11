import data.FileReader;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

class Main
{
    public static void main(String args[])
    {

        //part 1
        FileReader fileReader = new FileReader();
        List<Integer> data =  fileReader.getData();

        Optional<Integer> total = data.stream().reduce((a, b) -> a + b);

        System.out.println(total);

        //part 2
        Set<Integer> matchedFrequencies = new HashSet<>();
        Integer currentValue = 0;
        int i = 0;

        while(true){
            if(data.size() == i){
                i = 0;
            }

            currentValue += data.get(i);
            if(matchedFrequencies.contains(currentValue)){
                System.out.println("found duplicate: " + currentValue);
                break;
            }else {
                matchedFrequencies.add(currentValue);
            }
            i++;
        }



    }
} 