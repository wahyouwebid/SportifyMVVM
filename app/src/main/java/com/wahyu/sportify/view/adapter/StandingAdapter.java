package com.wahyu.sportify.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.wahyu.sportify.model.standing.Standing;
import com.wahyu.sportify.viewmodel.standing.StandingViewModel;

import java.util.List;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class StandingAdapter extends RecyclerView.Adapter<StandingAdapter.GenericViewHolder> {

    private int layoutId;
    private List<Standing> standingList ;
    private StandingViewModel viewModel;

    public interface OnItemClickCallback {
        void onItemClicked(Standing standing);
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public StandingAdapter(@LayoutRes int layoutId, StandingViewModel viewModel) {
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

    public void setStandingAdapter(List<Standing> tables) {
        this.standingList = tables;
    }

    @Override
    public int getItemCount() {
        return standingList == null ? 0 : standingList.size();
    }

    class GenericViewHolder extends RecyclerView.ViewHolder {
        final ViewDataBinding binding;

        GenericViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(StandingViewModel viewModel, Integer position) {
            binding.setVariable(com.wahyu.sportify.BR.vmStanding, viewModel);
            binding.setVariable(com.wahyu.sportify.BR.standing, standingList.get(position));
            binding.executePendingBindings();
        }
    }
}