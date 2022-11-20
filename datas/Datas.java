import java.time.LocalDateTime;

public class Datas {
    private int dia;
    private int mes;
    private int ano;
    private boolean dataInvalida;

    int bissexto = 0;

    public Datas() {
        this.dia = LocalDateTime.now().getDayOfMonth();
        this.mes = LocalDateTime.now().getMonthValue();
        this.ano = LocalDateTime.now().getYear();
    }
    
    public Datas (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if(this.dia < 1 || this.mes > 12 || this.mes < 1) {
            dataInvalida = true;
        }
        
        else if((this.mes == 01 || this.mes == 03 || this.mes == 05 || this.mes == 07 || this.mes == 8 || this.mes == 10 || this.mes == 12) && this.dia > 31) {
            dataInvalida = true;
        }
        
        else if((this.mes == 04 || this.mes == 06 || this.mes == 9 || this.mes == 11) && this.dia > 30) {
           dataInvalida = true;
        }
        
        else {

            if(this.ano % 400 == 0 || this.ano % 4 == 0 && this.ano % 100 != 0){
                bissexto = 1;

                if(this.dia > 29) {
                  dataInvalida = true;
                }
            }
            
            else if(this.dia > 28) {
              dataInvalida = true;
            }

        }

    }

    public String toString (){
        String data = Integer.toString(this.dia) + "/" + (this.mes) + "/" + (this.ano);     

        return data;
    }

    public void modificaData(){
        this.dia ++;

        if (this.mes == 01 || this.mes == 03 || this.mes == 05 || this.mes == 07 || this.mes == 8 || this.mes ==10 || this.mes == 12){
            if (this.dia == 31){
                this.dia = 01;
                this.mes ++;
            }
        }

        else if (this.mes == 04 || this.mes == 06 || this.mes == 9 || this.mes == 11){
            if (this.dia == 30) {
                this.dia = 01;
                this.mes++;
            }
        }

        else if (this.ano % 400 == 0 || this.ano % 4 == 0 || this.ano % 100 != 0){
            if (this.mes == 02 && this.dia > 29) {
                this.dia = 01;
                this.mes ++;
            }
        }

        else if (this.mes == 02 && this.dia > 28){
            this.dia = 01;
            this.mes ++;
        }

    } 

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDataInvalida(boolean dataInvalida) {
        this.dataInvalida = dataInvalida;
    }

    public boolean getDataInvalida() {
        return dataInvalida;
    }
}