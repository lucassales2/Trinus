package lucassales2.trinus.network.dto.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lucas Sales on 26/04/2017.
 */

public class MatchDto {
    @SerializedName("match_id")
    @Expose
    private Integer matchId;
    @SerializedName("player_slot")
    @Expose
    private Integer playerSlot;
    @SerializedName("radiant_win")
    @Expose
    private Boolean radiantWin;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("game_mode")
    @Expose
    private Integer gameMode;
    @SerializedName("lobby_type")
    @Expose
    private Integer lobbyType;
    @SerializedName("hero_id")
    @Expose
    private Integer heroId;
    @SerializedName("start_time")
    @Expose
    private Integer startTime;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("kills")
    @Expose
    private Integer kills;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
    @SerializedName("assists")
    @Expose
    private Integer assists;
    @SerializedName("skill")
    @Expose
    private Integer skill;
    @SerializedName("xp_per_min")
    @Expose
    private Integer xpPerMin;
    @SerializedName("gold_per_min")
    @Expose
    private Integer goldPerMin;
    @SerializedName("hero_damage")
    @Expose
    private Integer heroDamage;
    @SerializedName("tower_damage")
    @Expose
    private Integer towerDamage;
    @SerializedName("hero_healing")
    @Expose
    private Integer heroHealing;
    @SerializedName("last_hits")
    @Expose
    private Integer lastHits;


}
