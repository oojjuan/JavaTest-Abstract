public class Suculenta extends Planta {
    
    public Suculenta(String nome, String tipo, int diasDesdeUltimoCuidado) {
        super(nome, tipo, diasDesdeUltimoCuidado);
    }

    @Override
    public void realizarCuidado() {
        System.out.println("A suculenta foi cuidada! com sucesso!\n> Borrifada água e mantida na sombra");
        setDiasDesdeUltimoCuidado(0);
    }

    @Override
    public void precisaDeCuidado() {
        if (getDiasDesdeUltimoCuidado() > 7) {
            System.out.println("A planta necessita de cuidados!");
        } else {
            System.out.println("A planta não precisa de cuidados!");
        }
        System.out.println("> Ultima vez que foi cuidada: " + getDiasDesdeUltimoCuidado() + " dias atrás");
    }
}
