public class Cotxe_Iván_Bosch extends CotxeAbstracte implements InterfaceCotxe {
    private EstatsMotorCotxe estado=EstatsMotorCotxe.Aturat;
    private int revoluciones=0;

    //Constructor
    public Cotxe_Iván_Bosch(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    @Override
    //Arranca el motor y si está en marcha muestra una excepción.
    public void arrancarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.Aturat)){
            this.estado=EstatsMotorCotxe.EnMarxa;
        }else{
            throw new Exception("El coche ya está en marcha");
        }
    }

    @Override
    //Muestra si el motor está en marcha o parado.
    public EstatsMotorCotxe comprovaMotor() {
        if (this.estado.equals(EstatsMotorCotxe.EnMarxa)){
            System.out.println("El coche está en marcha");
        }else{
            System.out.println("El coche está parado");
        }
        return estado;
    }

    @Override
    //Muestra las revoluciones que són 0 si el motor está parado y un número aleatorio entre 1 y 6500 si está en marcha.
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
    //Para el motor si está en marcha y da una excepción si ya estaba parado.
    public void aturarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.EnMarxa)){
            this.estado=EstatsMotorCotxe.Aturat;
        }else{
            throw new Exception("El coche ya está parado");
        }
    }
}
