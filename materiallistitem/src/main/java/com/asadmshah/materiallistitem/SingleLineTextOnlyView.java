package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * List item consisting of a single line with a title.
 */
public class SingleLineTextOnlyView extends BaseView {

    public SingleLineTextOnlyView(Context context) {
        super(context);
    }

    public SingleLineTextOnlyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SingleLineTextOnlyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SingleLineTextOnlyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.single_line_title_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.SingleLineTextOnlyView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.SingleLineTextOnlyView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.SingleLineTextOnlyView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.SingleLineTextOnlyView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.SingleLineTextOnlyView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.SingleLineTextOnlyView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.SingleLineTextOnlyView_fontFamilyForTitle);
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

}
