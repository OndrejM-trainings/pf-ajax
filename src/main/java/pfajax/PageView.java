package pfajax;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PageView {

    private String pozdrav = "Ahoj";

    public String getPozdrav() {
        return pozdrav;
    }

    public void setPozdrav(String pozdrav) {
        this.pozdrav = pozdrav + "!";
    }

    public String getAkcia() {
        return "Odošli";
    }

}
