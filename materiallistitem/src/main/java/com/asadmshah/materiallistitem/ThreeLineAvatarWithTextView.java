package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * List item consisting of three lines with an avatar, a title, and a subtitle.
 */
public class ThreeLineAvatarWithTextView extends BaseView {

    public ThreeLineAvatarWithTextView(Context context) {
        super(context);
    }

    public ThreeLineAvatarWithTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeLineAvatarWithTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ThreeLineAvatarWithTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.three_line_avatar_with_text_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.ThreeLineAvatarWithTextView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.ThreeLineAvatarWithTextView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.ThreeLineAvatarWithTextView_textColorForTitle, -1);
        String subtitleText = attrs.getString(R.styleable.ThreeLineAvatarWithTextView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.ThreeLineAvatarWithTextView_textColorForSubtitle, -1);
        Drawable avatarSrc = attrs.getDrawable(R.styleable.ThreeLineAvatarWithTextView_avatarSrc);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor);
        prepareTextViewWithAttrValues(mViewSubtitle, subtitleText, subtitleTextColor);
        prepareAvatarViewWithAttrValues(avatarSrc);
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

    @Override
    public AvatarImageView getAvatarImageView() {
        return super.getAvatarImageView();
    }

}
