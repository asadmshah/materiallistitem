package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * List item consisting of a single line with a checkbox, an icon, and a title.
 */
public class SingleLineCheckboxWithIconAndTextView extends BaseView {

    public SingleLineCheckboxWithIconAndTextView(Context context) {
        super(context);
    }

    public SingleLineCheckboxWithIconAndTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SingleLineCheckboxWithIconAndTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SingleLineCheckboxWithIconAndTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.single_line_checkbox_with_icon_and_text_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.SingleLineCheckboxWithIconAndTextView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.SingleLineCheckboxWithIconAndTextView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.SingleLineCheckboxWithIconAndTextView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.SingleLineCheckboxWithIconAndTextView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.SingleLineCheckboxWithIconAndTextView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.SingleLineCheckboxWithIconAndTextView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.SingleLineCheckboxWithIconAndTextView_fontFamilyForTitle);
        Drawable iconSrc = attrs.getDrawable(R.styleable.SingleLineCheckboxWithIconAndTextView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.SingleLineCheckboxWithIconAndTextView_iconTint, -1);
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

    @Override
    public AppCompatCheckBox getCheckboxView() {
        return super.getCheckboxView();
    }
}
