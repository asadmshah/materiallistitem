package com.asadmshah.materiallistitems;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.asadmshah.materiallistitem.AvatarImageView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by asadmshah on 10/19/15.
 */
public abstract class BaseFragment<T> extends Fragment {

    abstract int getLayoutId();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ListView view = (ListView) inflater.inflate(R.layout.fragment_list, container, false);
        view.setAdapter(new ArrayAdapter<Integer>(getActivity(), -1) {
            @Override
            public int getCount() {
                return 20;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = LayoutInflater.from(parent.getContext()).inflate(getLayoutId(), parent, false);
                }
                T view = (T) convertView;
                bindData(position,
                        getClassView(view, "getTitleView"),
                        getClassView(view, "getSubtitleView"),
                        getClassView(view, "getIconImageView"),
                        getClassView(view, "getAvatarImageView"),
                        getClassView(view, "getCheckboxView"));
                return convertView;
            }

            private View getClassView(T view, String methodName) {
                Method method;
                try {
                    method = view.getClass().getDeclaredMethod(methodName, (Class<?>[]) null);
                } catch (NoSuchMethodException e) {
                    return null;
                }
                Object o;
                try {
                    o = method.invoke(view, (Object[]) null);
                } catch (InvocationTargetException e) {
                    return null;
                } catch (IllegalAccessException e) {
                    return null;
                }
                return o instanceof View ? (View) o : null;
            }

            private void bindData(int position, View title, View subtitle, View icon, View avatar, View checkbox) {
                if (title != null && title instanceof TextView) {
                    ((TextView) title).setText("Title item " + position);
                }
                if (subtitle != null && subtitle instanceof TextView) {
                    ((TextView) subtitle).setText(position + " -- You've got to get enough sleep. Other travelling salesmen live a life of luxury");
                }
                if (icon != null && icon instanceof ImageView) {
                    ((ImageView) icon).setImageResource(R.drawable.ic_cloud_white_24dp);
                }
                if (avatar != null && avatar instanceof AvatarImageView) {
                    ((AvatarImageView) avatar).setImageResource(R.drawable.actually_matias_duarte);
                }
                if (checkbox != null && checkbox instanceof AppCompatCheckBox) {
                    ((AppCompatCheckBox) checkbox).setChecked(position % 2 == 0);
                }
            }

        });
        return view;
    }

}
