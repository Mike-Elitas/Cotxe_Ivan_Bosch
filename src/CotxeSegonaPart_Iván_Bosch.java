
public class CotxeSegonaPart_Iván_Bosch extends Cotxe_Iván_Bosch {
    private EstatsMotorCotxe estat;
    private MarxesAutomatic marxaA;
    private MarxesManual marxaM;


    //Constructor
    public CotxeSegonaPart_Iván_Bosch(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
        this.estat=EstatsMotorCotxe.Aturat;
        this.marxaA=MarxesAutomatic.N;
        this.marxaM=MarxesManual.N;
    }
    //Methods
    void canviarMarxaAutomatic(MarxesAutomatic marxa) throws Exception{
        if (this.estat.equals(EstatsMotorCotxe.Aturat)){
            throw new Exception("El cotxe està aturat. No pots canviar de marxa");
        } else if (tipuscanvi.equals(TipusCanvi.CanviManual)){
            throw new Exception("Cotxe automàtic. No pots fer un canvi manual");
        } else{

        }
    }
    void canviarMarxaManual(MarxesManual marxa) throws Exception{
        if (this.estat.equals(EstatsMotorCotxe.Aturat)){
            throw new Exception("El cotxe està aturat. No pots canviar de marxa");
        } else if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)){
            throw new Exception("Cotxe manual. No pots fer un canvi automàtic");
        } else {
            switch (marxa){
                case R -> {
                    if (marxaM.equals(MarxesManual.N)) this.marxaM=MarxesManual.R;
                    else throw new Exception("Marxa incorrecta");
                }
                case N -> {
                    if (marxaM.equals(MarxesManual.R ) || marxaM.equals(MarxesManual.G1)) this.marxaM=MarxesManual.N;
                    else throw new Exception("Marxa incorrecta");
                }
            }
        }
    }


    @Override
    public void arrancarMotor() throws Exception {
        super.arrancarMotor();
    }

    @Override
    public void aturarMotor() throws Exception {
        super.aturarMotor();
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        return super.comprovaMotor();
    }

}
