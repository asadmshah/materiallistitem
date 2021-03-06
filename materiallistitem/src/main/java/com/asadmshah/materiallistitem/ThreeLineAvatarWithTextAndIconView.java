package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * List item consisting of three lines with an avatar, a title, a subtitle, and an icon.
 */
public class ThreeLineAvatarWithTextAndIconView extends BaseView {

    public ThreeLineAvatarWithTextAndIconView(Context context) {
        super(context);
    }

    public ThreeLineAvatarWithTextAndIconView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeLineAvatarWithTextAndIconView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ThreeLineAvatarWithTextAndIconView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.three_line_avatar_with_text_and_icon_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.ThreeLineAvatarWithTextAndIconView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.ThreeLineAvatarWithTextAndIconView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.ThreeLineAvatarWithTextAndIconView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.ThreeLineAvatarWithTextAndIconView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.ThreeLineAvatarWithTextAndIconView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.ThreeLineAvatarWithTextAndIconView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.ThreeLineAvatarWithTextAndIconView_fontFamilyForTitle);
        String subtitleText = attrs.getString(R.styleable.ThreeLineAvatarWithTextAndIconView_textForSubtitle);
        int subtitleTextColor = attrs.getColor(R.styleable.ThreeLineAvatarWithTextAndIconView_textColorForSubtitle, -1);
        float subtitleTextSize = attrs.getDimension(R.styleable.ThreeLineAvatarWithTextAndIconView_textSizeForSubtitle, -1);
        int subtitleTextStyle = attrs.getInt(R.styleable.ThreeLineAvatarWithTextAndIconView_textStyleForSubtitle, Typeface.NORMAL);
        int subtitleTypeface = attrs.getInt(R.styleable.ThreeLineAvatarWithTextAndIconView_typefaceForSubtitle, 0);
        String subtitleFontFamily = attrs.getString(R.styleable.ThreeLineAvatarWithTextAndIconView_fontFamilyForSubtitle);
        Drawable avatarSrc = attrs.getDrawable(R.styleable.ThreeLineAvatarWithTextAndIconView_avatarSrc);
        Drawable iconSrc = attrs.getDrawable(R.styleable.ThreeLineAvatarWithTextAndIconView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.ThreeLineAvatarWithTextAndIconView_iconTint, -1);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
        prepareTextViewWithAttrValues(mViewSubtitle, subtitleText, subtitleTextColor, subtitleTextSize, subtitleTextStyle, subtitleTypeface, subtitleFontFamily);
        prepareIconViewWithAttrValues(iconSrc, iconTint);
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
    public ImageView getIconImageView() {
        return super.getIconImageView();
    }

    @Override
    public AvatarImageView getAvatarImageView() {
        return super.getAvatarImageView();
    }

}
