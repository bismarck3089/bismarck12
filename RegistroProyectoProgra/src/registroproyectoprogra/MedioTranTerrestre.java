package registroproyectoprogra;

public class MedioTranTerrestre extends MedioTransportes{ 
     private double costoPorkilometro;
    private double peso;
    private double cantidadKilometrosRecorridos;
    private double costototal;

    public double getCostoPorkilometro() {
        return costoPorkilometro;
    }

    public double getCostototal() {
        return costototal;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }

    public void setCostoPorkilometro(double costoPorkilometro) {
        this.costoPorkilometro = costoPorkilometro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCantidadKilometrosRecorridos() {
        return cantidadKilometrosRecorridos;
    }

    public void setCantidadKilometrosRecorridos(double cantidadKilometrosRecorridos) {
        this.cantidadKilometrosRecorridos = cantidadKilometrosRecorridos;
    }
    
    public String CostoGasolina(){
       this.costototal=this.costoPorkilometro*this.cantidadKilometrosRecorridos;
       return "El costo total es" + this.costototal;
    }
}
