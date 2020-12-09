public class Cotxe_Iván_Bosch extends Cotxe implements InterfaceCotxe {
    private EstatsMotorCotxe estado=EstatsMotorCotxe.Aturat;
    private int revoluciones=0;
    public Cotxe_Iván_Bosch(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    //Constructor
    public Cotxe_Iván_Bosch(){
        super(null,null,null);
    }

    @Override
    public void arrancarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.Aturat)){
            this.estado=EstatsMotorCotxe.EnMarxa;
        }else{
            throw new Exception("El coche ya está en marcha");
        }
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        if (this.estado.equals(EstatsMotorCotxe.EnMarxa)){
            System.out.println("El coche está en marcha");
        }else{
            System.out.println("El coche está parado");
        }
        return estado;
    }

    @Override
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
    public void aturarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.EnMarxa)){
            this.estado=EstatsMotorCotxe.Aturat;
        }else{
            throw new Exception("El coche ya está parado");
        }
    }
}
