package LG2_Atividade;

import java.lang.Exception;

public class DiaException extends DataException{

    public DiaException() {
        System.out.println("Esse dia não consta no mês");
        this.printStackTrace();
    }

    public DiaException(String message) {
        super(message); /*herança*/
    }

    public DiaException(String message, Throwable cause) {
        super(message, cause); /*herança*/
    }

    public DiaException(Throwable cause) {
        super(cause); /*herança*/
    }
  
    public DiaException(String message, Throwable cause, boolean enableSuppression, boolean StackTrace) {
        super(message, cause, enableSuppression, StackTrace);
    }
}
