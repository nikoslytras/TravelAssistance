package com.example.first_try;

public class Word {
    private int mDefaultTranslationId;


    private int mOriginalTranslationId;

    private int mProforaId;


    public Word(int defaultTranslationId, int OriginalTranslationId, int Profora) {
        mDefaultTranslationId = defaultTranslationId;
        mOriginalTranslationId = OriginalTranslationId;
        mProforaId = Profora;


    }

    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }


    public int getmOriginalTranslationId() {
        return mOriginalTranslationId;
    }

    public int getmProforaId() {
        return mProforaId;
    }
}

