import java.util.ArrayList;

public class KrediMarres {
    private String emri;

    ArrayList<Kredi> listaKredise;

    public KrediMarres(String emri){
        this.emri = emri;
        listaKredise = new ArrayList<>();
    }

    public String merrEmer(){
        return emri;
    }
    public Kredi gjejKredi(String numriKredise){
        if (listaKredise.isEmpty()) {
            System.out.println("KrediMarresi nuk ka asnje kredi!");
            return null;
        }
        else{
            Kredi kredi;
            int indeks = 0;
            boolean status = false;

            for(int i = 0;i < listaKredise.size();i++){
                if (listaKredise.get(i).merrNumerDokumenti().equals(numriKredise)) {
                    status = true;
                    System.out.println("Kredia u gjet ne liste");
                    indeks = i;
                }
            }

            if (!status) {
                System.out.println("Kredia nuk u gjet ne liste");
                return null;
            }

            kredi = listaKredise.get(indeks);
            
            return kredi;
        }
    }
    public void shtoKredi(Kredi kredi){
        if (listaKredise.contains(kredi)) {
            System.out.println("Kjo kredi nuk mund te shtohet pasi eshte ne liste!");
        }
        else{
            listaKredise.add(kredi);
        }
    }
}
