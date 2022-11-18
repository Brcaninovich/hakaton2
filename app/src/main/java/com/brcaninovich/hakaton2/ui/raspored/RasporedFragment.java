package com.brcaninovich.hakaton2.ui.raspored;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.brcaninovich.hakaton2.databinding.FragmentHomeBinding;
import com.brcaninovich.hakaton2.databinding.FragmentRasporedBinding;
import com.brcaninovich.hakaton2.ui.home.HomeViewModel;

public class RasporedFragment extends Fragment {

private FragmentRasporedBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        RasporedViewModel rasporedViewModel =
                new ViewModelProvider(this).get(RasporedViewModel.class);

    binding = FragmentRasporedBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        //final TextView textView = binding.textHome;
        binding.Ponedjeljak.setText("Ponedjeljak:");
        //rasporedViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}