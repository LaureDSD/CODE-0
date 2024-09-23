public class Dia {
    private String fecha;
    private int temperaturaMax;
    private int temperaturaMin;
    private int uvMax;
    private String aviso;
    private int manha;
    private int temperaturaMaxmanha;
    private int temperaturaMinmanha;
    private int pchoivamaha;
    private int ventomaha;
    private int tarde;
    private int temperaturaMaxtarde;
    private int temperaturaMintarde;
    private int pchoivatarde;
    private int ventotarde;
    private int noche;
    private int temperaturaMaxnoche;
    private int temperaturaMinnoche;
    private int pchoivanoche;
    private int ventonoche;

    public Dia(String fecha, int temperaturaMax, int temperaturaMin, int uvMax, String aviso, int manha,
               int temperaturaMaxmanha, int temperaturaMinmanha, int pchoivamaha, int ventomaha, int tarde,
               int temperaturaMaxtarde, int temperaturaMintarde, int pchoivatarde, int ventotarde, int noche,
               int temperaturaMaxnoche, int temperaturaMinnoche, int pchoivanoche, int ventonoche) {
        this.fecha = fecha;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.uvMax = uvMax;
        this.aviso = aviso;
        this.manha = manha;
        this.temperaturaMaxmanha = temperaturaMaxmanha;
        this.temperaturaMinmanha = temperaturaMinmanha;
        this.pchoivamaha = pchoivamaha;
        this.ventomaha = ventomaha;
        this.tarde = tarde;
        this.temperaturaMaxtarde = temperaturaMaxtarde;
        this.temperaturaMintarde = temperaturaMintarde;
        this.pchoivatarde = pchoivatarde;
        this.ventotarde = ventotarde;
        this.noche = noche;
        this.temperaturaMaxnoche = temperaturaMaxnoche;
        this.temperaturaMinnoche = temperaturaMinnoche;
        this.pchoivanoche = pchoivanoche;
        this.ventonoche = ventonoche;
    }

    @Override
    public String toString() {
        return "Dia{" +
                "fecha='" + fecha + '\'' +
                ", temperaturaMax=" + temperaturaMax +
                ", temperaturaMin=" + temperaturaMin +
                ", uvMax=" + uvMax +
                ", aviso='" + aviso + '\'' +
                ", manha=" + manha +
                ", temperaturaMaxmanha=" + temperaturaMaxmanha +
                ", temperaturaMinmanha=" + temperaturaMinmanha +
                ", pchoivamaha=" + pchoivamaha +
                ", ventomaha=" + ventomaha +
                ", tarde=" + tarde +
                ", temperaturaMaxtarde=" + temperaturaMaxtarde +
                ", temperaturaMintarde=" + temperaturaMintarde +
                ", pchoivatarde=" + pchoivatarde +
                ", ventotarde=" + ventotarde +
                ", noche=" + noche +
                ", temperaturaMaxnoche=" + temperaturaMaxnoche +
                ", temperaturaMinnoche=" + temperaturaMinnoche +
                ", pchoivanoche=" + pchoivanoche +
                ", ventonoche=" + ventonoche +
                '}';
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(int temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public int getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(int temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public int getUvMax() {
        return uvMax;
    }

    public void setUvMax(int uvMax) {
        this.uvMax = uvMax;
    }

    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public int getManha() {
        return manha;
    }

    public void setManha(int manha) {
        this.manha = manha;
    }

    public int getTemperaturaMaxmanha() {
        return temperaturaMaxmanha;
    }

    public void setTemperaturaMaxmanha(int temperaturaMaxmanha) {
        this.temperaturaMaxmanha = temperaturaMaxmanha;
    }

    public int getTemperaturaMinmanha() {
        return temperaturaMinmanha;
    }

    public void setTemperaturaMinmanha(int temperaturaMinmanha) {
        this.temperaturaMinmanha = temperaturaMinmanha;
    }

    public int getPchoivamaha() {
        return pchoivamaha;
    }

    public void setPchoivamaha(int pchoivamaha) {
        this.pchoivamaha = pchoivamaha;
    }

    public int getVentomaha() {
        return ventomaha;
    }

    public void setVentomaha(int ventomaha) {
        this.ventomaha = ventomaha;
    }

    public int getTarde() {
        return tarde;
    }

    public void setTarde(int tarde) {
        this.tarde = tarde;
    }

    public int getTemperaturaMaxtarde() {
        return temperaturaMaxtarde;
    }

    public void setTemperaturaMaxtarde(int temperaturaMaxtarde) {
        this.temperaturaMaxtarde = temperaturaMaxtarde;
    }

    public int getTemperaturaMintarde() {
        return temperaturaMintarde;
    }

    public void setTemperaturaMintarde(int temperaturaMintarde) {
        this.temperaturaMintarde = temperaturaMintarde;
    }

    public int getPchoivatarde() {
        return pchoivatarde;
    }

    public void setPchoivatarde(int pchoivatarde) {
        this.pchoivatarde = pchoivatarde;
    }

    public int getVentotarde() {
        return ventotarde;
    }

    public void setVentotarde(int ventotarde) {
        this.ventotarde = ventotarde;
    }

    public int getNoche() {
        return noche;
    }

    public void setNoche(int noche) {
        this.noche = noche;
    }

    public int getTemperaturaMaxnoche() {
        return temperaturaMaxnoche;
    }

    public void setTemperaturaMaxnoche(int temperaturaMaxnoche) {
        this.temperaturaMaxnoche = temperaturaMaxnoche;
    }

    public int getTemperaturaMinnoche() {
        return temperaturaMinnoche;
    }

    public void setTemperaturaMinnoche(int temperaturaMinnoche) {
        this.temperaturaMinnoche = temperaturaMinnoche;
    }

    public int getPchoivanoche() {
        return pchoivanoche;
    }

    public void setPchoivanoche(int pchoivanoche) {
        this.pchoivanoche = pchoivanoche;
    }

    public int getVentonoche() {
        return ventonoche;
    }

    public void setVentonoche(int ventonoche) {
        this.ventonoche = ventonoche;
    }
}