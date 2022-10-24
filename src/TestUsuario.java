import models.Download;
import models.ServicoDownloadProxy;
import models.Usuario;
import org.junit.jupiter.api.Test;

public class TestUsuario {
    @Test
    public void download1(){

        Usuario user1 = new Usuario("Diogo","Cunha",true);
        Download download = new ServicoDownloadProxy();
        download.baixar(user1.getNome(),user1.getSobrenome(),user1.getPremium());

    }
    @Test
public void download2(){
    Usuario user2 = new Usuario("Fulano","Beltrano",false);
    Download download = new ServicoDownloadProxy();
    download.baixar(user2.getNome(),user2.getSobrenome(),user2.getPremium());

}

}
