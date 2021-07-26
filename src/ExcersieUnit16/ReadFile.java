package ExcersieUnit16;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String> readFile(String path){
        List<String> newList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                newList.add(line);
            }
        } catch (Exception e) {
            System.out.println("Not Found");
        }
        return newList;
    }
    public void writeFile(List<String> list, String path){
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(String string: list){
                bufferedWriter.write(string);
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
        }catch (Exception e){
            System.out.println("Find not found");
        }
    }
    public static void main(String[] args) {
        ReadFile demo = new ReadFile();
        List<String> listDemo = demo.readFile("src/ExcersieUnit16/BucThuTinhThu2");
        demo.writeFile(listDemo,"src/LyricNews.txt");
    }
}