package lucassales2.trinus.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lucassales2.trinus.network.dto.MmrEstimateDto;
import lucassales2.trinus.network.dto.ProfileDto;

/**
 * Created by Lucas Sales on 20/04/2017.
 */

public class PlayerResponse {
    public String getTrackedUntil() {
        return trackedUntil;
    }

    public String getSoloCompetitiveRank() {
        return soloCompetitiveRank;
    }

    public String getCompetitiveRank() {
        return competitiveRank;
    }

    public MmrEstimateDto getMmrEstimate() {
        return mmrEstimate;
    }

    public ProfileDto getProfile() {
        return profile;
    }

    @SerializedName("tracked_until")
    @Expose
    private String trackedUntil;
    @SerializedName("solo_competitive_rank")
    @Expose
    private String soloCompetitiveRank;
    @SerializedName("competitive_rank")
    @Expose
    private String competitiveRank;
    @SerializedName("mmr_estimate")
    @Expose
    private MmrEstimateDto mmrEstimate;
    @SerializedName("profile")
    @Expose
    private ProfileDto profile;

}
