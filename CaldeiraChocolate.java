

public class CaldeiraChocolate {

    private static CaldeiraChocolate instancia;

    
    private boolean vazia;
    private boolean fervida;

    private CaldeiraChocolate() {
        this.vazia = true;
        this.fervida = false;
    }

    // Obter a instância única
    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    
    public String encher() {
        if (this.vazia == true) {
            this.vazia = false;
            return "A caldeira foi preenchida com chocolate e leite.";
        }
        else {
            
            return "A caldeira está cheia.";
        }
    }
    public String ferver() {
        if (this.vazia == false) {
            this.fervida = true;
            return "A caldeira está fervendo.";
        }
        else {
            
            return "A caldeira está vazia.";
        }
    }
    public String drenar() {
        if (this.fervida == true) {
            this.fervida = false;
            this.vazia = true;
            return "Mistura drenada.";
        }
        else {
            
            return "A caldeira não ferveu.";
        }
    }
    

    
}
