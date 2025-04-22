public abstract class Planta {
    private String nome;
    private String tipo;
    private int diasDesdeUltimoCuidado;

    public Planta(String nome, String tipo, int diasDesdeUltimoCuidado) {
        this.nome = nome;
        this.tipo = tipo;
        this.diasDesdeUltimoCuidado = diasDesdeUltimoCuidado;
    }

    public abstract void realizarCuidado();
    
    public abstract void precisaDeCuidado();

    public void exibirInformacoes() {
        System.out.println("\n\nNome: " + getNome() + "\nTipo: " + getTipo() + "Dias desde que foi cuidada: " + getDiasDesdeUltimoCuidado());
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDiasDesdeUltimoCuidado() {
        return diasDesdeUltimoCuidado;
    }
}