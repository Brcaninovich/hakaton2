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
import com.brcaninovich.hakaton2.ui.izostanci.IzostanciViewModel;

public class komentarFragment extends Fragment {

private FragmentIzostanciBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        IzostanciViewModel izostanciViewModel =
                new ViewModelProvider(this).get(IzostanciViewModel.class);

    binding = FragmentIzostanciBinding.inflate(inflater, container, false);
    View root = binding.getRoot();



        //final TextView textView = binding.textHome;
        binding.neopravdani.setText("Neopravdani");
        binding.opravdani.setText("Opravdani");
        binding.vladanjeTV.setText("Vladanje");

        //DIO ZA FEC
        binding.neopravdaniHolder.setText(UserDataFetch.izostanci_neopravdani);
        binding.opravdaniHolder.setText(UserDataFetch.izostanci_opravdani);
        binding.vladanjeHolder.setText(UserDataFetch.vladanje);
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