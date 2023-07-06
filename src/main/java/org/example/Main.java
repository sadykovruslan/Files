package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
  FileInputStream readFile = new FileInputStream("D:\\Java\\Files\\data.txt");
  FileOutputStream writeFile = new FileOutputStream("D:\\Java\\Files\\result.txt");
  byte bufer[] = new byte[1000];
  while (readFile.available()>0){
      int count = readFile.read(bufer);
      writeFile.write(bufer,0, count);
  }
readFile.close();
  writeFile.close();
//открываем файл
        List<String> list = new ArrayList<~>(); //создам список для хранения строк
        File file = new File("D:\\Java\\Files\\documents.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        while (reader.ready()){
            list.add(reader.readLine());
        }
        reader.close();
    }
}