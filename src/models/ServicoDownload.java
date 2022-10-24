package models;

public class ServicoDownload implements Download{
    @Override
    public void baixar(String nome, String sobrenome, boolean premium) {
        System.out.println("Usuario " + nome +" " + sobrenome +" " + "tem o Premium? " + premium);
    }
}
