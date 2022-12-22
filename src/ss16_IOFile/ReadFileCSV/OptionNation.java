package ss16_IOFile.ReadFileCSV;

import ss16_IOFile.ReadFileCSV.Nation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OptionNation {
    public static List<Nation> readNation() throws IOException {
        List<Nation> nationList = new ArrayList<>();
        FileReader fileReader = new FileReader("D:\\Codegyme\\module2\\untitled\\src\\ss16_IOFile\\ReadFileCSV\\OptionNation.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line ;
        String[] temp ;
        Nation nation;
        while ((line=bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String systempName = temp[1];
            String name = temp[2];
            nation = new Nation(id, systempName, name);
            nationList.add(nation);
        }
        return nationList;
    }

    public static void main(String[] args) throws IOException {
       List<Nation> nations =readNation();
       for(Nation nation:readNation()){
           System.out.println(nation);
       }
    }
}
