package com.brcaninovich.hakaton2.ui.komentar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.brcaninovich.hakaton2.UserDataFetch;
import com.brcaninovich.hakaton2.databinding.FragmentIzostanciBinding;
import com.brcaninovich.hakaton2.databinding.FragmentKomentarBinding;

public class komentarFragment extends Fragment {

private FragmentKomentarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                        ViewGroup container, Bundle savedInstanceState) {
                        komentarViewModel komentarViewModel =
                        new ViewModelProvider(this).get(komentarViewModel.class);

    binding = FragmentKomentarBinding.inflate(inflater, container, false);
    View root = binding.getRoot();



        //final TextView textView = binding.textHome;
        //izostanciViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}