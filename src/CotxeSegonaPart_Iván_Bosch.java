import java.util.Scanner;

public class CotxeSegonaPart_Iván_Bosch extends Cotxe_Iván_Bosch {
    //Constructor
    public CotxeSegonaPart_Iván_Bosch(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }
    //Methods
    public void CanviMarxaAutomatic() throws Exception{
        if (tipuscanvi.equals(TipusCanvi.CanviManual)){
            throw new Exception("Este coche no es automático.");
        }else{
            Scanner sc=new Scanner(System.in);
            String gearRead=sc.next();
            switch (gearRead){
                case "+":;
                case "-":;
                default:;
                break;
            }
            switch (Gears){
                case "R":;
                case "N":;
                default:;
                    break;
        }
    }
    public void CanviMarxaManual() throws Exception{
        if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)){
            throw new Exception("Este coche no es manual.");
        }else{

        }
    }
}
