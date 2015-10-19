package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by asadmshah on 10/19/15.
 */
public class ThreeLineIconWithTextView extends BaseView {

    public ThreeLineIconWithTextView(Context context) {
        super(context);
    }

    public ThreeLineIconWithTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeLineIconWithTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ThreeLineIconWithTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.three_line_icon_with_text_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.ThreeLineIconWithTextView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.ThreeLineIconWithTextView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.ThreeLineIconWithTextView_textColorForTitle, -1);
        String subtitleText = attrs.getString(R.styleable.ThreeLineIconWithTextView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.ThreeLineIconWithTextView_textColorForSubtitle, -1);
        Drawable iconSrc = attrs.getDrawable(R.styleable.ThreeLineIconWithTextView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.ThreeLineIconWithTextView_iconTint, -1);
        attrs.recycle();

        if (titleText != null) mViewTitle.setText(titleText);
        if (titleTextColor != -1) mViewTitle.setTextColor(titleTextColor);
        if (subtitleText != null) mViewSubtitle.setText(subtitleText);
        if (subtitleTextColor != -1) mViewSubtitle.setTextColor(subtitleTextColor);
        if (iconSrc != null) mViewIcon.setImageDrawable(iconSrc);
        if (iconTint != -1) mViewIcon.setColorFilter(iconTint);
    }

    @Override
    protected void prepareChildViews() {
        mViewSubtitle.setMaxLines(2);
    }

    @Override
    protected int getMinimumHeightInList() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.threeLineListItemHeight);
    }

    @Override
    public TextView getTitleView() {
        return super.getTitleView();
    }

    @Override
    public TextView getSubtitleView() {
        return super.getSubtitleView();
    }

    @Override
    public ImageView getIconImageView() {
        return super.getIconImageView();
    }

}