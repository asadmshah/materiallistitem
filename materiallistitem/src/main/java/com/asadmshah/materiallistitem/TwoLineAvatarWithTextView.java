package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * List item consisting of two lines with an avatar, a title, and a subtitle.
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
        float titleTextSize = attrs.getDimension(R.styleable.TwoLineAvatarWithTextView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.TwoLineAvatarWithTextView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.TwoLineAvatarWithTextView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.TwoLineAvatarWithTextView_fontFamilyForTitle);
        String subtitleText = attrs.getString(R.styleable.TwoLineAvatarWithTextView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.TwoLineAvatarWithTextView_textColorForSubtitle, -1);
        float subtitleTextSize = attrs.getDimension(R.styleable.TwoLineAvatarWithTextView_textSizeForSubtitle, -1);
        int subtitleTextStyle = attrs.getInt(R.styleable.TwoLineAvatarWithTextView_textStyleForSubtitle, Typeface.NORMAL);
        int subtitleTypeface = attrs.getInt(R.styleable.TwoLineAvatarWithTextView_typefaceForSubtitle, 0);
        String subtitleFontFamily = attrs.getString(R.styleable.TwoLineAvatarWithTextView_fontFamilyForSubtitle);
        Drawable avatarSrc = attrs.getDrawable(R.styleable.TwoLineAvatarWithTextView_avatarSrc);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
        prepareTextViewWithAttrValues(mViewSubtitle, subtitleText, subtitleTextColor, subtitleTextSize, subtitleTextStyle, subtitleTypeface, subtitleFontFamily);
        prepareAvatarViewWithAttrValues(avatarSrc);
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
