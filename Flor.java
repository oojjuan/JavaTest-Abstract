public class Flor extends Planta {
    
    public Flor(String nome, String tipo, int diasDesdeUltimoCuidado) {
        super(nome, tipo, diasDesdeUltimoCuidado);
    }
    
    @Override
    public void realizarCuidado() {
        System.out.println("A planta foi cuidada com sucesso!\n> Regada e exposta ao sol");
        setDiasDesdeUltimoCuidado(0);        
    }

    @Override
    public void precisaDeCuidado() {
        if (getDiasDesdeUltimoCuidado() > 2) {
            System.out.println("A planta necessita de cuidados!");
        } else {
            System.out.println("A planta não precisa de cuidados!");
        }
        System.out.println("> Ultima vez que foi cuidada: " + getDiasDesdeUltimoCuidado() + " dias atrás");
    }
}
