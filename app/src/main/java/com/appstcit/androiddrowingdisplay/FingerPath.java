package com.appstcit.androiddrowingdisplay;

import android.graphics.Path;

/**
 * Created by Bj on 12-12-17.
 */

public class FingerPath {
    public int color;
    public boolean emboss;
    public boolean blur;
    public int strokeWidth;
    public Path path;

    public FingerPath(int color, boolean emboss, boolean blur, int strokeWidth, Path path) {
        this.color = color;
        this.emboss = emboss;
        this.blur = blur;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}

