package installation;

import java.io.*;

public class Main {
  private static StringBuilder log = new StringBuilder();

  static void makeDir(String path){
    if (new File(path).mkdir()) {
      log.append("Каталог " + path + " создан\n");
    } else{
      log.append("Ошибка создания " + path + "\n");
    }
  }

  static void makeFile(String path){
    try {
      if (new File(path).createNewFile()) {
        log.append("Файл " + path + " создан\n");
      }
    } catch (IOException ex) {
      log.append(ex.getMessage() + "\n");
    }
  }

  static void fileWriter(String path){
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
      writer.append(log);
    } catch (IOException ex) {
      log.append(ex.getMessage() + "\n");
    }
  }

  public static void main(String[] args) {
    makeDir("D://Games");
    makeDir("D://Games/src");
    makeDir("D://Games/res");
    makeDir("D://Games/savegames");
    makeDir("D://Games/temp");
    makeDir("D://Games/src/main");
    makeDir("D://Games/src/test");
    makeFile("D://Games/src/main/Main.java");
    makeFile("D://Games/src/main/Utils.java");
    makeDir("D://Games/res/drawables");
    makeDir("D://Games/res/vectors");
    makeDir("D://Games/res/icons");
    makeFile("D://Games/temp/temp.txt");
    fileWriter("D://Games/temp/temp.txt");
  }
}
