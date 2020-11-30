
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Erotus extends Komento {
    private TextField tk;
    private TextField sk;
    private Button nollaa;
    private Button undo;
    private Sovelluslogiikka s;
    private int edellinen;
    
    public Erotus(TextField tk, TextField sk, Button nollaa, Button undo, Sovelluslogiikka s) {
        this.tk = tk;
        this.sk = sk;
        this.nollaa = nollaa;
        this.undo = undo;
        this.s = s;
        this.edellinen = 0;
    }

    @Override
    public void suorita() {
        int arvo = 0;
        try {
            arvo = Integer.parseInt(sk.getText());
        } catch (Exception e) {
        }
        this.s.miinus(arvo);
        this.edellinen = arvo;
        int laskunTulos = s.tulos();
        sk.setText("");
        tk.setText("" + laskunTulos);
        if (laskunTulos == 0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
        undo.disableProperty().set(false);
    }

    @Override
    public void peru() {
        this.s.plus(edellinen);
        int laskunTulos = s.tulos();
        sk.setText("");
        tk.setText("" + laskunTulos);
        if (laskunTulos == 0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
        undo.disableProperty().set(false);
    }
    
}
