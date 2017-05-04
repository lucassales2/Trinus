package lucassales2.trinus.network.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Lucas Sales on 04/05/2017.
 */

public class Result {

    @SerializedName("items")
    @Expose
    private List<ItemDto> items = null;
    @SerializedName("status")
    @Expose
    private Integer status;

    public List<ItemDto> getItems() {
        return items;
    }

    public Integer getStatus() {
        return status;
    }
}
