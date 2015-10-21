package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * List item consisting of a single line with a checkbox and a title.
 */
public class SingleLineCheckboxWithTextView extends BaseView {

    public SingleLineCheckboxWithTextView(Context context) {
        super(context);
    }

    public SingleLineCheckboxWithTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SingleLineCheckboxWithTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SingleLineCheckboxWithTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.single_line_checkbox_with_text_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.SingleLineCheckboxWithTextView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.SingleLineCheckboxWithTextView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.SingleLineCheckboxWithTextView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.SingleLineCheckboxWithTextView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.SingleLineCheckboxWithTextView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.SingleLineCheckboxWithTextView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.SingleLineCheckboxWithTextView_fontFamilyForTitle);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
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
    public AppCompatCheckBox getCheckboxView() {
        return super.getCheckboxView();
    }
}
