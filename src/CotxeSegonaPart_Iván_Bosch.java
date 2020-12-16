import java.util.Scanner;

public class CotxeSegonaPart_Iván_Bosch extends Cotxe_Iván_Bosch {
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
        if (tipuscanvi.equals(TipusCanvi.CanviManual)) {
            throw new Exception("Este coche no es automático.");
        } else if (a=='+'){
            Scanner sc = new Scanner(System.in);
            String gearRead = sc.next();
            switch (gearA) {
                case R:
                    ;
                case N:
                    ;
                case F:
                    ;
                    break;
            }
        } else if (a=='-'){
            switch (gearM){}
        }
    }
    public void CanviMarxaManual(char a) throws Exception{
        if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)){
            throw new Exception("Este coche no es manual.");
        }else{

        }
    }
}
