package lucassales2.trinus.network.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lucas Sales on 20/04/2017.
 */

public class ProfileDto {

    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("personaname")
    @Expose
    private String personaname;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cheese")
    @Expose
    private Integer cheese;
    @SerializedName("steamid")
    @Expose
    private String steamid;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("avatarmedium")
    @Expose
    private String avatarmedium;
    @SerializedName("avatarfull")
    @Expose
    private String avatarfull;
    @SerializedName("profileurl")
    @Expose
    private String profileurl;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("loccountrycode")
    @Expose
    private String loccountrycode;

    public Integer getAccountId() {
        return accountId;
    }

    public String getPersonaname() {
        return personaname;
    }

    public String getName() {
        return name;
    }

    public Integer getCheese() {
        return cheese;
    }

    public String getSteamid() {
        return steamid;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getAvatarmedium() {
        return avatarmedium;
    }

    public String getAvatarfull() {
        return avatarfull;
    }

    public String getProfileurl() {
        return profileurl;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public String getLoccountrycode() {
        return loccountrycode;
    }

}
