package ro.ase.cts.Facade;

public class MasinaClasica extends Masina {

    private String aditivCompatibil;

    public MasinaClasica(String producator, String sasiu, String culoare,String aditivCompatibil) {
        super(producator, sasiu, culoare);
        this.aditivCompatibil=aditivCompatibil;
    }

    public String getDetails(){

        return "MasinaClasica{" +
                "producator='" + getProducator() + '\'' +
                ", sasiu='" + getSasiu() + '\'' +
                ", culoare='" + getCuloare() + '\'' +
                ", aditivCompatibil='" + getAditivCompatibil() + '\'' +
                '}';
    }

    public String getAditivCompatibil() {
        return aditivCompatibil;
    }
}
