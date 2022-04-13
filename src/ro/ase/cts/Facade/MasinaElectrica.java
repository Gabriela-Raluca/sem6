package ro.ase.cts.Facade;

public class MasinaElectrica extends Masina {

    private float autonomieBaterie;

    public MasinaElectrica(String producator,String sasiu,String culoare,float autonomieBaterie){
        super(producator,sasiu,culoare);
        this.autonomieBaterie=autonomieBaterie;
    }

   public String getDetails(){

       return "MasinaElectrica{" +
               "producator='" + getProducator() + '\'' +
               ", sasiu='" + getSasiu() + '\'' +
               ", culoare='" + getCuloare() + '\'' +
               ", autonomie=" + getAutonomieBaterie() +
               '}';
   }

    public float getAutonomieBaterie() {
        return autonomieBaterie;
    }
}
