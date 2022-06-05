package com.sofka.software._2_greater_number_input;

public class MyException extends RuntimeException{
    public MyException(String message){super(message);}

    public MyException(String message, Exception exception){super(message, exception);}
}
