package com.wahyu.sportify.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.wahyu.sportify.model.topscorers.Topscorer;
import com.wahyu.sportify.viewmodel.topscorers.TopScorersViewModel;

import java.util.List;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class TopScorersAdapter extends RecyclerView.Adapter<TopScorersAdapter.GenericViewHolder> {

    private int layoutId;
    private List<Topscorer> topscorerList ;
    private TopScorersViewModel viewModel;

    public interface OnItemClickCallback {
        void onItemClicked(Topscorer topscorer);
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public TopScorersAdapter(@LayoutRes int layoutId, TopScorersViewModel viewModel) {
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

    public void setTopscorers(List<Topscorer> topscorers) {
        this.topscorerList = topscorers;
    }

    @Override
    public int getItemCount() {
        return topscorerList == null ? 0 : topscorerList.size();
    }

    class GenericViewHolder extends RecyclerView.ViewHolder {
        final ViewDataBinding binding;

        GenericViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(TopScorersViewModel viewModel, Integer position) {
            binding.setVariable(com.wahyu.sportify.BR.vmTopScorer, viewModel);
            binding.setVariable(com.wahyu.sportify.BR.topscorers, topscorerList.get(position));
            binding.executePendingBindings();
        }
    }
}