package resumojava;
public final class DVD extends Item {
    private String diretor;
    // GET SET
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    //METODOS
    
    @Override
    public void listDVD(){
        System.out.println("Listar DVD: ");
    }
}
