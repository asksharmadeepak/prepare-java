package com.prepare.java8.streams.exception_handling;

@FunctionalInterface
public interface CheckedExceptionHandlerConsumer<Target, ExceptionObject extends Exception> {
    public void accept(Target target) throws ExceptionObject;

}
