    public abstract class Cotxe implements InterfaceCotxe {

        protected String marca;
        protected String model;
        protected TipusCanvi tipuscanvi;
        public Cotxe(String marca, String model, TipusCanvi tipuscanvi) {
            this.marca=marca;
            this.model=model;
            this.tipuscanvi=tipuscanvi;
        }

    }
