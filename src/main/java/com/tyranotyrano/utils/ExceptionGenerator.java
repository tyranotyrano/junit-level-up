package com.tyranotyrano.utils;

public class ExceptionGenerator {

    private ExceptionGenerator() {}

    public static void throwIllegalStateException() {
        throw new IllegalStateException();
    }

    public static void throwIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    public static void throwIllegalStateExceptionWithMessage() {
        throw new IllegalStateException("throw IllegalStateException");
    }
}
