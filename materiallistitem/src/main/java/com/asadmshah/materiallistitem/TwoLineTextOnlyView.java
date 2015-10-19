package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by asadmshah on 10/19/15.
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
        String subtitleText = attrs.getString(R.styleable.TwoLineTextOnlyView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.TwoLineTextOnlyView_textColorForSubtitle, -1);
        attrs.recycle();
        if (titleText != null) mViewTitle.setText(titleText);
        if (titleTextColor != -1) mViewTitle.setTextColor(titleTextColor);
        if (subtitleText != null) mViewSubtitle.setText(subtitleText);
        if (subtitleTextColor != -1) mViewSubtitle.setTextColor(subtitleTextColor);
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