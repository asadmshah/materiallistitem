package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * List item consisting of three lines with an icon, a title, and a subtitle.
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
        float titleTextSize = attrs.getDimension(R.styleable.ThreeLineIconWithTextView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.ThreeLineIconWithTextView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.ThreeLineIconWithTextView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.ThreeLineIconWithTextView_fontFamilyForTitle);
        String subtitleText = attrs.getString(R.styleable.ThreeLineIconWithTextView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.ThreeLineIconWithTextView_textColorForSubtitle, -1);
        float subtitleTextSize = attrs.getDimension(R.styleable.ThreeLineIconWithTextView_textSizeForSubtitle, -1);
        int subtitleTextStyle = attrs.getInt(R.styleable.ThreeLineIconWithTextView_textStyleForSubtitle, Typeface.NORMAL);
        int subtitleTypeface = attrs.getInt(R.styleable.ThreeLineIconWithTextView_typefaceForSubtitle, 0);
        String subtitleFontFamily = attrs.getString(R.styleable.ThreeLineIconWithTextView_fontFamilyForSubtitle);
        Drawable iconSrc = attrs.getDrawable(R.styleable.ThreeLineIconWithTextView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.ThreeLineIconWithTextView_iconTint, -1);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
        prepareTextViewWithAttrValues(mViewSubtitle, subtitleText, subtitleTextColor, subtitleTextSize, subtitleTextStyle, subtitleTypeface, subtitleFontFamily);
        prepareIconViewWithAttrValues(iconSrc, iconTint);
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
