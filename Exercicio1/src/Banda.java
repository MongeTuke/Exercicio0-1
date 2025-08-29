public class Banda {
     String nome;
     String genero;

     Empresario empresario;

     Musica[] musicas;
     Membro[] membros;


    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
        this.membros = new Membro[5];
        this.musicas = new Musica[10];
    }


    void addMusicaNova(Musica novaMusica) {
        for (int i = 0; i < this.musicas.length; i++) {
            if (this.musicas[i] == null) {
                this.musicas[i] = novaMusica;
                return;
            }
        }

        System.out.println("A banda já atingiu o número máximo de músicas!");
    }

    void addMembroNovo(Membro novoMembro) {
        for (int i = 0; i < this.membros.length; i++) {
            if (this.membros[i] == null) {
                this.membros[i] = novoMembro;
                return;
            }
        }
        System.out.println("A banda já atingiu o número máximo de membros!");
    }

    void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }

    void mostraInfo() {
        System.out.println("Banda: " + this.nome);
        System.out.println("Gênero: " + this.genero);

        if (this.empresario != null) {
            System.out.println("Nome do empresario: " + this.empresario.getNome());
        } else {
            System.out.println("\nA banda não possui empresário.");
        }

        System.out.println("\n--- Membros da Banda ---");
        for (Membro membro : membros) {
            if (membro != null) {
                System.out.println(membro.getNome() + " - " + membro.getFuncao());
            }
        }

        System.out.println("\n--- Músicas da Banda ---");
        for (Musica musica : musicas) {
            if (musica != null) {
                System.out.println("'" + musica.getNome() + "' - Duração: " + musica.getDuracao() + " min");
            }
        }
    }
}