import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("Expedition")
    @Expose
    private List<Expedition> expedition = null;

    public List<Expedition> getExpedition() {
        return expedition;
    }

    public void setExpedition(List<Expedition> expedition) {
        this.expedition = expedition;
    }

}