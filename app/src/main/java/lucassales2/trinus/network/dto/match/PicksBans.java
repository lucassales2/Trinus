
package lucassales2.trinus.network.dto.match;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PicksBans {


    @SerializedName("is_pick")
    @Expose
    private Boolean isPick;
    @SerializedName("hero_id")
    @Expose
    private Long heroId;
    @SerializedName("team")
    @Expose
    private Long team;
    @SerializedName("order")
    @Expose
    private Long order;
    @SerializedName("ord")
    @Expose
    private Long ord;
    @SerializedName("match_id")
    @Expose
    private Long matchId;

    public Boolean getIsPick() {
        return isPick;
    }

    public void setIsPick(Boolean isPick) {
        this.isPick = isPick;
    }

    public Long getHeroId() {
        return heroId;
    }

    public void setHeroId(Long heroId) {
        this.heroId = heroId;
    }

    public Long getTeam() {
        return team;
    }

    public void setTeam(Long team) {
        this.team = team;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Long getOrd() {
        return ord;
    }

    public void setOrd(Long ord) {
        this.ord = ord;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }
}
