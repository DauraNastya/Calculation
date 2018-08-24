package calc.exceptions;

public class NullDividerException extends Exception {
    String message;

    public NullDividerException() {
    }

    public NullDividerException(String Message) {
        this.message = Message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String Message){
        this.message = Message;
    }
}
