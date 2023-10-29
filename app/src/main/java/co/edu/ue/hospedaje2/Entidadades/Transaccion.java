package co.edu.ue.hospedaje2.Entidadades;

public class Transaccion {

    private String badgeOrin;
    private String badgeDest;
    private long amountOrin;
    private long tasa;

    public Transaccion(String badgeOrin, String badgeDest, long amountOrin, long tasa) {
        this.badgeOrin = badgeOrin;
        this.badgeDest = badgeDest;
        this.amountOrin = amountOrin;
        this.tasa = tasa;
    }

    public long changeBadge(){
        return (this.amountOrin * tasa);
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "badgeOrin='" + badgeOrin + '\'' +
                ", badgeDest='" + badgeDest + '\'' +
                ", amountOrin=" + amountOrin +
                ", tasa=" + tasa +
                '}';
    }
}
