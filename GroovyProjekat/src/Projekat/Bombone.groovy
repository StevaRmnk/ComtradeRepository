package Projekat

class Bombone {

    private String naziv;
    private TipPakovanja tipPakovanja;
    private int sadrzajSecera;

    Bombone(){

    }

    String getNaziv() {
        return naziv
    }

    void setNaziv(String naziv) {
        this.naziv = naziv
    }

    TipPakovanja getTipPakovanja() {
        return tipPakovanja
    }

    void setTipPakovanja(TipPakovanja tipPakovanja) {
        this.tipPakovanja = tipPakovanja
    }

    int getSadrzajSecera() {
        return sadrzajSecera
    }

    void setSadrzajSecera(int sadrzajSecera) {
        this.sadrzajSecera = sadrzajSecera
    }

    Bombone(String naziv, TipPakovanja tipPakovanja, int sadrzajSecera) {
        this.naziv = naziv
        this.tipPakovanja = tipPakovanja
        this.sadrzajSecera = sadrzajSecera
    }

    static void proveriTipPakovanja(Bombone bom){
        println("Tip je  : " + bom?.tipPakovanja)
    }
}
