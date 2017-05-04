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
    private Map<String, Integer> purchaseTime;
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

    public Long getMatchId() {
        return matchId;
    }

    public Integer getPlayerSlot() {
        return playerSlot;
    }

    public List<Integer> getAbilityUpgradesArr() {
        return abilityUpgradesArr;
    }

    public Map<String, Integer> getAbilityUses() {
        return abilityUses;
    }

    public Long getAccountId() {
        return accountId;
    }

    public Map<Integer, Integer> getActions() {
        return actions;
    }

    public AdditionalUnits getAdditionalUnits() {
        return additionalUnits;
    }

    public Integer getAssists() {
        return assists;
    }

    public Integer getBackpack0() {
        return backpack0;
    }

    public Integer getBackpack1() {
        return backpack1;
    }

    public Integer getBackpack2() {
        return backpack2;
    }

    public List<BuyBackLog> getBuybackLog() {
        return buybackLog;
    }

    public Integer getCampsStacked() {
        return campsStacked;
    }

    public Integer getCreepsStacked() {
        return creepsStacked;
    }

    public Map<String, Integer> getDamage() {
        return damage;
    }

    public Map<String, Integer> getDamageInflictor() {
        return damageInflictor;
    }

    public Map<String, Integer> getDamageInflictorReceived() {
        return damageInflictorReceived;
    }

    public Map<String, Integer> getDamageTaken() {
        return damageTaken;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public Integer getDenies() {
        return denies;
    }

    public List<Object> getDnT() {
        return dnT;
    }

    public Integer getGold() {
        return gold;
    }

    public Integer getGoldPerMin() {
        return goldPerMin;
    }

    public GoldReasons getGoldReasons() {
        return goldReasons;
    }

    public Integer getGoldSpent() {
        return goldSpent;
    }

    public List<Object> getGoldT() {
        return goldT;
    }

    public Integer getHeroDamage() {
        return heroDamage;
    }

    public Integer getHeroHealing() {
        return heroHealing;
    }

    public HeroHits getHeroHits() {
        return heroHits;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public Integer getItem0() {
        return item0;
    }

    public Integer getItem1() {
        return item1;
    }

    public Integer getItem2() {
        return item2;
    }

    public Integer getItem3() {
        return item3;
    }

    public Integer getItem4() {
        return item4;
    }

    public Integer getItem5() {
        return item5;
    }

    public ItemUses getItemUses() {
        return itemUses;
    }

    public KillStreaks getKillStreaks() {
        return killStreaks;
    }

    public Map<String, Integer> getKilled() {
        return killed;
    }

    public Map<String, Integer> getKilledBy() {
        return killedBy;
    }

    public Integer getKills() {
        return kills;
    }

    public List<KillLog> getKillsLog() {
        return killsLog;
    }

    public Map<Integer, Map<Integer, Integer>> getLanePos() {
        return lanePos;
    }

    public Integer getLastHits() {
        return lastHits;
    }

    public Integer getLeaverStatus() {
        return leaverStatus;
    }

    public Integer getLevel() {
        return level;
    }

    public List<Object> getLhT() {
        return lhT;
    }

    public LifeState getLifeState() {
        return lifeState;
    }

    public MaxHeroHit getMaxHeroHit() {
        return maxHeroHit;
    }

    public MultiKills getMultiKills() {
        return multiKills;
    }

    public Obs getObs() {
        return obs;
    }

    public List<Object> getObsLeftLog() {
        return obsLeftLog;
    }

    public List<Object> getObsLog() {
        return obsLog;
    }

    public Integer getObsPlaced() {
        return obsPlaced;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public List<Object> getPermanentBuffs() {
        return permanentBuffs;
    }

    public Integer getPings() {
        return pings;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public List<Object> getPurchaseLog() {
        return purchaseLog;
    }

    public Integer getRunePickups() {
        return runePickups;
    }

    public Runes getRunes() {
        return runes;
    }

    public List<Object> getRunesLog() {
        return runesLog;
    }

    public Sen getSen() {
        return sen;
    }

    public List<Object> getSenLeftLog() {
        return senLeftLog;
    }

    public List<Object> getSenLog() {
        return senLog;
    }

    public Integer getSenPlaced() {
        return senPlaced;
    }

    public Double getStuns() {
        return stuns;
    }

    public List<Object> getTimes() {
        return times;
    }

    public Integer getTowerDamage() {
        return towerDamage;
    }

    public Integer getXpPerMin() {
        return xpPerMin;
    }

    public XpReasons getXpReasons() {
        return xpReasons;
    }

    public List<Object> getXpT() {
        return xpT;
    }

    public String getPersonaname() {
        return personaname;
    }

    public String getName() {
        return name;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public Boolean getRadiantWin() {
        return radiantWin;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getCluster() {
        return cluster;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public Integer getGameMode() {
        return gameMode;
    }

    public Integer getPatch() {
        return patch;
    }

    public Integer getRegion() {
        return region;
    }

    public Boolean getRadiant() {
        return isRadiant;
    }

    public Integer getWin() {
        return win;
    }

    public Integer getLose() {
        return lose;
    }

    public Integer getTotalGold() {
        return totalGold;
    }

    public Integer getTotalXp() {
        return totalXp;
    }

    public Double getKillsPerMin() {
        return killsPerMin;
    }

    public Integer getKda() {
        return kda;
    }

    public Integer getAbandons() {
        return abandons;
    }

    public Integer getNeutralKills() {
        return neutralKills;
    }

    public Integer getTowerKills() {
        return towerKills;
    }

    public Integer getCourierKills() {
        return courierKills;
    }

    public Integer getLaneKills() {
        return laneKills;
    }

    public Integer getHeroKills() {
        return heroKills;
    }

    public Integer getObserverKills() {
        return observerKills;
    }

    public Integer getSentryKills() {
        return sentryKills;
    }

    public Integer getRoshanKills() {
        return roshanKills;
    }

    public Integer getNecronomiconKills() {
        return necronomiconKills;
    }

    public Integer getAncientKills() {
        return ancientKills;
    }

    public Integer getBuybackCount() {
        return buybackCount;
    }

    public Integer getObserverUses() {
        return observerUses;
    }

    public Integer getSentryUses() {
        return sentryUses;
    }

    public Double getLaneEfficiency() {
        return laneEfficiency;
    }

    public Double getLaneEfficiencyPct() {
        return laneEfficiencyPct;
    }

    public Integer getLane() {
        return lane;
    }

    public Integer getLaneRole() {
        return laneRole;
    }

    public Boolean getRoaming() {
        return isRoaming;
    }

    public Map<String, Integer> getPurchaseTime() {
        return purchaseTime;
    }

    public Item getFirstPurchaseTime() {
        return firstPurchaseTime;
    }

    public Item getItemWin() {
        return itemWin;
    }

    public Item getItemUsage() {
        return itemUsage;
    }

    public Integer getPurchaseTpscroll() {
        return purchaseTpscroll;
    }

    public Integer getActionsPerMin() {
        return actionsPerMin;
    }

    public Integer getLifeStateDead() {
        return lifeStateDead;
    }

    public String getSoloCompetitiveRank() {
        return soloCompetitiveRank;
    }

    public List<Object> getCosmetics() {
        return cosmetics;
    }

    public Map<String, Benchmarks> getBenchmarks() {
        return benchmarks;
    }


}
