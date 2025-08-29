import java.nio.file.FileSystemNotFoundException;

public class Cantina {
   public String nome;
    Salgado salgados[] = new Salgado[3];

    void addSalgado(Salgado novoSalgado)
    {
        for (int i = 0; i<4; i++){
            if (salgados[i]==null) {
                salgados[i] = novoSalgado;
                return;
            }
        }
    }

    void mostraInfo()
    {
        for (Salgado salgado: salgados) {
            if (salgado!=null) {
                System.out.println(salgado.nome);
            }
        }
    }
}
