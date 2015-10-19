package com.asadmshah.materiallistitem;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

abstract class BaseView extends FrameLayout {

    protected TextView mViewTitle;
    protected TextView mViewSubtitle;
    protected ImageView mViewIcon;
    protected AvatarImageView mViewAvatar;
    protected AppCompatCheckBox mViewCheckbox;

    public BaseView(Context context) {
        super(context);
        init(context, null, 0, 0);
    }

    public BaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0, 0);
    }

    public BaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr, 0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public BaseView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        inflate(context, getLayoutResourceId(), this);

        mViewTitle = (TextView) findViewById(R.id.listItemTitle);
        mViewSubtitle = (TextView) findViewById(R.id.listItemSubtitle);
        mViewIcon = (ImageView) findViewById(R.id.listItemIcon);
        mViewAvatar = (AvatarImageView) findViewById(R.id.listItemAvatar);
        mViewCheckbox = (AppCompatCheckBox) findViewById(R.id.listItemCheckbox);

        TypedArray ta = context.obtainStyledAttributes(attrs, getStyleAttributeIds(), defStyleAttr, defStyleRes);
        useStyleAttributes(ta);

        mViewTitle.setSingleLine(true);
        prepareChildViews();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(
                MeasureSpec.getSize(widthMeasureSpec),
                Math.round(getMinimumHeightInList() * getResources().getConfiguration().fontScale));
    }

    /**
     * @return the resource id to inflate.
     */
    protected abstract int getLayoutResourceId();

    /**
     * @return the desired attributes for this view.
     */
    protected abstract int[] getStyleAttributeIds();

    /**
     * Use the given styledAttributes to prepare view data.
     *
     * @param attrs that were generated using mStyleableResourceId;
     */
    protected abstract void useStyleAttributes(TypedArray attrs);

    /**
     * @return the height of the view if using WRAP_CONTENT in layout_height
     */
    protected abstract int getMinimumHeightInList();

    /**
     * This will get called after child views are found in case subclass wants to make any modifications.
     */
    protected void prepareChildViews() {

    }

    /**
     * @return The title TextView.
     */
    protected TextView getTitleView() {
        return mViewTitle;
    }

    /**
     * @return The subtitle TextView.
     */
    protected TextView getSubtitleView() {
        return mViewSubtitle;
    }

    /**
     * @return The ImageView with the id listItemIcon.
     */
    protected ImageView getIconImageView() {
        return mViewIcon;
    }

    /**
     * @return The ImageView with the id listItemAvatar.
     */
    protected AvatarImageView getAvatarImageView() {
        return mViewAvatar;
    }

    /**
     * @return The AppCompatCheckBox with the id listItemCheckbox
     */
    protected AppCompatCheckBox getCheckboxView() {
        return mViewCheckbox;
    }

}
