package lucassales2.trinus.network.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchDto {

    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("avatarfull")
    @Expose
    private String avatarfull;
    @SerializedName("personaname")
    @Expose
    private String personaname;
    @SerializedName("similarity")
    @Expose
    private Float similarity;
    @SerializedName("last_match_time")
    @Expose
    private String lastMatchTime;

    public String getLastMatchTime() {
        return lastMatchTime;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public String getAvatarfull() {
        return avatarfull;
    }

    public String getPersonaname() {
        return personaname;
    }

    public Float getSimilarity() {
        return similarity;
    }


}