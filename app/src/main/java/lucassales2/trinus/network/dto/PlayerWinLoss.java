package lucassales2.trinus.network.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lucas Sales on 26/04/2017.
 */

public class PlayerWinLoss {

    @SerializedName("win")
    @Expose
    private Integer win;
    @SerializedName("lose")
    @Expose
    private Integer lose;

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getLose() {
        return lose;
    }

    public void setLose(Integer lose) {
        this.lose = lose;
    }
}
