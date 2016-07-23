package registroproyectoprogra;

public class Empleado extends Persona {
     private Taxi taxi =new Taxi();

    public Empleado () {
    }
     
    
    public Taxi GetTaxi(){
        return this.taxi;
    }
    public String Conducir(){
    
    return"En este momento conduzco hacia donde un cliente ";
    
    }
    public String atenderCliente(){
    
    return"Buenos dias hacia donde la podemos llevar";
    
    }
    public String cobrarTarifa(double pago){
    
    return "Su viaje cuesta "+pago+"gracias";
    }
    
    
}
