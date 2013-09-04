package com.dashboard;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: bibassitoula
 * Date: 9/4/13
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class dataAnalysis {
    private static String path = null;
    private static String inpFile="/Users/bibassitoula/Desktop/personal/15days/dataDashboard/testRead";
    private static String opFile = "/Users/bibassitoula/Desktop/personal/15days/dataDashboard/script";
    private static String Database;




    public static void main(String args[]) throws IOException {




        /* connecting to the file */
        //fileLoader application = new fileLoader();
        //application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the path for file containing the data : ");
        path = scan.next();

        BufferedReader reader = new BufferedReader(new FileReader(inpFile));
        try {
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();

            while (line != null) {
                sb.append(line);
                sb.append('\n');
                line = reader.readLine();
            }
            String everything = sb.toString();
        } finally {
            reader.close();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(opFile));


        writer.write("hello world");

        }

    }


