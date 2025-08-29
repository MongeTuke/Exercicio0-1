public class Main {
    public static void main(String[] args) {

        Empresario empresario = new Empresario("Neide Cantinas", 12345678901234L);

        Banda minhaBanda = new Banda("Engenheiros do Inatel", "Rock Nacional");

        minhaBanda.setEmpresario(empresario);

        Membro membro1 = new Membro("Humberto Cisneros", "Vocalista e Baixista");
        Membro membro2 = new Membro("Jonas Brothers", "Baterista");
        Membro membro3 = new Membro("Renan Calculos", "Guitarrista");

        minhaBanda.addMembroNovo(membro1);
        minhaBanda.addMembroNovo(membro2);
        minhaBanda.addMembroNovo(membro3);

        Musica musica1 = new Musica("Infinita NP3", 6.13);
        Musica musica2 = new Musica("O Soned é Pop", 3.48);
        Musica musica3 = new Musica("Pra Ser falso", 3.13);

        minhaBanda.addMusicaNova(musica1);
        minhaBanda.addMusicaNova(musica2);
        minhaBanda.addMusicaNova(musica3);

        minhaBanda.mostraInfo();
    }
}