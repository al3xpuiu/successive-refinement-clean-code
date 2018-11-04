package com.company.argumentMarshalers;

import com.company.customExceptions.ArgsException;

import java.util.Iterator;

/**
 * Created by Loky on 03/11/2018.
 */
public interface ArgumentMarshaler {
    void set(Iterator<String> currentArgument) throws ArgsException;
}
