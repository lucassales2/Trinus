package lucassales2.trinus.ui.search;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import lucassales2.trinus.R;
import lucassales2.trinus.network.dto.SearchDto;

/**
 * Created by Lucas Sales on 26/04/2017.
 */

public class SearchPlayerResultAdapter extends RecyclerView.Adapter<SearchPlayerResultAdapter.ViewHolder> {

    private final List<SearchDto> list;

    public SearchPlayerResultAdapter(List<SearchDto> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_result, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        SearchDto searchDto = list.get(position);
        holder.textViewLastMatch.setText(String.valueOf(searchDto.getAccountId()));
        holder.textViewName.setText(searchDto.getPersonaname());
        Glide.with(holder.itemView.getContext()).load(searchDto.getAvatarfull()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewName;
        TextView textViewLastMatch;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView_playerAvatar);
            textViewName = (TextView) itemView.findViewById(R.id.textView_search_playername);
            textViewLastMatch = (TextView) itemView.findViewById(R.id.textView_search_lastmatch);
        }
    }
}
