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
    private Drawable mImage;

    public Word(String defaultTranslation, String miwokTranslation, Drawable image){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = image;
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

    public Drawable getImage(){ return mImage; }
}
