package ss16_IOFile.CopyFileText;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RunObjectStudent {
    public static void readList() {

        try {
            FileReader fileReader = new FileReader("D:\\Codegyme\\module2\\untitled\\src\\ss16_IOFile\\CopyFileText\\Number.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int count = 0;
            int readChar;
            FileWriter fileWriter =new FileWriter("D:\\Codegyme\\module2\\untitled\\src\\ss16_IOFile\\CopyFileText\\NewFile.csv");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            while ((readChar = bufferedReader.read()) != -1) {
                count++;
                bufferedWriter.write(readChar);
            }
            System.out.println("số kí tự bị sao chép"+count);
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        readList();
    }
}
