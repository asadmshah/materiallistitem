package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by asadmshah on 10/19/15.
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
        String subtitleText = attrs.getString(R.styleable.ThreeLineTextOnlyView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.ThreeLineTextOnlyView_textColorForSubtitle, -1);
        attrs.recycle();
        if (titleText != null) mViewTitle.setText(titleText);
        if (titleTextColor != -1) mViewTitle.setTextColor(titleTextColor);
        if (subtitleText != null) mViewSubtitle.setText(subtitleText);
        if (subtitleTextColor != -1) mViewSubtitle.setTextColor(subtitleTextColor);
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
