package lucassales2.trinus.network.dto.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class MatchDetailDto {

    @SerializedName("match_id")
    @Expose
    private Long matchId;
    @SerializedName("barracks_status_dire")
    @Expose
    private Integer barracksStatusDire;
    @SerializedName("barracks_status_radiant")
    @Expose
    private Integer barracksStatusRadiant;
    @SerializedName("chat")
    @Expose
    private List<Chat> chat;
    @SerializedName("cluster")
    @Expose
    private Integer cluster;
    @SerializedName("cosmetics")
    @Expose
    private Map<Integer, Integer> cosmetics;
    @SerializedName("dire_score")
    @Expose
    private Integer direScore;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("engine")
    @Expose
    private Integer engine;
    @SerializedName("first_blood_time")
    @Expose
    private Integer firstBloodTime;
    @SerializedName("game_mode")
    @Expose
    private Integer gameMode;
    @SerializedName("human_players")
    @Expose
    private Integer humanPlayers;
    @SerializedName("leagueid")
    @Expose
    private Integer leagueid;
    @SerializedName("lobby_type")
    @Expose
    private Integer lobbyType;
    @SerializedName("match_seq_num")
    @Expose
    private Long matchSeqNum;
    @SerializedName("negative_votes")
    @Expose
    private Integer negativeVotes;
    @SerializedName("objectives")
    @Expose
    private List<Objectives> objectives;
    @SerializedName("picks_bans")
    @Expose
    private List<PicksBans> picksBans;
    @SerializedName("positive_votes")
    @Expose
    private Integer positiveVotes;
    @SerializedName("radiant_gold_adv")
    @Expose
    private List<Integer> radiantGoldAdv;
    @SerializedName("radiant_score")
    @Expose
    private Integer radiantScore;
    @SerializedName("radiant_win")
    @Expose
    private Boolean radiantWin;
    @SerializedName("radiant_xp_adv")
    @Expose
    private List<Integer> radiantXpAdv;
    @SerializedName("start_time")
    @Expose
    private Integer startTime;
    @SerializedName("teamfights")
    @Expose
    private List<Teamfights> teamfights;
    @SerializedName("tower_status_dire")
    @Expose
    private Integer towerStatusDire;
    @SerializedName("tower_status_radiant")
    @Expose
    private Integer towerStatusRadiant;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("replay_salt")
    @Expose
    private Integer replaySalt;
    @SerializedName("series_id")
    @Expose
    private Integer seriesId;
    @SerializedName("series_type")
    @Expose
    private Integer seriesType;
    @SerializedName("radiant_team")
    @Expose
    private Team radiantTeam;
    @SerializedName("dire_team")
    @Expose
    private Team direTeam;
    @SerializedName("league")
    @Expose
    private League league;
    @SerializedName("skill")
    @Expose
    private Integer skill;
    @SerializedName("players")
    @Expose
    private List<Player> players = null;
    @SerializedName("patch")
    @Expose
    private Integer patch;
    @SerializedName("region")
    @Expose
    private Integer region;
    @SerializedName("all_word_counts")
    @Expose
    private Map<String, Integer> allWordCounts;
    @SerializedName("my_word_counts")
    @Expose
    private MyWordCounts myWordCounts;
    @SerializedName("throw")
    @Expose
    private Integer _throw;
    @SerializedName("loss")
    @Expose
    private Integer loss;
    @SerializedName("replay_url")
    @Expose
    private String replayUrl;

    public Long getMatchId() {
        return matchId;
    }

    public Integer getBarracksStatusDire() {
        return barracksStatusDire;
    }

    public Integer getBarracksStatusRadiant() {
        return barracksStatusRadiant;
    }

    public List<Chat> getChat() {
        return chat;
    }

    public Integer getCluster() {
        return cluster;
    }

    public Map<Integer, Integer> getCosmetics() {
        return cosmetics;
    }

    public Integer getDireScore() {
        return direScore;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getEngine() {
        return engine;
    }

    public Integer getFirstBloodTime() {
        return firstBloodTime;
    }

    public Integer getGameMode() {
        return gameMode;
    }

    public Integer getHumanPlayers() {
        return humanPlayers;
    }

    public Integer getLeagueid() {
        return leagueid;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public Long getMatchSeqNum() {
        return matchSeqNum;
    }

    public Integer getNegativeVotes() {
        return negativeVotes;
    }

    public List<Objectives> getObjectives() {
        return objectives;
    }

    public List<PicksBans> getPicksBans() {
        return picksBans;
    }

    public Integer getPositiveVotes() {
        return positiveVotes;
    }

    public List<Integer> getRadiantGoldAdv() {
        return radiantGoldAdv;
    }

    public Integer getRadiantScore() {
        return radiantScore;
    }

    public Boolean getRadiantWin() {
        return radiantWin;
    }

    public List<Integer> getRadiantXpAdv() {
        return radiantXpAdv;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public List<Teamfights> getTeamfights() {
        return teamfights;
    }

    public Integer getTowerStatusDire() {
        return towerStatusDire;
    }

    public Integer getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    public Integer getVersion() {
        return version;
    }

    public Integer getReplaySalt() {
        return replaySalt;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public Integer getSeriesType() {
        return seriesType;
    }

    public Team getRadiantTeam() {
        return radiantTeam;
    }

    public Team getDireTeam() {
        return direTeam;
    }

    public League getLeague() {
        return league;
    }

    public Integer getSkill() {
        return skill;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Integer getPatch() {
        return patch;
    }

    public Integer getRegion() {
        return region;
    }

    public Map<String, Integer> getAllWordCounts() {
        return allWordCounts;
    }

    public MyWordCounts getMyWordCounts() {
        return myWordCounts;
    }

    public Integer get_throw() {
        return _throw;
    }

    public Integer getLoss() {
        return loss;
    }

    public String getReplayUrl() {
        return replayUrl;
    }


}
