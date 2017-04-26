package lucassales2.trinus.network.dto.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class Player {

    @SerializedName("match_id")
    @Expose
    private Long matchId;
    @SerializedName("player_slot")
    @Expose
    private Integer playerSlot;
    @SerializedName("ability_upgrades_arr")
    @Expose
    private List<Integer> abilityUpgradesArr = null;
    @SerializedName("ability_uses")
    @Expose
    private Map<String, Integer> abilityUses;
    @SerializedName("account_id")
    @Expose
    private Long accountId;
    @SerializedName("actions")
    @Expose
    private Map<Integer, Integer> actions;
    @SerializedName("additional_units")
    @Expose
    private AdditionalUnits additionalUnits;
    @SerializedName("assists")
    @Expose
    private Integer assists;
    @SerializedName("backpack_0")
    @Expose
    private Integer backpack0;
    @SerializedName("backpack_1")
    @Expose
    private Integer backpack1;
    @SerializedName("backpack_2")
    @Expose
    private Integer backpack2;
    @SerializedName("buyback_log")
    @Expose
    private List<BuyBackLog> buybackLog = null;
    @SerializedName("camps_stacked")
    @Expose
    private Integer campsStacked;
    @SerializedName("creeps_stacked")
    @Expose
    private Integer creepsStacked;
    @SerializedName("damage")
    @Expose
    private Map<String, Integer> damage;
    @SerializedName("damage_inflictor")
    @Expose
    private Map<String, Integer> damageInflictor;
    @SerializedName("damage_inflictor_received")
    @Expose
    private Map<String, Integer> damageInflictorReceived;
    @SerializedName("damage_taken")
    @Expose
    private Map<String, Integer> damageTaken;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
    @SerializedName("denies")
    @Expose
    private Integer denies;
    @SerializedName("dn_t")
    @Expose
    private List<Object> dnT = null;
    @SerializedName("gold")
    @Expose
    private Integer gold;
    @SerializedName("gold_per_min")
    @Expose
    private Integer goldPerMin;
    @SerializedName("gold_reasons")
    @Expose
    private GoldReasons goldReasons;
    @SerializedName("gold_spent")
    @Expose
    private Integer goldSpent;
    @SerializedName("gold_t")
    @Expose
    private List<Object> goldT = null;
    @SerializedName("hero_damage")
    @Expose
    private Integer heroDamage;
    @SerializedName("hero_healing")
    @Expose
    private Integer heroHealing;
    @SerializedName("hero_hits")
    @Expose
    private HeroHits heroHits;
    @SerializedName("hero_id")
    @Expose
    private Integer heroId;
    @SerializedName("item_0")
    @Expose
    private Integer item0;
    @SerializedName("item_1")
    @Expose
    private Integer item1;
    @SerializedName("item_2")
    @Expose
    private Integer item2;
    @SerializedName("item_3")
    @Expose
    private Integer item3;
    @SerializedName("item_4")
    @Expose
    private Integer item4;
    @SerializedName("item_5")
    @Expose
    private Integer item5;
    @SerializedName("item_uses")
    @Expose
    private ItemUses itemUses;
    @SerializedName("kill_streaks")
    @Expose
    private KillStreaks killStreaks;
    @SerializedName("killed")
    @Expose
    private Map<String, Integer> killed;
    @SerializedName("killed_by")
    @Expose
    private Map<String, Integer> killedBy;
    @SerializedName("kills")
    @Expose
    private Integer kills;
    @SerializedName("kills_log")
    @Expose
    private List<KillLog> killsLog = null;
    @SerializedName("lane_pos")
    @Expose
    private Map<Integer, Map<Integer, Integer>> lanePos;
    @SerializedName("last_hits")
    @Expose
    private Integer lastHits;
    @SerializedName("leaver_status")
    @Expose
    private Integer leaverStatus;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("lh_t")
    @Expose
    private List<Object> lhT = null;
    @SerializedName("life_state")
    @Expose
    private LifeState lifeState;
    @SerializedName("max_hero_hit")
    @Expose
    private MaxHeroHit maxHeroHit;
    @SerializedName("multi_kills")
    @Expose
    private MultiKills multiKills;
    @SerializedName("obs")
    @Expose
    private Obs obs;
    @SerializedName("obs_left_log")
    @Expose
    private List<Object> obsLeftLog = null;
    @SerializedName("obs_log")
    @Expose
    private List<Object> obsLog = null;
    @SerializedName("obs_placed")
    @Expose
    private Integer obsPlaced;
    @SerializedName("party_id")
    @Expose
    private Integer partyId;
    @SerializedName("permanent_buffs")
    @Expose
    private List<Object> permanentBuffs = null;
    @SerializedName("pings")
    @Expose
    private Integer pings;
    @SerializedName("purchase")
    @Expose
    private Purchase purchase;
    @SerializedName("purchase_log")
    @Expose
    private List<Object> purchaseLog = null;
    @SerializedName("rune_pickups")
    @Expose
    private Integer runePickups;
    @SerializedName("runes")
    @Expose
    private Runes runes;
    @SerializedName("runes_log")
    @Expose
    private List<Object> runesLog = null;
    @SerializedName("sen")
    @Expose
    private Sen sen;
    @SerializedName("sen_left_log")
    @Expose
    private List<Object> senLeftLog = null;
    @SerializedName("sen_log")
    @Expose
    private List<Object> senLog = null;
    @SerializedName("sen_placed")
    @Expose
    private Integer senPlaced;
    @SerializedName("stuns")
    @Expose
    private Double stuns;
    @SerializedName("times")
    @Expose
    private List<Object> times = null;
    @SerializedName("tower_damage")
    @Expose
    private Integer towerDamage;
    @SerializedName("xp_per_min")
    @Expose
    private Integer xpPerMin;
    @SerializedName("xp_reasons")
    @Expose
    private XpReasons xpReasons;
    @SerializedName("xp_t")
    @Expose
    private List<Object> xpT = null;
    @SerializedName("personaname")
    @Expose
    private String personaname;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("radiant_win")
    @Expose
    private Boolean radiantWin;
    @SerializedName("start_time")
    @Expose
    private Integer startTime;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("cluster")
    @Expose
    private Integer cluster;
    @SerializedName("lobby_type")
    @Expose
    private Integer lobbyType;
    @SerializedName("game_mode")
    @Expose
    private Integer gameMode;
    @SerializedName("patch")
    @Expose
    private Integer patch;
    @SerializedName("region")
    @Expose
    private Integer region;
    @SerializedName("isRadiant")
    @Expose
    private Boolean isRadiant;
    @SerializedName("win")
    @Expose
    private Integer win;
    @SerializedName("lose")
    @Expose
    private Integer lose;
    @SerializedName("total_gold")
    @Expose
    private Integer totalGold;
    @SerializedName("total_xp")
    @Expose
    private Integer totalXp;
    @SerializedName("kills_per_min")
    @Expose
    private Double killsPerMin;
    @SerializedName("kda")
    @Expose
    private Integer kda;
    @SerializedName("abandons")
    @Expose
    private Integer abandons;
    @SerializedName("neutral_kills")
    @Expose
    private Integer neutralKills;
    @SerializedName("tower_kills")
    @Expose
    private Integer towerKills;
    @SerializedName("courier_kills")
    @Expose
    private Integer courierKills;
    @SerializedName("lane_kills")
    @Expose
    private Integer laneKills;
    @SerializedName("hero_kills")
    @Expose
    private Integer heroKills;
    @SerializedName("observer_kills")
    @Expose
    private Integer observerKills;
    @SerializedName("sentry_kills")
    @Expose
    private Integer sentryKills;
    @SerializedName("roshan_kills")
    @Expose
    private Integer roshanKills;
    @SerializedName("necronomicon_kills")
    @Expose
    private Integer necronomiconKills;
    @SerializedName("ancient_kills")
    @Expose
    private Integer ancientKills;
    @SerializedName("buyback_count")
    @Expose
    private Integer buybackCount;
    @SerializedName("observer_uses")
    @Expose
    private Integer observerUses;
    @SerializedName("sentry_uses")
    @Expose
    private Integer sentryUses;
    @SerializedName("lane_efficiency")
    @Expose
    private Double laneEfficiency;
    @SerializedName("lane_efficiency_pct")
    @Expose
    private Double laneEfficiencyPct;
    @SerializedName("lane")
    @Expose
    private Integer lane;
    @SerializedName("lane_role")
    @Expose
    private Integer laneRole;
    @SerializedName("is_roaming")
    @Expose
    private Boolean isRoaming;
    @SerializedName("purchase_time")
    @Expose
    private PurchaseTime purchaseTime;
    @SerializedName("first_purchase_time")
    @Expose
    private Item firstPurchaseTime;
    @SerializedName("item_win")
    @Expose
    private Item itemWin;
    @SerializedName("item_usage")
    @Expose
    private Item itemUsage;
    @SerializedName("purchase_tpscroll")
    @Expose
    private Integer purchaseTpscroll;
    @SerializedName("actions_per_min")
    @Expose
    private Integer actionsPerMin;
    @SerializedName("life_state_dead")
    @Expose
    private Integer lifeStateDead;
    @SerializedName("solo_competitive_rank")
    @Expose
    private String soloCompetitiveRank;
    @SerializedName("cosmetics")
    @Expose
    private List<Object> cosmetics = null;
    @SerializedName("benchmarks")
    @Expose
    private Map<String, Benchmarks> benchmarks;


}
