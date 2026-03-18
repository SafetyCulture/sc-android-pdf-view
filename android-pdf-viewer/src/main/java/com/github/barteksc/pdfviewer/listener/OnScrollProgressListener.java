package com.github.barteksc.pdfviewer.listener;

public interface OnScrollProgressListener {

    /**
     * Called when the scroll position changes
     * @param progress the scroll progress between 0.0 and 1.0
     */
    void onScrollProgress(float progress);
}
