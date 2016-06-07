package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length>1) {
            try {
                Controller controller = new Controller(new StringCollection(), new File(args[0]), new File(args[1]));
                controller.processCommands();
                controller.writeToFile();
            }
            catch (FileNotFoundException fEx){
                System.out.println("Some of files not found");
            }

        }
        else{
            System.out.print("Incorrect arguments");
        }

    }
}
