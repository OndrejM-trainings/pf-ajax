package pfajax;

import java.util.*;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PageView {

    private String pozdrav = "Ahoj";
    private List<String> pozdravy = new ArrayList<>();

    public String getPozdrav() {
        return pozdrav;
    }

    public void setPozdrav(String pozdrav) {
        this.pozdrav = pozdrav;
    }
    
    public void pridajVykricnik() {
        pozdrav += "?";
//        return "index.xhtml";
    }

    public void pridajX() {
        pozdrav += "x";
//        return "index.xhtml";
    }

    public String getAkcia() {
        return "Odošli";
    }

    public List<String> getPozdravy() {
        return pozdravy;
    }

    public void setPozdravy(List<String> pozdravy) {
        this.pozdravy = pozdravy;
    }
    
    public List<String> moznosti(String value) {
        return Arrays.asList("1", "2", "3", value);
    }

}
