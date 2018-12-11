import data.FileReader;

import java.util.List;

class Main
{
    public static void main(String args[])
    {
        FileReader fileReader = new FileReader();
        List<String> data =  fileReader.getData();


        System.out.println(data);

    }
} 