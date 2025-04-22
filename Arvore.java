public class Arvore extends Planta {
    
    public Arvore(String nome, String tipo, int diasDesdeUltimoCuidado) {
        super(nome, tipo, diasDesdeUltimoCuidado);
    }

    @Override
    public void realizarCuidado() {
        System.out.println("A arvore foi cuidada! com sucesso!\n> Adubada e sem presença de pragas");
        setDiasDesdeUltimoCuidado(0);
    }

    @Override
    public void precisaDeCuidado() {
        if (getDiasDesdeUltimoCuidado() > 5) {
            System.out.println("A árvore necessita de cuidados!");
        } else {
            System.out.println("A árvore não precisa de cuidados!");
        }
        System.out.println("> Ultima vez que foi cuidada: " + getDiasDesdeUltimoCuidado() + " dias atrás");
    }
}