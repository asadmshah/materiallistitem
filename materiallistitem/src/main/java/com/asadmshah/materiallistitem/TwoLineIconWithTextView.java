package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
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
        String subtitleText = attrs.getString(R.styleable.TwoLineIconWithTextView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.TwoLineIconWithTextView_textColorForSubtitle, -1);
        Drawable iconSrc = attrs.getDrawable(R.styleable.TwoLineIconWithTextView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.TwoLineIconWithTextView_iconTint, -1);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor);
        prepareTextViewWithAttrValues(mViewSubtitle, subtitleText, subtitleTextColor);
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
