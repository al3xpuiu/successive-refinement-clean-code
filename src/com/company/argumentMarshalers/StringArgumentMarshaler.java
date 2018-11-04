package com.company.argumentMarshalers;

import com.company.customExceptions.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static com.company.customExceptions.ErrorCode.*;

/**
 * Created by Loky on 03/11/2018.
 */
public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringValue = "";

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            stringValue = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }

    public static String getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArgumentMarshaler)
            return ((StringArgumentMarshaler) am).stringValue;
        else
            return "";
    }
}
