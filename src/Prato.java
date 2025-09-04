import java.util.ArrayList;

public class Prato {
    private String nome;
    private String tipo;

    private ArrayList<Prato> pratos = new ArrayList<Prato>();

    public Prato(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
}
