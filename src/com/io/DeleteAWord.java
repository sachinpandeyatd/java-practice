package com.io;

import java.io.*;

public class DeleteAWord {
    public static void main(String[] args) throws IOException {
        String inputFile = "example-copy.txt"; // file to be edited
        File fileObject = new File(inputFile);
        System.out.println(fileObject.length());
        File inputFileObject = new File(inputFile); // To later, be able to delete
        BufferedReader fileTobeRead = new BufferedReader(new FileReader(inputFileObject));
        StringBuffer stringBuffer = new StringBuffer(); // To hold all the file data (thread-safe and mutable)

        String line; // to hold each line data
        while ((line = fileTobeRead.readLine()) != null){ // will iterate until readLine() return null, and assign each line to line ref var
            String[] lineInStringArray = line.split(" "); // to get array of each word, separated by " "
//            System.out.println(Arrays.toString(lineInStringArray));
            for(String word : lineInStringArray){ // iterating over all the words
                String wordTobeDeleted = "you"; // targeted word, this word will be deleted

                // if word is not the wordTobeDeleted, then it will be appended in stringBuffer,
                // otherwise will be ignored (in other words, that word will be deleted)
                if (!word.equals(wordTobeDeleted)){
                    stringBuffer.append(word).append(" ");
                }
            }

            // add new line character, (\r\n -> windows, \n -> Linux/mac)
            stringBuffer.append(System.getProperty("line.separator"));
        }

        fileTobeRead.close();;

        // A temp file is required, otherwise when creating a FileWriter object with same file, then only all
        // data will be deleted, and no data is written (I don't why, I just tried that, and it's not working).
        // So we have to create a new temp file and copy all new data into that, then delete the old file,
        // then need to rename the temp file as the original file, and then again need to delete
        // the temp file (finally done after 1.5 hours, taking some deep relaxing breaths)
        File tempFile = new File("temp-file.txt");
        BufferedWriter tempFileToBeWritten = new BufferedWriter((new FileWriter(tempFile)));
        tempFileToBeWritten.write(stringBuffer.toString());
        tempFileToBeWritten.close();

        inputFileObject.delete();
        tempFile.renameTo(inputFileObject);
        
        File file = new File(inputFile);
        System.out.println(file.length());
        tempFile.delete();
    }
}
