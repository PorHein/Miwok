package com.example.android.miwok;

public class Word {

    // Default translation for the word
    private String mDefaultTranslation;
    // Miwok translation for the word /
    private String mMiwokTranslation;
    // Image resoure ID for the word /
    private int mImageResourceId = No_IMAGE_PROVIDED;
    // Constant value that represents no image was provided for this word /
    private static final int No_IMAGE_PROVIDED = -1;
    // Audio resoure ID for the word /
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation,String miwokTranslation, int imageResourceId,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() { return  mDefaultTranslation;
    }

    public  String getMiwokTranslation() { return  mMiwokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId;
    }
    // Return wether or not there is an image for this word
    public boolean hasImage(){
        return mImageResourceId != No_IMAGE_PROVIDED;
    }
    // Return the audio
    public int getmAudioResource() { return mAudioResourceId; }
}
