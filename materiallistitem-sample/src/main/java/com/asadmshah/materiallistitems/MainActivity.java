package com.asadmshah.materiallistitems;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asadmshah.materiallistitem.SingleLineAvatarWithTextAndIconView;
import com.asadmshah.materiallistitem.SingleLineAvatarWithTextView;
import com.asadmshah.materiallistitem.SingleLineCheckboxWithAvatarAndTextView;
import com.asadmshah.materiallistitem.SingleLineCheckboxWithIconAndTextView;
import com.asadmshah.materiallistitem.SingleLineCheckboxWithTextView;
import com.asadmshah.materiallistitem.SingleLineIconWithTextView;
import com.asadmshah.materiallistitem.SingleLineTextOnlyView;
import com.asadmshah.materiallistitem.ThreeLineAvatarWithTextView;
import com.asadmshah.materiallistitem.ThreeLineIconWithTextView;
import com.asadmshah.materiallistitem.ThreeLineTextOnlyView;
import com.asadmshah.materiallistitem.TwoLineAvatarWithTextAndIconView;
import com.asadmshah.materiallistitem.TwoLineAvatarWithTextView;
import com.asadmshah.materiallistitem.TwoLineIconWithTextView;
import com.asadmshah.materiallistitem.TwoLineTextOnlyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSingleLineTextOnly(View view) {
        launchFragment(new BaseFragment<SingleLineTextOnlyView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_single_line_text_only;
            }
        });
    }

    public void launchSingleLineIconWithText(View view) {
        launchFragment(new BaseFragment<SingleLineIconWithTextView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_single_line_icon_with_text;
            }
        });
    }

    public void launchSingleLineAvatarWithText(View view) {
        launchFragment(new BaseFragment<SingleLineAvatarWithTextView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_single_line_avatar_with_text;
            }
        });
    }

    public void launchSingleLineAvatarWithTextAndIcon(View view) {
        launchFragment(new BaseFragment<SingleLineAvatarWithTextAndIconView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_single_line_avatar_with_text_and_icon;
            }
        });
    }

    public void launchTwoLineTextOnly(View view) {
        launchFragment(new BaseFragment<TwoLineTextOnlyView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_two_line_text_only;
            }
        });
    }

    public void launchTwoLineIconWithText(View view) {
        launchFragment(new BaseFragment<TwoLineIconWithTextView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_two_line_icon_with_text;
            }
        });
    }

    public void launchTwoLineAvatarWithText(View view) {
        launchFragment(new BaseFragment<TwoLineAvatarWithTextView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_two_line_avatar_with_text;
            }
        });
    }

    public void launchTwoLineAvatarWithTextAndIcon(View view) {
        launchFragment(new BaseFragment<TwoLineAvatarWithTextAndIconView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_two_line_avatar_with_text_and_icon;
            }
        });
    }

    public void launchThreeLineTextOnly(View view) {
        launchFragment(new BaseFragment<ThreeLineTextOnlyView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_three_line_text_only;
            }
        });
    }

    public void launchThreeLineIconWithText(View view) {
        launchFragment(new BaseFragment<ThreeLineIconWithTextView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_three_line_icon_with_text;
            }
        });
    }

    public void launchThreeLineAvatarWithText(View view) {
        launchFragment(new BaseFragment<ThreeLineAvatarWithTextView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_three_line_avatar_with_text;
            }
        });
    }

    public void launchThreeLineAvatarWithTextAndIcon(View view) {
        launchFragment(new BaseFragment<TwoLineAvatarWithTextAndIconView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_three_line_avatar_with_icon_and_text;
            }
        });
    }

    public void launchSingleLineCheckboxWithText(View view) {
        launchFragment(new BaseFragment<SingleLineCheckboxWithTextView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_single_line_checkbox_with_text;
            }
        });
    }

    public void launchSingleLineCheckboxWithIconAndText(View view) {
        launchFragment(new BaseFragment<SingleLineCheckboxWithIconAndTextView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_single_line_checkbox_with_icon_and_text;
            }
        });
    }

    public void launchSingleLineCheckboxWithAvatarAndText(View view) {
        launchFragment(new BaseFragment<SingleLineCheckboxWithAvatarAndTextView>() {
            @Override
            int getLayoutId() {
                return R.layout.list_item_single_line_checkbox_with_avatar_and_text;
            }
        });
    }

    private void launchFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .addToBackStack(null)
                .add(R.id.fragment_view, fragment, null)
                .commit();
    }

}
