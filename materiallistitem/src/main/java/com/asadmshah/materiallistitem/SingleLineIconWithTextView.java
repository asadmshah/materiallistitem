package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * List item consisting of a single line with an icon and a title.
 */
public class SingleLineIconWithTextView extends BaseView {

    public SingleLineIconWithTextView(Context context) {
        super(context);
    }

    public SingleLineIconWithTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SingleLineIconWithTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SingleLineIconWithTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.single_line_title_with_icon_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.SingleLineIconWithTextView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.SingleLineIconWithTextView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.SingleLineIconWithTextView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.SingleLineIconWithTextView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.SingleLineIconWithTextView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.SingleLineIconWithTextView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.SingleLineIconWithTextView_fontFamilyForTitle);
        Drawable iconSrc = attrs.getDrawable(R.styleable.SingleLineIconWithTextView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.SingleLineIconWithTextView_iconTint, -1);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
        prepareIconViewWithAttrValues(iconSrc, iconTint);
    }

    @Override
    protected int getMinimumHeightInList() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.singleLineListItemHeight);
    }

    @Override
    public TextView getTitleView() {
        return super.getTitleView();
    }

    @Override
    public ImageView getIconImageView() {
        return super.getIconImageView();
    }

}
