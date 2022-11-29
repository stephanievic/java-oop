package sorteio_exception;

public class Sorteio {
    private int numSorteado;
  
    public double sortear (){
        return Math.random() * 1000;
    }

    public void verifica (int numUsuario) throws Exception{
        if (numUsuario < numSorteado){
            throw new MenorQueException();
        }

        else if (numUsuario > numSorteado){
            throw new MaiorQueException();
        }
    }
}
