package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * List item consisting of two lines with an icon, a title, and a subtitle.
 */
public class TwoLineIconWithTextView extends BaseView {

    public TwoLineIconWithTextView(Context context) {
        super(context);
    }

    public TwoLineIconWithTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TwoLineIconWithTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TwoLineIconWithTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.two_line_icon_with_text_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.TwoLineIconWithTextView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.TwoLineIconWithTextView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.TwoLineIconWithTextView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.TwoLineIconWithTextView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.TwoLineIconWithTextView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.TwoLineIconWithTextView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.TwoLineIconWithTextView_fontFamilyForTitle);
        String subtitleText = attrs.getString(R.styleable.TwoLineIconWithTextView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.TwoLineIconWithTextView_textColorForSubtitle, -1);
        float subtitleTextSize = attrs.getDimension(R.styleable.TwoLineIconWithTextView_textSizeForSubtitle, -1);
        int subtitleTextStyle = attrs.getInt(R.styleable.TwoLineIconWithTextView_textStyleForSubtitle, Typeface.NORMAL);
        int subtitleTypeface = attrs.getInt(R.styleable.TwoLineIconWithTextView_typefaceForSubtitle, 0);
        String subtitleFontFamily = attrs.getString(R.styleable.TwoLineIconWithTextView_fontFamilyForSubtitle);
        Drawable iconSrc = attrs.getDrawable(R.styleable.TwoLineIconWithTextView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.TwoLineIconWithTextView_iconTint, -1);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
        prepareTextViewWithAttrValues(mViewSubtitle, subtitleText, subtitleTextColor, subtitleTextSize, subtitleTextStyle, subtitleTypeface, subtitleFontFamily);
        prepareIconViewWithAttrValues(iconSrc, iconTint);
    }

    @Override
    protected void prepareChildViews() {
        mViewSubtitle.setMaxLines(1);
    }

    @Override
    protected int getMinimumHeightInList() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.twoLineListItemHeight);
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
