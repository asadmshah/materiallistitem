package com.asadmshah.materiallistitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * List item consisting of a single line with a checkbox, avatar, and a title.
 */
public class SingleLineCheckboxWithAvatarAndTextView extends BaseView {

    public SingleLineCheckboxWithAvatarAndTextView(Context context) {
        super(context);
    }

    public SingleLineCheckboxWithAvatarAndTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SingleLineCheckboxWithAvatarAndTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SingleLineCheckboxWithAvatarAndTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.single_line_checkbox_with_avatar_and_text_view;
    }

    @Override
    protected int[] getStyleAttributeIds() {
        return R.styleable.SingleLineCheckboxWithAvatarAndTextView;
    }

    @Override
    protected void useStyleAttributes(TypedArray attrs) {
        String titleText = attrs.getString(R.styleable.SingleLineCheckboxWithAvatarAndTextView_textForTitle);
        int titleTextColor = attrs.getColor(R.styleable.SingleLineCheckboxWithAvatarAndTextView_textColorForTitle, -1);
        Drawable avatarSrc = attrs.getDrawable(R.styleable.SingleLineCheckboxWithAvatarAndTextView_avatarSrc);
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

    @Override
    public AppCompatCheckBox getCheckboxView() {
        return super.getCheckboxView();
    }
}
