package installation;

import java.io.*;

public class Main {

  public static void main(String[] args) {
    StringBuilder log = new StringBuilder();

    if (new File("D://Games").mkdir()) {
      log.append("Каталог Games создан\n");
    }

    if (new File("D://Games/src").mkdir()) {
      log.append("Каталог src создан\n");
    }

    if (new File("D://Games/res").mkdir()) {
      log.append("Каталог res создан\n");
    }

    if (new File("D://Games/savegames").mkdir()) {
      log.append("Каталог savegames создан\n");
    }

    if (new File("D://Games/temp").mkdir()) {
      log.append("Каталог temp создан\n");
    }

    if (new File("D://Games/src/main").mkdir()) {
      log.append("Каталог main создан\n");
    }

    if (new File("D://Games/src/test").mkdir()) {
      log.append("Каталог test создан\n");
    }

    try {
      if (new File("D://Games/src/main/Main.java").createNewFile()) {
        log.append("Файл Main.java создан\n");
      }
    } catch (IOException ex) {
      log.append(ex.getMessage() + "\n");
    }

    try {
      if (new File("D://Games/src/main/Utils.java").createNewFile()) {
        log.append("Файл Utils.java создан\n");
      }
    } catch (IOException ex) {
      log.append(ex.getMessage() + "\n");
    }

    if (new File("D://Games/res/drawables").mkdir()) {
      log.append("Каталог drawables создан\n");
    }

    if (new File("D://Games/res/vectors").mkdir()) {
      log.append("Каталог vectors создан\n");
    }

    if (new File("D://Games/res/icons").mkdir()) {
      log.append("Каталог icons создан\n");
    }

    try {
      if (new File("D://Games/temp/temp.txt").createNewFile()) {
        log.append("Файл temp.txt создан\n");
      }
    } catch (IOException ex) {
      log.append(ex.getMessage() + "\n");
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("D://Games/temp/temp.txt"))) {
      writer.append(log);
    } catch (IOException ex) {
      log.append(ex.getMessage() + "\n");
    }
  }
}
