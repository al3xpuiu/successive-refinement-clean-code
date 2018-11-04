package com.company.argumentMarshalers;

import com.company.customExceptions.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Loky on 03/11/2018.
 */
public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    private String[] stringArray = new String[0];

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            stringArray = parameter.split( " " );
        } catch (NoSuchElementException e) {

        }
    }
}
