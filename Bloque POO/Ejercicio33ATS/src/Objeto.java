public class Objeto {
    //Atributos.
    private int posX;
    private int posY;
    private String direccion;

    //Metodos.
    public Objeto() {
        this.posX = 0;
        this.posY = 0;
        this.direccion = "";
    }

    public void Arriba(){
        this.posY += 1;
        this.direccion = "Arriba";
    }
    public void Abajo(){
        this.posY += -1;
        this.direccion = "Abajo";
    }
    public void Derecha(){
        this.posX += 1;
        this.direccion = "Derecha";
    }
    public void Izquierda(){
        this.posX += -1;
        this.direccion = "Izquierda";
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getDireccion() {
        return direccion;
    }
}
