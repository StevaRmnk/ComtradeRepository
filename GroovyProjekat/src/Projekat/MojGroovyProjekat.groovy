package Projekat

class MojGroovyProjekat {
    static void main(args){
        println("Pozdrav Filipe :)");
        String ime = "Filip";
        println("Pozdrav" + ime + " :)");
        int a = 5;
        int b = 3;
        println(a+b)
        println(a*b)
        println(a-b)
        println(a/b)
        int c = 8;
        if(c == 8){
            println("Rezultat je " + c)
        }
        else{
            println("Netacno")
        }

        int y = 2
        switch (y){
            case {y<0}:println("Broj je negativan!")
                break
            case {y>0}: println("Broj je pozitivan!")
                break
            case {y=0}:println("Broj je jednak nuli!")
                break
            default: println("Nevalidna vrednost!")
        }

        for(int m=0;m<4;m++){
            println(m)
        }

        List<String> imena = ["Sara","Nikola","Miodrag"];
        for(String im in imena){
            if (im.equals("Miodrag")){
                println("Pozdrav Miodraze")
            }
        }

        Map mapa = ["godina":40,"pol":"muski"]

        for ( cv in mapa){
            println(cv.key)
        }

        Bombone prve = new Bombone();
        prve.setNaziv("Haribo");
        prve.setTipPakovanja(TipPakovanja.Meko)
        prve.setSadrzajSecera(40)

        Bombone druge = new Bombone();
        druge.setNaziv("Bronhi");
        druge.setTipPakovanja(TipPakovanja.Tvrdo)
        druge.setSadrzajSecera(25)

        Bombone trece = new Bombone();
        trece.setNaziv("Roki")
        trece.setSadrzajSecera(20)


        List<Bombone> mojeBombone = new ArrayList<>();
        mojeBombone.add(prve);
        mojeBombone.add(druge);
        mojeBombone.add(trece);

        for(Bombone bombona in mojeBombone){
            if (bombona.sadrzajSecera <24){
                println("Kupiti 200 grama " + bombona.naziv + " sa " + bombona.sadrzajSecera + "% secera")
            }
        }
        //proba1234

    }
}
