package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * List item consisting of three lines with a title and a subtitle.
 */
public class ThreeLineTextOnlyView extends BaseView {

    public ThreeLineTextOnlyView(Context context) {
        super(context);
    }

    public ThreeLineTextOnlyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeLineTextOnlyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ThreeLineTextOnlyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.three_line_text_only_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.ThreeLineTextOnlyView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.ThreeLineTextOnlyView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.ThreeLineTextOnlyView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.ThreeLineTextOnlyView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.ThreeLineTextOnlyView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.ThreeLineTextOnlyView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.ThreeLineTextOnlyView_fontFamilyForTitle);
        String subtitleText = attrs.getString(R.styleable.ThreeLineTextOnlyView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.ThreeLineTextOnlyView_textColorForSubtitle, -1);
        float subtitleTextSize = attrs.getDimension(R.styleable.ThreeLineTextOnlyView_textSizeForSubtitle, -1);
        int subtitleTextStyle = attrs.getInt(R.styleable.ThreeLineTextOnlyView_textStyleForSubtitle, Typeface.NORMAL);
        int subtitleTypeface = attrs.getInt(R.styleable.ThreeLineTextOnlyView_typefaceForSubtitle, 0);
        String subtitleFontFamily = attrs.getString(R.styleable.ThreeLineTextOnlyView_fontFamilyForSubtitle);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
        prepareTextViewWithAttrValues(mViewSubtitle, subtitleText, subtitleTextColor, subtitleTextSize, subtitleTextStyle, subtitleTypeface, subtitleFontFamily);
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

}
