package com.dashboard;
import javax.swing.*;
import java.awt.*;
import java.io.File;


/**
 * Created with IntelliJ IDEA.
 * User: bibassitoula
 * Date: 9/4/13
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class fileLoader extends JFrame {
    private JTextArea outputArea;
    private JScrollPane scrollPane;


    public fileLoader(){

        super("Loading the input File");
        outputArea = new JTextArea();
        scrollPane = new JScrollPane();
        add(scrollPane, BorderLayout.CENTER);
        setSize(400,400);
        setVisible(true);
        analyzePath();
    }

    private File getFile(){
       JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int result = fileChooser.showOpenDialog(this);

        if(result == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        File filename = fileChooser.getSelectedFile();

        if((filename == null)||(filename.getName().equals("")))
        {
            JOptionPane.showMessageDialog(this,"Invalid File Name","Invaid File Name",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
          return filename;
    }

    private void analyzePath() {
        //To change body of created methods use File | Settings | File Templates.
        File name = getFile();

        if (name.exists())
        {
            String path = name.getAbsolutePath();
            System.out.print(path);
           if (name.isDirectory())
           {
               System.out.print("Please provide the path for file this is folder");
               analyzePath();
           }
        }
        else
        {
            JOptionPane.showMessageDialog(this,name + "does not exist.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
