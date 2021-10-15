package com.company;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GymFileTest {

    GymFile file = new GymFile();


    @Test
    void kollaOmKundÄrAktiv() {

        assertTrue(file.checkCustomer("Diamanda Djedi") == true);




        assertFalse(file.checkCustomer("Diamanda Djedi") == false);

    }

    @Test
    void kollaAntalAktivaKunder() {


        file.checkCustomer("");
        List<String> kunder = file.getBetalandeKunder();
        assertTrue(kunder.size() == 4);
    }

    @Test
    void harTränat() {
        file.checkCustomer("");
        file.harTränat("Diamanda Djedi");
        for (String a : file.getBetalandeKunder()) {

            assertTrue(a.equals("7608021234,Diamanda Djedi"));
            break;
        }
    }



    @Test
    void KollaOmFilFinns() {

        File folder = new File("src/com/company");

        File[] listOfFiles = folder.listFiles();

        List<File> fileList = new ArrayList<>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].getName().contains(".txt")) {
                fileList.add(listOfFiles[i]);

            }
        }

        assertTrue(fileList.size() == 2);
        assertFalse(fileList.size() < 2);


        for (File a : fileList) {
            assertTrue (a.getName().equals("Customers.txt") || a.getName().equals("TränatIdag.txt"));
        }
    }


    @Test
    void KollaOmCustomersFinns() {


        assertTrue(Files.exists(Path.of("src/com/company/Customers.txt")));

        assertFalse(!Files.exists(Path.of("src/com/company/Customers.txt")));
    }
}