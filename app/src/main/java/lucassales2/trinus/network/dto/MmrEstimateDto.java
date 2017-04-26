package lucassales2.trinus.network.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lucas Sales on 20/04/2017.
 */

public class MmrEstimateDto {
    @SerializedName("estimate")
    @Expose
    private Integer estimate;
    @SerializedName("stdDev")
    @Expose
    private Double stdDev;
    @SerializedName("n")
    @Expose
    private Integer n;

    public Integer getEstimate() {
        return estimate;
    }

    public Double getStdDev() {
        return stdDev;
    }

    public Integer getN() {
        return n;
    }

}
