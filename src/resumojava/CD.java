package resumojava;
public class CD extends Item {
    private String artista;
    private String faixas;
    // GET & SET
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getFaixas() {
        return faixas;
    }
    public void setFaixas(String faixas) {
        this.faixas = faixas;
    }
    // METODOS 
    @Override
    public void listCD(){
        System.out.println("Listar CD: ");
    }
}
