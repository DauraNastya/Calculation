package calc.exceptions;

public class EmptyNumberException extends Throwable {
    String message;

    public EmptyNumberException() {
    }

    public EmptyNumberException(String Message) {
        this.message = Message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String Message){
        this.message = Message;
    }
}
