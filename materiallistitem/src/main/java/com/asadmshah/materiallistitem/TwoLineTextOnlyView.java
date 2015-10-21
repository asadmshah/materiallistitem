package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * List item consisting of two lines with a a title and a subtitle.
 */
public class TwoLineTextOnlyView extends BaseView {

    public TwoLineTextOnlyView(Context context) {
        super(context);
    }

    public TwoLineTextOnlyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TwoLineTextOnlyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TwoLineTextOnlyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void prepareChildViews() {
        mViewSubtitle.setMaxLines(1);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.two_line_text_only_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.TwoLineTextOnlyView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.TwoLineTextOnlyView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.TwoLineTextOnlyView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.TwoLineTextOnlyView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.TwoLineTextOnlyView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.TwoLineTextOnlyView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.TwoLineTextOnlyView_fontFamilyForTitle);
        String subtitleText = attrs.getString(R.styleable.TwoLineTextOnlyView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.TwoLineTextOnlyView_textColorForSubtitle, -1);
        float subtitleTextSize = attrs.getDimension(R.styleable.TwoLineTextOnlyView_textSizeForSubtitle, -1);
        int subtitleTextStyle = attrs.getInt(R.styleable.TwoLineTextOnlyView_textStyleForSubtitle, Typeface.NORMAL);
        int subtitleTypeface = attrs.getInt(R.styleable.TwoLineTextOnlyView_typefaceForSubtitle, 0);
        String subtitleFontFamily = attrs.getString(R.styleable.TwoLineTextOnlyView_fontFamilyForSubtitle);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
        prepareTextViewWithAttrValues(mViewSubtitle, subtitleText, subtitleTextColor, subtitleTextSize, subtitleTextStyle, subtitleTypeface, subtitleFontFamily);
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

}
