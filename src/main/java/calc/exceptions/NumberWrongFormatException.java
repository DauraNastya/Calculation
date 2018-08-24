package calc.exceptions;

public class NumberWrongFormatException extends Exception {
    String message;

    public NumberWrongFormatException() {
    }

    public NumberWrongFormatException(String Message) {
        this.message = Message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String Message){
        this.message = Message;
    }
}
