package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Single line list item to be used in ListViews or RecyclerViews.
 *
 * See <a href="https://www.google.com/design/spec/components/lists.html#lists-specs">Components - Lists</a>
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
        attrs.recycle();
        if (titleText != null) mViewTitle.setText(titleText);
        if (titleTextColor != -1) mViewTitle.setTextColor(titleTextColor);
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
