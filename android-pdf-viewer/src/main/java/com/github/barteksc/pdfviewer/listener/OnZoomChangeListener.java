package com.github.barteksc.pdfviewer.listener;

public interface OnZoomChangeListener {

    /**
     * Called when the zoom level changes
     * @param zoom the new zoom level (>= 1.0)
     */
    void onZoomChanged(float zoom);
}
