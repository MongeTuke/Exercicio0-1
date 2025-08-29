public class Empresario {
     String nome;
     long cnpj;

    public Empresario(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public long getCnpj() {
        return cnpj;
    }
}