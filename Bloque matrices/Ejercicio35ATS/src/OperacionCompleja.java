public class OperacionCompleja implements IOperacionCompleja {
    //Atrbutos o propiedades.
    private int parteRealA;
    private int parteComplejaA;
    private int parteRealB;
    private int parteComplejaB;
    private int escalar;
    //Método constructor
    public OperacionCompleja() {
    }

    public int getParteRealA() {
        return parteRealA;
    }

    public void setParteRealA(int parteRealA) {
        this.parteRealA = parteRealA;
    }

    public int getParteComplejaA() {
        return parteComplejaA;
    }

    public void setParteComplejaA(int parteComplejaA) {
        this.parteComplejaA = parteComplejaA;
    }

    public int getParteRealB() {
        return parteRealB;
    }

    public void setParteRealB(int parteRealB) {
        this.parteRealB = parteRealB;
    }

    public int getParteComplejaB() {
        return parteComplejaB;
    }

    public void setParteComplejaB(int parteComplejaB) {
        this.parteComplejaB = parteComplejaB;
    }

    public int getEscalar() {
        return escalar;
    }

    public void setEscalar(int escalar) {
        this.escalar = escalar;
    }

    //Metodos de la clase
    @Override
    public int[] suma() { //Suma entre complejos.
        return new int[]{
                parteRealA+parteRealB, //Parte real.
                parteComplejaA+parteComplejaB //Parte compleja.
        };
    }

    @Override
    public int[] multiplicacion() {//Multiplicación entre complejos.
        return new int[]{
                (parteRealA*parteRealB)-(parteComplejaA*parteComplejaB), //Parte real.
                (parteRealA*parteComplejaB)+(parteComplejaA*parteRealB) //Parte compleja.
        };
    }

    @Override
    public boolean comparacion() {//Comparación entre complejos.
        return ((parteRealA == parteRealB) && (parteComplejaA == parteComplejaB));
    }

    @Override
    public int[] enteroPorComplejo() { //Escalar por complejo.
        return new int[]{
                escalar*parteRealA, //Parte real.
                escalar*parteComplejaA //Parte compleja.
        };
    }
}
