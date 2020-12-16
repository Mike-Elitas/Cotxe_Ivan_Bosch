public class TestCotxeSegonaPart_Iván_Bosch {
    public static void main(String[] args) {
        CotxeSegonaPart_Iván_Bosch c1= new CotxeSegonaPart_Iván_Bosch("Audi","A1",TipusCanvi.CanviAutomatic);
        c1.comprovaMotor();
        try {
            c1.arrancarMotor();
            c1.comprovaMotor();
            System.out.println(c1.getGearA());
            c1.CanviMarxaAutomatic('-');
            System.out.println(c1.getGearA());

            System.out.println(c1.getGearA());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
