package lucassales2.trinus.network.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Lucas Sales on 27/04/2017.
 */

public class HeroDto {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("localized_name")
    @Expose
    private String localizedName;
    @SerializedName("primary_attr")
    @Expose
    private String primaryAttr;
    @SerializedName("attack_type")
    @Expose
    private String attackType;
    @SerializedName("roles")
    @Expose
    private List<String> roles = null;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getPrimaryAttr() {
        return primaryAttr;
    }

    public String getAttackType() {
        return attackType;
    }

    public List<String> getRoles() {
        return roles;
    }
}
