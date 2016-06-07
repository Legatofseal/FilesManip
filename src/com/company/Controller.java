package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Legat on 6/5/2016.
 */
public class Controller {
    private StringCollection stringCollection;
    private ArrayList<String> stringArrayList=new ArrayList<String>();
    private File inputFile;
    private File outputFile;

    public Controller(StringCollection stringCollection, File inputFile, File outputFile) throws IOException {
        this.stringCollection = stringCollection;
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        readFromFile();

    }

    public void readFromFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                stringArrayList.add(line);

            }

        } finally {
            bufferedReader.close();
        }
    }

    public void writeToFile() throws FileNotFoundException {
        PrintWriter out = new PrintWriter(outputFile);
        for (int i=0; i<stringArrayList.size(); i++){
            out.println(stringArrayList.get(i));
        }
        out.close();
    }
    public void processCommands () throws IOException {
        System.out.println("Please, command me!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string;
        boolean check=false;
        while (!check) {
            string=br.readLine();
            switch (string) {
                case "reverse":
                    stringCollection.reverseString(stringArrayList);
                    check = true;
                    break;
                case "shuffle":
                    stringCollection.shuffleString(stringArrayList);
                    check = true;
                    break;
                case "sort":
                    stringCollection.sortString(stringArrayList);
                    check = true;
                    break;
                default: System.out.println("Please enter command again");

            }
        }

    }

}
