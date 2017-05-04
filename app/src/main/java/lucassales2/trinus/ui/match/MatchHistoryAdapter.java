package lucassales2.trinus.ui.match;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import lucassales2.trinus.R;
import lucassales2.trinus.network.dto.HeroDto;
import lucassales2.trinus.network.dto.match.MatchDto;

/**
 * Created by Lucas Sales on 27/04/2017.
 */

public class MatchHistoryAdapter extends RecyclerView.Adapter<MatchHistoryAdapter.ViewHolder> {

    private static final String IMG_REPO_URL = "http://cdn.dota2.com/apps/dota2/images/heroes/";
    private final SparseArray<HeroDto> heroDtoList;
    private List<MatchDto> list;


    public MatchHistoryAdapter(List<MatchDto> list, SparseArray<HeroDto> heroDtoList) {
        this.list = list;
        this.heroDtoList = heroDtoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_match, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.colorPrimaryLight));
        } else {
            holder.itemView.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.colorPrimary));
        }
        MatchDto matchDto = list.get(position);
        HeroDto heroDto = heroDtoList.get(matchDto.getHeroId());
        Glide.with(holder.itemView.getContext()).load(getHeroImageUrl(matchDto.getHeroId())).into(holder.imageView);
        holder.textViewHeroName.setText(heroDto.getLocalizedName());
        boolean isRadiant = matchDto.getPlayerSlot() < 6;
        if (isRadiant && matchDto.getRadiantWin() || !isRadiant && !matchDto.getRadiantWin()) {
            holder.textViewResult.setText("Win");
            holder.textViewResult.setTextColor(Color.GREEN);
        } else {
            holder.textViewResult.setText("Loss");
            holder.textViewResult.setTextColor(Color.RED);
        }
        holder.textViewDeaths.setText(String.valueOf(matchDto.getDeaths()));
        holder.textViewKills.setText(String.valueOf(matchDto.getKills()));
        holder.textViewAssists.setText(String.valueOf(matchDto.getAssists()));
    }

    private String getHeroImageUrl(int id) {
        return IMG_REPO_URL + heroDtoList.get(id).getName().substring(14) + "_lg.png";
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView textViewHeroName;
        final TextView textViewSkillLevel;
        final TextView textViewResult;
        final TextView textViewTime;
        final TextView textViewKills;
        final TextView textViewDeaths;
        final TextView textViewAssists;


        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textViewHeroName = (TextView) itemView.findViewById(R.id.textView_heroname);
            textViewSkillLevel = (TextView) itemView.findViewById(R.id.textViewSkillLevel);
            textViewResult = (TextView) itemView.findViewById(R.id.textViewResult);
            textViewTime = (TextView) itemView.findViewById(R.id.textViewTime);
            textViewKills = (TextView) itemView.findViewById(R.id.textViewKills);
            textViewDeaths = (TextView) itemView.findViewById(R.id.textViewDeaths);
            textViewAssists = (TextView) itemView.findViewById(R.id.textViewAssists);
        }
    }
}
