package lucassales2.trinus.ui.match;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import lucassales2.trinus.R;
import lucassales2.trinus.network.dto.HeroDto;
import lucassales2.trinus.network.dto.ItemDto;
import lucassales2.trinus.network.dto.match.MatchDetailDto;
import lucassales2.trinus.network.dto.match.Player;

/**
 * Created by Lucas Sales on 04/05/2017.
 */

public class MatchScoreAdapter extends RecyclerView.Adapter {

    private static final String itemUrl = "http://cdn.dota2.com/apps/dota2/images/items/%s_lg.png";
    private static final String IMG_REPO_URL = "http://cdn.dota2.com/apps/dota2/images/heroes/%s_lg.png";
    private static final int TEAM = 0;
    private static final int ROW = 1;

    private final MatchDetailDto matchDetailDto;
    private final SparseArray<ItemDto> itemDtoSparseArray;
    private final SparseArray<HeroDto> heroDtoSparseArray;

    public MatchScoreAdapter(MatchDetailDto matchDetailDto, SparseArray<ItemDto> itemDtoSparseArray, SparseArray<HeroDto> heroDtoSparseArray) {
        this.matchDetailDto = matchDetailDto;
        this.itemDtoSparseArray = itemDtoSparseArray;
        this.heroDtoSparseArray = heroDtoSparseArray;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == ROW) {
            View view = inflater.inflate(R.layout.item_match_detail, parent, false);
            return new ViewHolder(view);
        } else {
            View view = inflater.inflate(R.layout.team_header, parent, false);
            return new TeamViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == TEAM) {
            onBindTeamViewHolder((TeamViewHolder) holder, position);
        } else {
            if (position < 6)
                onBindRowViewHolder((ViewHolder) holder, position - 1);
            else
                onBindRowViewHolder((ViewHolder) holder, position - 2);
        }
    }

    private void onBindTeamViewHolder(TeamViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        if (position == 0) {
            holder.teamText.setText("Radiant - Overview");
            holder.teamImg.setImageResource(R.drawable.radiant);
            Bitmap myBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.radiant);
            Palette palette = Palette.from(myBitmap).generate();
            int defaultColor = ContextCompat.getColor(context, R.color.radiant_green);
            int color = palette.getDarkVibrantColor(defaultColor);
            holder.itemView.setBackgroundColor(color);
        } else {
            holder.teamText.setText("Dire - Overview");
            holder.teamImg.setImageResource(R.drawable.dire);
            Bitmap myBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.dire);
            Palette palette = Palette.from(myBitmap).generate();
            int defaultColor = ContextCompat.getColor(context, R.color.dire_red);
            int color = palette.getLightMutedColor(defaultColor);
            holder.itemView.setBackgroundColor(color);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0 || position == 6) {
            return TEAM;
        } else {
            return ROW;
        }
    }

    private void onBindRowViewHolder(ViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        Player player = matchDetailDto.getPlayers().get(position);
        if (position < 5) {
            holder.itemView.setBackgroundColor(ContextCompat.getColor(context, position % 2 == 0 ? R.color.radiant_green : R.color.colorPrimary));
        } else {
            holder.itemView.setBackgroundColor(ContextCompat.getColor(context, position % 2 == 0 ? R.color.dire_red : R.color.colorPrimary));
        }
        holder.heroLevel.setText(player.getLevel().toString());
        holder.playerKills.setText(player.getKills().toString() + "/");
        holder.playerDeaths.setText(player.getDeaths().toString() + "/");
        holder.playerAssists.setText(player.getAssists().toString());
        if (player.getSoloCompetitiveRank() != null && !player.getPersonaname().isEmpty()) {
            holder.playerMMR.setVisibility(View.VISIBLE);
            holder.playerMMR.setText(player.getSoloCompetitiveRank());
        } else {
            holder.playerMMR.setVisibility(View.GONE);
        }

        if (player.getName() != null) {
            holder.playerName.setText(player.getName());
        } else if (player.getPersonaname() != null) {
            holder.playerName.setText(player.getPersonaname());
        } else {
            holder.playerName.setText("Annonymous");
        }

        if (player.getItem0() != 0) {
            Glide.with(context).load(String.format(itemUrl, itemDtoSparseArray.get(player.getItem0()).getName().substring(5))).into(holder.itemSlot0);
        }
        if (player.getItem1() != 0) {
            Glide.with(context).load(String.format(itemUrl, itemDtoSparseArray.get(player.getItem1()).getName().substring(5))).into(holder.itemSlot1);
        }
        if (player.getItem2() != 0) {
            Glide.with(context).load(String.format(itemUrl, itemDtoSparseArray.get(player.getItem2()).getName().substring(5))).into(holder.itemSlot2);
        }
        if (player.getItem3() != 0) {
            Glide.with(context).load(String.format(itemUrl, itemDtoSparseArray.get(player.getItem3()).getName().substring(5))).into(holder.itemSlot3);
        }
        if (player.getItem4() != 0) {
            Glide.with(context).load(String.format(itemUrl, itemDtoSparseArray.get(player.getItem4()).getName().substring(5))).into(holder.itemSlot4);
        }
        if (player.getItem5() != 0) {
            Glide.with(context).load(String.format(itemUrl, itemDtoSparseArray.get(player.getItem5()).getName().substring(5))).into(holder.itemSlot5);
        }

        if (player.getBackpack0() != 0 || player.getBackpack1() != 0 || player.getBackpack2() != 0) {
            holder.imgBackpack.setVisibility(View.VISIBLE);
            if (player.getBackpack0() != 0) {
                Glide.with(context).load(String.format(itemUrl, itemDtoSparseArray.get(player.getBackpack0()).getName().substring(5))).into(holder.backPack0);
            }
            if (player.getBackpack1() != 0) {
                Glide.with(context).load(String.format(itemUrl, itemDtoSparseArray.get(player.getBackpack1()).getName().substring(5))).into(holder.backPack1);
            }

            if (player.getBackpack2() != 0) {
                Glide.with(context).load(String.format(itemUrl, itemDtoSparseArray.get(player.getBackpack2()).getName().substring(5))).into(holder.backPack2);
            }
        } else {
            holder.imgBackpack.setVisibility(View.GONE);
        }


        Glide.with(context).load(String.format(IMG_REPO_URL, heroDtoSparseArray.get(player.getHeroId()).getName().substring(14))).into(holder.imageViewHeroImage);


    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class TeamViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageView_team)
        ImageView teamImg;
        @BindView(R.id.textView)
        TextView teamText;

        public TeamViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageView_hero)
        ImageView imageViewHeroImage;
        @BindView(R.id.imageViewItemSlot0)
        ImageView itemSlot0;
        @BindView(R.id.imageViewItemSlot1)
        ImageView itemSlot1;
        @BindView(R.id.imageViewItemSlot2)
        ImageView itemSlot2;
        @BindView(R.id.imageViewItemSlot3)
        ImageView itemSlot3;
        @BindView(R.id.imageViewItemSlot4)
        ImageView itemSlot4;
        @BindView(R.id.imageViewItemSlot5)
        ImageView itemSlot5;
        @BindView(R.id.imageViewBackPack0)
        ImageView backPack0;
        @BindView(R.id.imageViewBackPack1)
        ImageView backPack1;
        @BindView(R.id.imageViewBackPack2)
        ImageView backPack2;

        @BindView(R.id.textViewHerolevel)
        TextView heroLevel;
        @BindView(R.id.textViewPlayerName)
        TextView playerName;
        @BindView(R.id.textViewKills)
        TextView playerKills;
        @BindView(R.id.textViewDeaths)
        TextView playerDeaths;
        @BindView(R.id.textViewAssists)
        TextView playerAssists;
        @BindView(R.id.textViewPlayerMMR)
        TextView playerMMR;
        @BindView(R.id.linearLayout_backpack)
        View imgBackpack;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
