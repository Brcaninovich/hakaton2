package com.brcaninovich.hakaton2.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ovdje dolaze ocjene i vladanje");
    }

    public LiveData<String> getText() {
        return mText;
    }
}