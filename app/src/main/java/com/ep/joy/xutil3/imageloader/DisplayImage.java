package com.ep.joy.xutil3.imageloader;

import com.ep.joy.xutil3.R;

/**
 * 设置三种状态下默认显示的图片:
 * 包括图片正在加载时, 图片加载地址为空, 图片加载失败
 * Created by anenn on 6/2/16.
 */
public class DisplayImage {

    private final int imageOnLoading;
    private final int imageForEmptyUri;
    private final int imageOnFail;

    private DisplayImage(Build build) {
        imageOnLoading = build.imageOnLoading;
        imageForEmptyUri = build.imageForEmptyUri;
        imageOnFail = build.imageOnFail;
    }

    public int getImageOnLoading() {
        return imageOnLoading;
    }

    public int getImageForEmptyUri() {
        return imageForEmptyUri;
    }

    public int getImageOnFail() {
        return imageOnFail;
    }

    public static class Build {
        private int imageOnLoading = R.mipmap.ic_launcher;
        private int imageForEmptyUri = R.mipmap.ic_launcher;
        private int imageOnFail = R.mipmap.ic_launcher;

        public Build() {
        }

        public Build showImageOnLoading(int resId) {
            imageOnLoading = resId;
            return this;
        }

        public Build showImageForEmptyUri(int resId) {
            imageForEmptyUri = resId;
            return this;
        }

        public Build showImageOnFail(int resId) {
            imageOnFail = resId;
            return this;
        }

        public DisplayImage build() {
            return new DisplayImage(this);
        }
    }
}
