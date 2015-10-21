package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * List item consisting of a single line with an avatar, title, and an icon.
 */
public class SingleLineAvatarWithTextAndIconView extends BaseView {

    public SingleLineAvatarWithTextAndIconView(Context context) {
        super(context);
    }

    public SingleLineAvatarWithTextAndIconView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SingleLineAvatarWithTextAndIconView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SingleLineAvatarWithTextAndIconView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.single_line_avatar_with_text_and_icon_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.SingleLineAvatarWithTextAndIconView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.SingleLineAvatarWithTextAndIconView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.SingleLineAvatarWithTextAndIconView_textForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.SingleLineAvatarWithTextAndIconView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.SingleLineAvatarWithTextAndIconView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.SingleLineAvatarWithTextAndIconView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.SingleLineAvatarWithTextAndIconView_fontFamilyForTitle);
        Drawable iconSrc = attrs.getDrawable(R.styleable.SingleLineAvatarWithTextAndIconView_iconSrc);
        int iconTint = attrs.getColor(R.styleable.SingleLineAvatarWithTextAndIconView_iconTint, -1);
        Drawable avatarSrc = attrs.getDrawable(R.styleable.SingleLineAvatarWithTextAndIconView_avatarSrc);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
        prepareIconViewWithAttrValues(iconSrc, iconTint);
        prepareAvatarViewWithAttrValues(avatarSrc);
    }

    @Override
    protected int getMinimumHeightInList() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.singleLineListItemWithAvatarHeight);
    }

    @Override
    public TextView getTitleView() {
        return super.getTitleView();
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
