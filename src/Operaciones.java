public class Operaciones {

    private int numero1, numero2;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public Operaciones() {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodos
    public int sumaNumeros(int numero1, int numero2){
        return numero1+numero2;
    }

    public int restaNumeros(int numero1, int numero2){
        return numero1-numero2;
    }

    public int multiplicacionNumeros(int numero1, int numero2){
        return numero1*numero2;
    }

    public int divisionNumeros(int numero1, int numero2){
        return numero1/numero2;
    }
}
