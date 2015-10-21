package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * List item consisting of two lines with an avatar, a title, a subtitle, and an icon.
 */
public class TwoLineAvatarWithTextAndIconView extends BaseView {

    public TwoLineAvatarWithTextAndIconView(Context context) {
        super(context);
    }

    public TwoLineAvatarWithTextAndIconView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TwoLineAvatarWithTextAndIconView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TwoLineAvatarWithTextAndIconView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.two_line_avatar_with_text_and_icon_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.TwoLineAvatarWithTextAndIconView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.TwoLineAvatarWithTextAndIconView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.TwoLineAvatarWithTextAndIconView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.TwoLineAvatarWithTextAndIconView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.TwoLineAvatarWithTextAndIconView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.TwoLineAvatarWithTextAndIconView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.TwoLineAvatarWithTextAndIconView_fontFamilyForTitle);
        String subtitleText = attrs.getString(R.styleable.TwoLineAvatarWithTextAndIconView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.TwoLineAvatarWithTextAndIconView_textColorForSubtitle, -1);
        float subtitleTextSize = attrs.getDimension(R.styleable.TwoLineAvatarWithTextAndIconView_textSizeForSubtitle, -1);
        int subtitleTextStyle = attrs.getInt(R.styleable.TwoLineAvatarWithTextAndIconView_textStyleForSubtitle, Typeface.NORMAL);
        int subtitleTypeface = attrs.getInt(R.styleable.TwoLineAvatarWithTextAndIconView_typefaceForSubtitle, 0);
        String subtitleFontFamily = attrs.getString(R.styleable.TwoLineAvatarWithTextAndIconView_fontFamilyForSubtitle);
        Drawable iconSrc = attrs.getDrawable(R.styleable.TwoLineAvatarWithTextAndIconView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.TwoLineAvatarWithTextAndIconView_iconTint, -1);
        Drawable avatarSrc = attrs.getDrawable(R.styleable.TwoLineAvatarWithTextAndIconView_avatarSrc);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
        prepareTextViewWithAttrValues(mViewSubtitle, subtitleText, subtitleTextColor, subtitleTextSize, subtitleTextStyle, subtitleTypeface, subtitleFontFamily);
        prepareIconViewWithAttrValues(iconSrc, iconTint);
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
    public ImageView getIconImageView() {
        return super.getIconImageView();
    }

    @Override
    public AvatarImageView getAvatarImageView() {
        return super.getAvatarImageView();
    }

}
