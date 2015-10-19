package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by asadmshah on 10/18/15.
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
        Drawable avatarSrc = attrs.getDrawable(R.styleable.SingleLineAvatarWithTextView_avatarSrc);
        attrs.recycle();

        if (titleText != null) mViewTitle.setText(titleText);
        if (titleTextColor != -1) mViewTitle.setTextColor(titleTextColor);
        if (avatarSrc != null) mViewAvatar.setImageDrawable(avatarSrc);
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
