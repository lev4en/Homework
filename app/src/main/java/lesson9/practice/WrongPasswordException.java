package lesson9.practice;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(){
    }
    public  WrongPasswordException(String message){
        super(message);
    }
}