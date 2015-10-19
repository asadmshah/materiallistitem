package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by asadmshah on 10/19/15.
 */
public class TwoLineAvatarWithTextView extends BaseView {

    public TwoLineAvatarWithTextView(Context context) {
        super(context);
    }

    public TwoLineAvatarWithTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TwoLineAvatarWithTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TwoLineAvatarWithTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.two_line_avatar_with_text_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.TwoLineAvatarWithTextView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.TwoLineAvatarWithTextView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.TwoLineAvatarWithTextView_textColorForTitle, -1);
        String subtitleText = attrs.getString(R.styleable.TwoLineAvatarWithTextView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.TwoLineAvatarWithTextView_textColorForSubtitle, -1);
        Drawable avatarSrc = attrs.getDrawable(R.styleable.TwoLineAvatarWithTextView_avatarSrc);
        attrs.recycle();
        if (titleText != null) mViewTitle.setText(titleText);
        if (titleTextColor != -1) mViewTitle.setTextColor(titleTextColor);
        if (subtitleText != null) mViewSubtitle.setText(subtitleText);
        if (subtitleTextColor != -1) mViewSubtitle.setTextColor(subtitleTextColor);
        if (avatarSrc != null) mViewAvatar.setImageDrawable(avatarSrc);
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
    public AvatarImageView getAvatarImageView() {
        return super.getAvatarImageView();
    }

}