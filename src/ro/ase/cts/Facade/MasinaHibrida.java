package ro.ase.cts.Facade;

public class MasinaHibrida extends Masina {

    private boolean plugIn;

    public MasinaHibrida(String producator, String sasiu, String culoare,boolean plugIn) {
        super(producator, sasiu, culoare);
        this.plugIn=plugIn;
    }

    public String getDetails(){

        return "MasinaHibrid{" +
                "producator='" + getProducator() + '\'' +
                ", sasiu='" + getSasiu() + '\'' +
                ", culoare='" + getCuloare() + '\'' +
                ", plugin=" + isPlugIn() +
                '}';
    }

    public boolean isPlugIn() {
        return plugIn;
    }


}
