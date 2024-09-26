
public class FabricaDeChocolate {

    public static void main(String[] args) {
       
        CaldeiraChocolate f1 = CaldeiraChocolate.getInstancia();

        
        

        
        System.out.println(f1.encher());
        System.out.println(f1.encher());
        System.out.println(f1.ferver());
        System.out.println(f1.drenar());
        System.out.println(f1.encher());

    }

}

