package by.antonPysk.arrayApi.exception;

public class IncorrectConditionException extends Exception{
    private  String massage;
    public  IncorrectConditionException(){
        massage=" Incorrect condition";
    }

    public String getMassage() {
        return massage;
    }
}
