package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by asadmshah on 10/18/15.
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
        Drawable iconSrc = attrs.getDrawable(R.styleable.SingleLineIconWithTextView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.SingleLineIconWithTextView_iconTint, -1);
        attrs.recycle();

        if (titleText != null) mViewTitle.setText(titleText);
        if (titleTextColor != -1) mViewTitle.setTextColor(titleTextColor);
        if (iconSrc != null) mViewIcon.setImageDrawable(iconSrc);
        if (iconTint != -1) mViewIcon.setColorFilter(iconTint);
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
