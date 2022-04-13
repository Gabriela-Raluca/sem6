package ro.ase.cts.Facade;

public class DealerAuto {

    private MasinaClasica mc=new MasinaClasica("BMW","WAL6C4243","negru","Aditiv Diesel");
    private MasinaElectrica me=new MasinaElectrica("Tesla","COL9C267e4","alb",250);
    private MasinaHibrida mh=new MasinaHibrida("Renault","ROL72D09","gri",true);

    //in mom in care se creeaza dealer, facem constr prin care se instanziaza obiectele cele 3

    public String getDetailsMasinaClasica(){
        return mc.getDetails();
    }

    public String getDetailsMasinaElectrica(){
        return me.getDetails();
    }
    public String getDetailsMasinaHibrida(){
        return mh.getDetails();
    }
}
