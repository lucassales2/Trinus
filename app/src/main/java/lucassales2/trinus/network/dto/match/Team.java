
package lucassales2.trinus.network.dto.match;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {


    @SerializedName("team_id")
    @Expose
    private Long teamId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tag")
    @Expose
    private String tag;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
