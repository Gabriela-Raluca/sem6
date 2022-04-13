package ro.ase.cts.Facade;

 public abstract class Masina {

    private String producator;
    private String sasiu;
    private String culoare;

    public  String getDetails() {
        return null;
    }

    public String getProducator() {
        return producator;
    }

    public String getSasiu() {
        return sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Masina(String producator, String sasiu, String culoare) {
        this.producator = producator;
        this.sasiu = sasiu;
        this.culoare = culoare;
    }
}

