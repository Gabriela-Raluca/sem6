package ro.ase.cts.Facade;

public class Main {
    public static void main(String[] args) {

        DealerAuto dealer=new DealerAuto();
        System.out.println(dealer.getDetailsMasinaClasica());
        System.out.println(dealer.getDetailsMasinaElectrica());
        System.out.println(dealer.getDetailsMasinaHibrida());
    }
}
