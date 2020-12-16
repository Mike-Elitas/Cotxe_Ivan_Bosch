public class TestCotxeSegonaPart_Iván_Bosch {
    public static void main(String[] args) {
        CotxeSegonaPart_Iván_Bosch c1= new CotxeSegonaPart_Iván_Bosch("Audi","A1",TipusCanvi.CanviManual);
        c1.comprovaMotor();
        try {
            c1.arrancarMotor();
            c1.comprovaMotor();
            System.out.println(c1.getGearM());
            c1.CanviMarxaManual('+');c1.CanviMarxaManual('+');
            System.out.println(c1.getGearM());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
