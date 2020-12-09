public class Test_Cotxe_Ivan_Bosch {
    public static void main(String[] args) {
        Cotxe_Iván_Bosch c1=new Cotxe_Iván_Bosch("Audi","A1",TipusCanvi.CanviAutomatic);
        c1.comprovaMotor();
        try {
            c1.arrancarMotor();

        } catch (Exception e) {
            e.printStackTrace();
        }
        c1.comprovaMotor();
        try {
            c1.aturarMotor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        c1.getRevolucions();
        try {
            c1.arrancarMotor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        c1.getRevolucions();
    }
}
