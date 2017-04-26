
package lucassales2.trinus.network.dto.match;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("tpscroll")
    @Expose
    private Long tpscroll;
    @SerializedName("quelling_blade")
    @Expose
    private Long quellingBlade;
    @SerializedName("boots")
    @Expose
    private Long boots;
    @SerializedName("ring_of_protection")
    @Expose
    private Long ringOfProtection;
    @SerializedName("flask")
    @Expose
    private Long flask;
    @SerializedName("iron_talon")
    @Expose
    private Long ironTalon;
    @SerializedName("magic_stick")
    @Expose
    private Long magicStick;
    @SerializedName("infused_raindrop")
    @Expose
    private Long infusedRaindrop;
    @SerializedName("blades_of_attack")
    @Expose
    private Long bladesOfAttack;
    @SerializedName("phase_boots")
    @Expose
    private Long phaseBoots;
    @SerializedName("blink")
    @Expose
    private Long blink;
    @SerializedName("chainmail")
    @Expose
    private Long chainmail;

    public Long getTpscroll() {
        return tpscroll;
    }

    public void setTpscroll(Long tpscroll) {
        this.tpscroll = tpscroll;
    }

    public Long getQuellingBlade() {
        return quellingBlade;
    }

    public void setQuellingBlade(Long quellingBlade) {
        this.quellingBlade = quellingBlade;
    }

    public Long getBoots() {
        return boots;
    }

    public void setBoots(Long boots) {
        this.boots = boots;
    }

    public Long getRingOfProtection() {
        return ringOfProtection;
    }

    public void setRingOfProtection(Long ringOfProtection) {
        this.ringOfProtection = ringOfProtection;
    }

    public Long getFlask() {
        return flask;
    }

    public void setFlask(Long flask) {
        this.flask = flask;
    }

    public Long getIronTalon() {
        return ironTalon;
    }

    public void setIronTalon(Long ironTalon) {
        this.ironTalon = ironTalon;
    }

    public Long getMagicStick() {
        return magicStick;
    }

    public void setMagicStick(Long magicStick) {
        this.magicStick = magicStick;
    }

    public Long getInfusedRaindrop() {
        return infusedRaindrop;
    }

    public void setInfusedRaindrop(Long infusedRaindrop) {
        this.infusedRaindrop = infusedRaindrop;
    }

    public Long getBladesOfAttack() {
        return bladesOfAttack;
    }

    public void setBladesOfAttack(Long bladesOfAttack) {
        this.bladesOfAttack = bladesOfAttack;
    }

    public Long getPhaseBoots() {
        return phaseBoots;
    }

    public void setPhaseBoots(Long phaseBoots) {
        this.phaseBoots = phaseBoots;
    }

    public Long getBlink() {
        return blink;
    }

    public void setBlink(Long blink) {
        this.blink = blink;
    }

    public Long getChainmail() {
        return chainmail;
    }

    public void setChainmail(Long chainmail) {
        this.chainmail = chainmail;
    }

}
