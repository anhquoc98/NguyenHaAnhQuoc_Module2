package ss16_IOFile.CopyFileText;

import java.io.*;

public class CopyList {

    public static final String FILE_PATH = "D:\\Codegyme\\module2\\untitled\\src\\ss16_IOFile\\CopyFileText\\Number.csv";
    public static final String FILE_PATH1 = "D:\\Codegyme\\module2\\untitled\\src\\ss16_IOFile\\CopyFileText\\NewFile.csv";

    public static void readList() {

        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int count = 0;
            int readChar;
            FileWriter fileWriter =new FileWriter(FILE_PATH1);
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
