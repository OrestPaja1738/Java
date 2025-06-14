import java.time.LocalDate;

public class Kredi {
    private String krediMarres;
    private String numerDokumenti;
    private LocalDate dataKthimit;
    private boolean statusKthimi;
    
    public Kredi(String krediMarres,String numerDokumenti,LocalDate dataKthimit,boolean statusKthimi){
        this.krediMarres = krediMarres;
        this.numerDokumenti = numerDokumenti;
        this.dataKthimit = dataKthimit;
        this.statusKthimi = statusKthimi;
    }

    public String merrKrediMarres(){
        return krediMarres;
    }
    public String merrNumerDokumenti(){
        return numerDokumenti;
    }
    public LocalDate merrDateKthimi(){
        return dataKthimit;
    }
    public boolean eshteKthyer(){
        return statusKthimi;
    }
}
