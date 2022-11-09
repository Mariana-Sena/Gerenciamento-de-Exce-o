package LG2_Atividade;

import java.lang.Exception;

public class AnoException extends Exception{
  
   public AnoException() {
        System.out.println("Este ano não e bissexto");
    }

    public AnoException(String message) {
        super(message); /*herança*/
    }

    public AnoException(String message, Throwable cause) {
        super(message, cause);  /*herança*/
    }

    public AnoException(Throwable cause) {
        super(cause); /*herança*/
    }

    public AnoException(String message, Throwable cause, boolean enableSuppression, boolean StackTrace) {
        super(message, cause, enableSuppression, StackTrace);
    }
}
