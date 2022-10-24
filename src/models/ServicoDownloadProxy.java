package models;

public class ServicoDownloadProxy implements Download{
    @Override
    public void baixar(String nome, String sobrenome, boolean premium) {
        if (premium == true ){
            ServicoDownload servicoDownload = new ServicoDownload();
        servicoDownload.baixar(nome,sobrenome,premium);
            System.out.println("Download concluido com Sucesso!");
        }
        else {
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.baixar(nome,sobrenome,premium);
            System.out.println("O seu plano nao permite downloads!");
        }
    }
}
