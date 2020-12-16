import java.util.Scanner;

public class CotxeSegonaPart_Iván_Bosch extends Cotxe_Iván_Bosch {
    private EstatsMotorCotxe estado=EstatsMotorCotxe.Aturat;
    private Gears gearA=Gears.N;
    private Gears gearM=Gears.N;
    public enum Gears {
        R,
        N,
        F,
        G1,
        G2,
        G3,
        G4,
        G5,
        G6
    }

    //Constructor
    public CotxeSegonaPart_Iván_Bosch(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }
    //Methods
    public void CanviMarxaAutomatic(char a) throws Exception {
    if (estado.equals(EstatsMotorCotxe.EnMarxa)){
        throw new Exception("¡El coche esta parado, hijo mío!");
    } else if (tipuscanvi.equals(TipusCanvi.CanviManual)) {
            throw new Exception("Este coche no es automático.");
        } else if (a=='+'){
            Scanner sc = new Scanner(System.in);
            switch (gearA) {
                case R:gearA=Gears.N;
                case N:gearA=Gears.F;
                case F:throw new Exception("¡No se pueden subir más marchas!");
            }
        } else if (a=='-'){
            switch (gearA){
                case F:gearA=Gears.N;
                case N:gearA=Gears.R;
                case R:throw new Exception("¡No se puede bajar más marchas!");
            }
        } else throw new Exception("¡No estás embragando, majo!¡Usa + o -!");
    }


    public void CanviMarxaManual(char a) throws Exception{
        if (estado.equals(EstatsMotorCotxe.EnMarxa)){
            throw new Exception("¡El coche esta parado, hijo mío!");
        } else if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)){
            throw new Exception("Este coche no es manual.");
        }else if (a=='+'){
            switch (gearM){
                case R:gearM=Gears.N;break;
                case N:gearM=Gears.G1;break;
                case G1:gearM=Gears.G2;break;
                case G2:gearM=Gears.G3;break;
                case G3:gearM=Gears.G4;break;
                case G4:gearM=Gears.G5;break;
                case G5:gearM=Gears.G6;break;
                case G6:throw new Exception("¡No se pueden subir más marchas!");
            }
        } else if (a=='-'){
            switch (gearA){
                case G6:gearM=Gears.G5;break;
                case G5:gearM=Gears.G4;break;
                case G4:gearM=Gears.G3;break;
                case G3:gearM=Gears.G2;break;
                case G2:gearM=Gears.G1;break;
                case G1:gearM=Gears.N;break;
                case N:gearM=Gears.R;break;
                case R:throw new Exception("¡No se puede bajar más marchas!");
            }
        } else throw new Exception("¡No estás embragando, majo!¡Usa + o -!");
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

    public Gears getGearA() {
        return gearA;
    }

    public void setGearA(Gears gearA) {
        this.gearA = gearA;
    }

    public Gears getGearM() {
        return gearM;
    }

    public void setGearM(Gears gearM) {
        this.gearM = gearM;
    }
}
