package lucassales2.trinus.network.dto.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lucas Sales on 25/04/2017.
 */

public class KillLog {

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("key")
    @Expose
    private String key;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
