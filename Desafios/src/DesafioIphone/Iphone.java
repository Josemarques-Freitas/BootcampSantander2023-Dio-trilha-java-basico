package DesafioIphone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private List<Musica> listaMusicas;
    private List<Banda> listaBandas;
    private List<Album> listaAlbums;
    private List<Contato> listaContatos;

    public Iphone() {
        this.listaMusicas = new ArrayList<>();
        this.listaBandas = new ArrayList<>();
        this.listaAlbums = new ArrayList<>();
        this.listaContatos = new ArrayList<>();

    }

    private void adicionarMusica(Musica musica) {
        listaMusicas.add(musica);
    }

    private void adicionarBanda(Banda banda) {
        listaBandas.add(banda);
    }

    private void adicionarAlbum(Album album) {
        listaAlbums.add(album);
    }

    private void adicionarContato(Contato contato) {
        listaContatos.add(contato);
    }

    @Override
    public void selecionarMusica(Musica musica, Banda banda, Album album) {
        System.out
                .println("Musica selecionada: " + musica.getNome() + " , " + banda.getNome() + " , " + album.getNome());
    }

    @Override
    public void tocarMusica(Musica musica, Banda banda, Album album) {
        System.out.println(
                "Reproduzir música: " + musica.getNome() + " , " + banda.getNome() + " , " + album.getNome());

    }

    @Override
    public void pausarMusica(Musica musica, Banda banda, Album album) {
        System.out.println("Pausando música: " + musica.getNome() + " , " + banda.getNome() + " , " + album.getNome());
    }

    @Override
    public void iniciarCorreioVoz(String string) {
        System.out.println("Iniciando correio de voz: " + string);
    }

    @Override
    public void fazerChamada(Contato contato) {
        if (contatoExiste(contato)) {
            System.out.println("Ligando para: " + contato.getNome() + " " + contato.getNumero());
        } else {
            fazerChamadaNumeroDesconhecido();
        }
    }

    @Override
    public void atendendoChamada() {
        Random random = new Random();
        Boolean atendeuChamada = random.nextBoolean();

        if (atendeuChamada) {
            System.out.println("Atendendo número: " + random.nextInt(900000000));
        } else {
            System.out.println("Atendendo número desconhecido: ");
        }
    }

    private boolean contatoExiste(Contato contato) {
        for (Contato c : listaContatos) {
            if (c.getNumero() == contato.getNumero())
                ;
            {
                return true;
            }
        }

        return false;

    }

    private void fazerChamadaNumeroDesconhecido() {
        Random random = new Random();
        int qualquerNumero = 1000000000 + random.nextInt(900000000);
        System.out.println("Ligando para: " + qualquerNumero);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova Aba: " + url);
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Album album1 = new Album("LONG LIVE LOVE");
        Album album2 = new Album("SINGLE");
        Banda banda1 = new Banda("Kirk Franklin");
        Banda banda2 = new Banda("Terrian");
        Musica musica1 = new Musica("Love Theory");
        Musica musica2 = new Musica("Big God");
        Contato contato1 = new Contato("José", 996323133);
        Contato contato2 = new Contato("Marques", 996545654);
        iphone.adicionarAlbum(album1);
        iphone.adicionarAlbum(album2);
        iphone.adicionarBanda(banda1);
        iphone.adicionarBanda(banda2);
        iphone.adicionarMusica(musica1);
        iphone.adicionarMusica(musica2);
        iphone.adicionarContato(contato1);
        iphone.adicionarContato(contato2);

        iphone.selecionarMusica(musica2, banda2, album2);
        iphone.tocarMusica(musica2, banda2, album2);
        iphone.pausarMusica(musica2, banda2, album2);
        iphone.iniciarCorreioVoz("*100");
        iphone.atendendoChamada();
        iphone.fazerChamada(contato1);
        iphone.exibirPagina("https://web.dio.me/home");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba("https://www.google.com.br/");

    }

}