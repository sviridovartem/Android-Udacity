package com.example.android.miwok;

/**
 * Created by Sviridov on 11.02.2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgResourseId = NO_IMG_PROVIDED;
    private static final int NO_IMG_PROVIDED = -1;


    public Word(String DefaultTranslation, String MiwokTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int ImgResourseId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImgResourseId = ImgResourseId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImgResourseId;
    }

    public boolean hasImage() {
        return mImgResourseId != NO_IMG_PROVIDED;
    }
}
