package com.wahyu.sportify.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.wahyu.sportify.BR;
import com.wahyu.sportify.model.team.Team;
import com.wahyu.sportify.viewmodel.home.HomeViewModel;

import java.util.List;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.GenericViewHolder> {

    private int layoutId;
    private List<Team> teamList ;
    private HomeViewModel viewModel;

    public interface OnItemClickCallback {
        void onItemClicked(Team team);
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public TeamAdapter(@LayoutRes int layoutId, HomeViewModel viewModel) {
        this.layoutId = layoutId;
        this.viewModel = viewModel;
    }

    public GenericViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, viewType, parent, false);

        return new GenericViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull GenericViewHolder holder, int position) {
        holder.bind(viewModel, position);
    }

    @Override
    public int getItemViewType(int position) {
        return getLayoutIdForPosition(position);
    }

    private int getLayoutIdForPosition(int position) {
        return layoutId;
    }

    public void setUpcoming(List<Team> teams) {
        this.teamList = teams;
    }

    @Override
    public int getItemCount() {
        return teamList == null ? 0 : teamList.size();
    }

    class GenericViewHolder extends RecyclerView.ViewHolder {
        final ViewDataBinding binding;

        GenericViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(HomeViewModel viewModel, Integer position) {
            binding.setVariable(com.wahyu.sportify.BR.vmHomeTeam, viewModel);
            binding.setVariable(com.wahyu.sportify.BR.team, teamList.get(position));
            binding.executePendingBindings();
        }
    }
}