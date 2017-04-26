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


}
