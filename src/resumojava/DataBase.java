package resumojava;
import java.util.ArrayList;
public class DataBase {
    ArrayList<Item> itens = new ArrayList();

    public DataBase() {
    }
    
    
    public void list(){
        int i;
        System.out.printf("\nPercorrendo o ArrayList\n");
        int n = itens.size();
        for ( i = 0 ; i < n ; i++) {
            System.out.printf("Posição %d- %s\n", i, itens.get(i));
            i++;
        }
    }
   public void listCD(){
        System.out.println("Listar CD: ");
    }
    public void listDVD(){
        System.out.println("Listar DVD: ");
    }
    
}
