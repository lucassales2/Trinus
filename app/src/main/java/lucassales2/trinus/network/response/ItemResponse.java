package lucassales2.trinus.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lucassales2.trinus.network.dto.Result;

/**
 * Created by Lucas Sales on 04/05/2017.
 */

public class ItemResponse {


    @SerializedName("result")
    @Expose
    private Result result;

    public Result getResult() {
        return result;
    }


}
