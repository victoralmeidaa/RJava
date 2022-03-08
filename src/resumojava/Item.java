package resumojava;
public class Item extends DataBase{
    private String titulo;
    private Double duracao;
    private String comentarios;
    
    // GET & SET
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String x){
        this.titulo = x;
    }
    public Double getDuracao(){
        return this.duracao;
    }
    public void setDuracao(Double x){
        this.duracao = x;
    }
    public String getComentario(){
        return this.comentarios;
    }
    public void setComentario(String x){
        this.comentarios = x;
    }
    
    // MEDOTOS 
    public void print(){
        
    }

    @Override
    public String toString() {
        return "Item{" + "titulo=" + titulo + ", duracao=" + duracao + ", comentarios=" + comentarios + '}';
    }
    
}
