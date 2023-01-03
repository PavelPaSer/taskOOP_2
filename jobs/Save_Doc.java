package jobs;

import java.util.Scanner;

public abstract class Save_Doc {
    Scanner scan = new Scanner(System.in);

     public Save_Doc() {
        this.scan = new Scanner(System.in);
    }

    abstract void LineSaveDoс(String puthDoc, String nameDoc, String line);
    abstract void EnterSaveDoс(String puthDoc, String nameDoc);
}