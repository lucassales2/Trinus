package lucassales2.trinus.network.dto.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lucas Sales on 25/04/2017.
 */

public class BuyBackLog {

    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("slot")
    @Expose
    private Long slot;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("player_slot")
    @Expose
    private Long playerSlot;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getSlot() {
        return slot;
    }

    public void setSlot(Long slot) {
        this.slot = slot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(Long playerSlot) {
        this.playerSlot = playerSlot;
    }
}
