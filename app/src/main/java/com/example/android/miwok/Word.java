package com.example.android.miwok;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by Urban on 6/7/17.
 */

public class Word {

    /** Default translation fot the word **/
    private String mDefaultTranslation;

    /** Miwok translation fot the word **/
    private String mMiwokTranslation;

    /** Word image **/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int image){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = image;
    }

    /**
     * Get the default translation of the word
     */

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word
     */

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
