public class Cotxe_Iván_Bosch extends CotxeAbstracte implements InterfaceCotxe {
    //Inicializa el motor por defecto parado y por tanto las revoluciones tambien se inicializan en 0.
    private EstatsMotorCotxe estado=EstatsMotorCotxe.Aturat;
    private int revoluciones=0;


    //Constructor
    public Cotxe_Iván_Bosch(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    @Override
    //Este metodo arranca el motor si está parado y muestra una excepción si ya está en marcha
    public void arrancarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.Aturat)){
            this.estado=EstatsMotorCotxe.EnMarxa;
        }else{
            throw new Exception("El coche ya está en marcha");
        }
    }

    @Override
    //Muestra el estado actual del motor
    public EstatsMotorCotxe comprovaMotor() {
        if (this.estado.equals(EstatsMotorCotxe.EnMarxa)){
            System.out.println("El coche está en marcha");
        }else{
            System.out.println("El coche está parado");
        }
        return estado;
    }

    @Override
    //Muestra las revoluciones del motor que son 0, si está parado, o un número aleatorio entre 1 o 6500 si está encendido.
    public int getRevolucions() {
        if (this.estado.equals(EstatsMotorCotxe.Aturat)){
            System.out.println("El coche está parado, así que las revoluciones son "+revoluciones);
            return 0;
        }else{
            this.revoluciones= (int) (Math.random()*6500+1);
            return revoluciones;

        }
    }

    @Override
    //Apaga el motor si está encendido o muestra una excepción si ya está parado
    public void aturarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.EnMarxa)){
            this.estado=EstatsMotorCotxe.Aturat;
        }else{
            throw new Exception("El coche ya está parado");
        }
    }
}
