package com.zechassault.zonemap.Adapter;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;

public abstract class NoteImageAdapter<T> extends MapAdapter<T> {
    private Paint labelPaint = new Paint();
    private Paint linePaint = new Paint();
    private PointF centerAnchor = new PointF(0.5f,0.5f);

    public NoteImageAdapter() {
        //18 sp
        float textSize = (Resources.getSystem().getDisplayMetrics().scaledDensity) * 18;
        labelPaint.setAntiAlias(true);
        labelPaint.setTextSize(textSize);
        linePaint.setAntiAlias(true);
    }

    /**
     * Define this function to specify the legend of an item
     *
     * @param item the item to which the legend is linked
     * @return String, legend displayed
     */
    public abstract String getLabel(T item);

    /**
     * Override this function to define your own Paint for label drawing
     *
     * @param item the item to which the legend is linked
     * @return the labelPaint of to draw the label
     */
    public Paint getLabelPaint(T item) {
        return labelPaint;
    }

    /**
     * Override this function to define your own Paint for lines
     *
     * @param item the item to which the legend is linked
     * @return the labelPaint of to draw the label
     */
    public Paint getLinePaint(T item) {
        return linePaint;
    }


    public PointF getAnchor(T item) {
        return centerAnchor;
    }
}
