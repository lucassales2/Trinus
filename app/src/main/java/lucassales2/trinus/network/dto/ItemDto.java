package lucassales2.trinus.network.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lucas Sales on 04/05/2017.
 */

public class ItemDto {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cost")
    @Expose
    private Integer cost;
    @SerializedName("secret_shop")
    @Expose
    private Integer secretShop;
    @SerializedName("side_shop")
    @Expose
    private Integer sideShop;
    @SerializedName("recipe")
    @Expose
    private Integer recipe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getSecretShop() {
        return secretShop;
    }

    public void setSecretShop(Integer secretShop) {
        this.secretShop = secretShop;
    }

    public Integer getSideShop() {
        return sideShop;
    }

    public void setSideShop(Integer sideShop) {
        this.sideShop = sideShop;
    }

    public Integer getRecipe() {
        return recipe;
    }

    public void setRecipe(Integer recipe) {
        this.recipe = recipe;
    }

}
