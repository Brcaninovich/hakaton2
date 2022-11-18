package com.brcaninovich.hakaton2.ui.izostanci;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.brcaninovich.hakaton2.databinding.FragmentIzostanciBinding;
import com.brcaninovich.hakaton2.databinding.FragmentRasporedBinding;
import com.brcaninovich.hakaton2.ui.raspored.RasporedViewModel;

public class IzostanciFragment extends Fragment {

private FragmentIzostanciBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        IzostanciViewModel izostanciViewModel =
                new ViewModelProvider(this).get(IzostanciViewModel.class);

    binding = FragmentIzostanciBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textHome;
        izostanciViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}