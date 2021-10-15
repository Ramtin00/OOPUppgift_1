package com.company;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);


        GymFile newFile = new GymFile();
        System.out.println("Skriv in ett namn");
        String a = scanner.nextLine();

        //Skriv namn eller personnummer och leta i registret
        newFile.checkCustomer(a);




        //Checka in aktiva kunder för dagen
        newFile.harTränat(a);





















        //System.out.println(kunder.size());
























        /*File folder = new File("C:\\Users\\Ramtin\\IdeaProjects\\OOP-Inlämmningsuppgift1_Gym\\src\\com\\company");

        File[] listOfFiles = folder.listFiles();
        System.out.println(listOfFiles.length);
        List<File> fileList = new ArrayList<>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].getName().contains(".txt")) {
                fileList.add(listOfFiles[i]);

            }
        }

        System.out.println(fileList.size());

        for (File a : fileList) {
            if (a.getName().equals("Customers.txt") || a.getName().equals("TränatIdag.txt")) {
                System.out.println(a.getName());
            }
        }*/

        /*LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(time.format(formatter));

         */









        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        //System.out.println(LocalTime.of(13, 57));
        //LocalTime time = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        //LocalTime time = LocalTime.parse(LocalTime.now().format(formatter));
        //System.out.println(time);










        /*File file = new File("src/com/company/Customers.txt");

        if (file.exists()) {
            System.out.println("Yes");
        } else {
            System.out.println("qa");
        }

        try {

            if (file.createNewFile()) {
                System.out.println("File created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


         */





        //Date date = new Date();
        /*LocalDate aDate = LocalDate.now();
        LocalDate aDate2 = LocalDate.parse("2020-09-01");
        //SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd");



        System.out.println(aDate);
        System.out.println(aDate2);

        if (aDate.minusYears(2).isAfter(aDate2)) {
            System.out.println("aDate is after aDate2");
        } else {
            System.out.println("aDate2 is after aDate");
        }
        */


    }
}
