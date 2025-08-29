
public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado("Coxinha");
        Salgado salgado2 = new Salgado("Pão de Queijo");
        Salgado salgado3 = new Salgado("Esfiha de Carne");

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();

        }
    }