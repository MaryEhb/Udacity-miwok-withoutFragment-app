package android.example.miwok;

public class word {
    private static final int NOT_PROVIDED = -1;
    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private int mImageId = NOT_PROVIDED;
    private int mSongRec;

    public word(String DefaultTranslation, String MiwokTranslation, int songRec) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mSongRec = songRec;
    }

    public word(String DefaultTranslation, String MiwokTranslation, int ImageId, int songRec) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageId = ImageId;
        mSongRec = songRec;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageId() {
        return mImageId;
    }

    public int getmSongRec() {
        return mSongRec;
    }

    public boolean hasImage() {
        return mImageId != NOT_PROVIDED;
    }

}
