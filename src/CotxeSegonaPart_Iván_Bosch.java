
public class CotxeSegonaPart_Iván_Bosch extends Cotxe_Iván_Bosch {

    //Variables que creamos para poder manejar el estado del motor y las marchas del coche.
    private EstatsMotorCotxe estat;
    private MarxesAutomatic marxaA;
    private MarxesManual marxaM;


    /*Constructor que solicita la marca, modelo y el tipo de transmision del coche que se esta creando,
     el cual tendrá por defectoel motor apagado y la marcha N colocada.*/
    public CotxeSegonaPart_Iván_Bosch(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
        this.estat=EstatsMotorCotxe.Aturat;
        this.marxaA=MarxesAutomatic.N;
        this.marxaM=MarxesManual.N;
    }
    //Metodos
    void canviarMarxaAutomatic(MarxesAutomatic marxa) throws Exception{
        /*Este metodo wata pensado para los coches con transmision automatica
         No efectuara cambios de marcha si el coche no esta en marcha ni si el coche al que
         se intenta cambiar la marcha es de transmsion manual.
         En addendum este metodo esta diseñado para cambios de marcha procedurales,
         es decir que no se podra saltar ninguna marcha intermedia para realizar los cambios.
        */
        if (this.estat.equals(EstatsMotorCotxe.Aturat)){
            throw new Exception("El cotxe està aturat. No pots canviar de marxa");
        } else if (tipuscanvi.equals(TipusCanvi.CanviManual)){
            throw new Exception("Cotxe automàtic. No pots fer un canvi manual");
        } else{
            switch (marxa){
                case R -> {
                    if (marxaA.equals(MarxesAutomatic.N)) this.marxaA=MarxesAutomatic.R;
                    else throw new Exception("Marxa incorrecta"); break;
                }
                case N -> {
                    if (marxaA.equals(MarxesAutomatic.R ) || marxaM.equals(MarxesAutomatic.F)) this.marxaA=MarxesAutomatic.N;
                    else throw new Exception("Marxa incorrecta"); break;
                }
                case F -> {
                    if (marxaA.equals(MarxesAutomatic.N)) this.marxaA=MarxesAutomatic.F;
                    else throw new Exception("Marxa incorrecta"); break;
                }
            }
        }
    }
    void canviarMarxaManual(MarxesManual marxa) throws Exception{
        /*Este metodo wata pensado para los coches con transmision manual
         Este metodo funciona igual que el metodo anterior exceptuando que en el caso de los coches manuales contamos con mas marchas.
        */
        if (this.estat.equals(EstatsMotorCotxe.Aturat)){
            throw new Exception("El cotxe està aturat. No pots canviar de marxa");
        } else if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)){
            throw new Exception("Cotxe manual. No pots fer un canvi automàtic");
        } else {
            switch (marxa){
                case R -> {
                    if (marxaM.equals(MarxesManual.N)) this.marxaM=MarxesManual.R;
                    else throw new Exception("Marxa incorrecta"); break;
                }
                case N -> {
                    if (marxaM.equals(MarxesManual.R ) || marxaM.equals(MarxesManual.G1)) this.marxaM=MarxesManual.N;
                    else throw new Exception("Marxa incorrecta"); break;
                }
                case G1 -> {
                    if (marxaM.equals(MarxesManual.N) || marxaM.equals(MarxesManual.G2)) this.marxaM=MarxesManual.G1;
                    else throw new Exception("Marxa incorrecta"); break;
                }
                case G2 -> {
                    if (marxaM.equals(MarxesManual.G1) || marxaM.equals(MarxesManual.G3)) this.marxaM=MarxesManual.G2;
                    else throw new Exception("Marxa incorrecta"); break;
                }
                case G3 -> {
                    if (marxaM.equals(MarxesManual.G2) || marxaM.equals(MarxesManual.G4)) this.marxaM=MarxesManual.G3;
                    else throw new Exception("Marxa incorrecta"); break;
                }
                case G4 -> {
                    if (marxaM.equals(MarxesManual.G3) || marxaM.equals(MarxesManual.G5)) this.marxaM=MarxesManual.G4;
                    else throw new Exception("Marxa incorrecta"); break;
                }
                case G5 -> {
                    if (marxaM.equals(MarxesManual.G4) || marxaM.equals(MarxesManual.G6)) this.marxaM=MarxesManual.G5;
                    else throw new Exception("Marxa incorrecta"); break;
                }
                case G6 -> {
                    if (marxaM.equals(MarxesManual.G5)) this.marxaM=MarxesManual.G6;
                    else throw new Exception("Marxa incorrecta"); break;
                }
            }
        }
    }


    @Override
    public void arrancarMotor() throws Exception {
        //Este metodo se hereda de la clase padre y simplemente arranca el motor si esta apagado o dar una excepcion si ya esta en marcha.
        super.arrancarMotor();
    }

    @Override
    public void aturarMotor() throws Exception {
        //Hace lo contrario al metodo anterior.
        super.aturarMotor();
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        //Muestra por pantalla el estado actual del motor. En Marcha/Apagado.
        return super.comprovaMotor();
    }

}
