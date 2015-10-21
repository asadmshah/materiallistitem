package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * List item consisting of a single line with an avatar and a title.
 */
public class SingleLineAvatarWithTextView extends BaseView {

    public SingleLineAvatarWithTextView(Context context) {
        super(context);
    }

    public SingleLineAvatarWithTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SingleLineAvatarWithTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SingleLineAvatarWithTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.single_line_title_with_avatar_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.SingleLineAvatarWithTextView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.SingleLineAvatarWithTextView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.SingleLineAvatarWithTextView_textColorForTitle, -1);
        float titleTextSize = attrs.getDimension(R.styleable.SingleLineAvatarWithTextView_textSizeForTitle, -1);
        int titleTextStyle = attrs.getInt(R.styleable.SingleLineAvatarWithTextView_textStyleForTitle, Typeface.NORMAL);
        int titleTypeface = attrs.getInt(R.styleable.SingleLineAvatarWithTextView_typefaceForTitle, 0);
        String titleFontFamily = attrs.getString(R.styleable.SingleLineAvatarWithTextView_fontFamilyForTitle);
        Drawable avatarSrc = attrs.getDrawable(R.styleable.SingleLineAvatarWithTextView_avatarSrc);
        attrs.recycle();

        prepareTextViewWithAttrValues(mViewTitle, titleText, titleTextColor, titleTextSize, titleTextStyle, titleTypeface, titleFontFamily);
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
    public AvatarImageView getAvatarImageView() {
        return super.getAvatarImageView();
    }

}
