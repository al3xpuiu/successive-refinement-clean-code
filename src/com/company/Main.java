package com.company;

import com.company.customExceptions.ArgsException;

public class Main {

    public static void main(String[] args) {
        try {
            Args arg = new Args("1, p#, d*", args);
            boolean logging = arg.getBoolean('1');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            System.out.println(logging);
            System.out.println(port);
            System.out.println(directory);
        } catch (ArgsException e) {
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }


}
