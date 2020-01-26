package com.wahyu.sportify.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.wahyu.sportify.BR;
import com.wahyu.sportify.model.upcoming.Fixture;
import com.wahyu.sportify.viewmodel.upcoming.UpcomingViewModel;

import java.util.List;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.GenericViewHolder> {

    private int layoutId;
    private List<Fixture> fixtureList ;
    private UpcomingViewModel viewModel;

    public interface OnItemClickCallback {
        void onItemClicked(Fixture fixture);
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public UpcomingAdapter(@LayoutRes int layoutId, UpcomingViewModel viewModel) {
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

    public void setUpcoming(List<Fixture> tables) {
        this.fixtureList = tables;
    }

    @Override
    public int getItemCount() {
        return fixtureList == null ? 0 : fixtureList.size();
    }

    class GenericViewHolder extends RecyclerView.ViewHolder {
        final ViewDataBinding binding;

        GenericViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(UpcomingViewModel viewModel, Integer position) {
            binding.setVariable(com.wahyu.sportify.BR.vmUpcoming, viewModel);
            binding.setVariable(com.wahyu.sportify.BR.fixture, fixtureList.get(position));
            binding.executePendingBindings();
        }
    }
}