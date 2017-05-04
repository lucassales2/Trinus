package lucassales2.trinus.network.dto.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lucas Sales on 26/04/2017.
 */

public class MatchDto {
    @SerializedName("match_id")
    @Expose
    private Long matchId;
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

    public Long getMatchId() {
        return matchId;
    }

    public Integer getPlayerSlot() {
        return playerSlot;
    }

    public Boolean getRadiantWin() {
        return radiantWin;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getGameMode() {
        return gameMode;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Integer getVersion() {
        return version;
    }

    public Integer getKills() {
        return kills;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public Integer getAssists() {
        return assists;
    }

    public Integer getSkill() {
        return skill;
    }

    public Integer getXpPerMin() {
        return xpPerMin;
    }

    public Integer getGoldPerMin() {
        return goldPerMin;
    }

    public Integer getHeroDamage() {
        return heroDamage;
    }

    public Integer getTowerDamage() {
        return towerDamage;
    }

    public Integer getHeroHealing() {
        return heroHealing;
    }

    public Integer getLastHits() {
        return lastHits;
    }


}
