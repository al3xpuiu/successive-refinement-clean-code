package com.company.argumentMarshalers;

import com.company.customExceptions.ArgsException;
import com.company.customExceptions.ErrorCode;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Loky on 03/11/2018.
 */
public class DoubleArgumentMarshaler implements ArgumentMarshaler {
    private double doubleValue = 0.0;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            doubleValue = Double.valueOf( parameter );
        } catch (NoSuchElementException e) {
            throw new ArgsException( ErrorCode.MISSING_DOUBLE );
        } catch (NumberFormatException e) {
            throw new ArgsException( ErrorCode.INVALID_DOUBLE, parameter );
        }
    }

    public static double getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof DoubleArgumentMarshaler)
            return ((DoubleArgumentMarshaler) am).doubleValue;
        else
            return 0.0;
    }
}
