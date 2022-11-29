package sorteio_exception;

public class MenorQueException extends Exception {
    public String getMessage (){
        return "Número menor que o sorteado!";
    }
}
