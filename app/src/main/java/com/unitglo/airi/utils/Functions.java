package com.unitglo.airi.utils;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.unitglo.airi.R;
import com.unitglo.airi.auth.PhoneVerificationActivity;
import com.unitglo.airi.auth.RegisterPhoneActivity;

public class Functions {


    public static void setNumberKeyboard(AppCompatActivity appCompatActivity) {
        EditText etMobileNumberRegisterPhone = appCompatActivity.findViewById(R.id.etMobileNumberRegisterPhone);
        TextView tv1NumberKeyboard = appCompatActivity.findViewById(R.id.tv1NumberKeyboard);
        TextView tv2NumberKeyboard = appCompatActivity.findViewById(R.id.tv2NumberKeyboard);
        TextView tv3NumberKeyboard = appCompatActivity.findViewById(R.id.tv3NumberKeyboard);
        TextView tv4NumberKeyboard = appCompatActivity.findViewById(R.id.tv4NumberKeyboard);
        TextView tv5NumberKeyboard = appCompatActivity.findViewById(R.id.tv5NumberKeyboard);
        TextView tv6NumberKeyboard = appCompatActivity.findViewById(R.id.tv6NumberKeyboard);
        TextView tv7NumberKeyboard = appCompatActivity.findViewById(R.id.tv7NumberKeyboard);
        TextView tv8NumberKeyboard = appCompatActivity.findViewById(R.id.tv8NumberKeyboard);
        TextView tv9NumberKeyboard = appCompatActivity.findViewById(R.id.tv9NumberKeyboard);
        TextView tv0NumberKeyboard = appCompatActivity.findViewById(R.id.tv0NumberKeyboard);
        TextView tvClearNumberKeyboard = appCompatActivity.findViewById(R.id.tvClearNumberKeyboard);

        tv1NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });

        tv2NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });

        tv3NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });

        tv4NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });

        tv5NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });

        tv6NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });

        tv7NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });

        tv8NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });

        tv9NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });

        tv0NumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(appCompatActivity, view, etMobileNumberRegisterPhone);
            }
        });


        tvClearNumberKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeText(appCompatActivity, etMobileNumberRegisterPhone);
            }
        });
        tvClearNumberKeyboard.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                etMobileNumberRegisterPhone.setText("");
                return true;
            }
        });
    }

    public static void addText(AppCompatActivity appCompatActivity, View newText, EditText etMobileNumberRegisterPhone) {
        if (appCompatActivity instanceof RegisterPhoneActivity) {
            TextView textView = (TextView) newText;
            String oldText = etMobileNumberRegisterPhone.getText().toString();
            etMobileNumberRegisterPhone.setText(oldText + textView.getText().toString());
            etMobileNumberRegisterPhone.setSelection(etMobileNumberRegisterPhone.getText().length());
        } else if (appCompatActivity instanceof PhoneVerificationActivity) {
            EditText etOtp1PhoneVerification = appCompatActivity.findViewById(R.id.etOtp1PhoneVerification);
            EditText etOtp2PhoneVerification = appCompatActivity.findViewById(R.id.etOtp2PhoneVerification);
            EditText etOtp3PhoneVerification = appCompatActivity.findViewById(R.id.etOtp3PhoneVerification);
            EditText etOtp4PhoneVerification = appCompatActivity.findViewById(R.id.etOtp4PhoneVerification);
            TextView textView = (TextView) newText;
            if (TextUtils.isEmpty(etOtp1PhoneVerification.getText().toString())) {
                etOtp1PhoneVerification.setText(textView.getText().toString());
            } else if (TextUtils.isEmpty(etOtp2PhoneVerification.getText().toString())) {
                etOtp2PhoneVerification.setText(textView.getText().toString());
            } else if (TextUtils.isEmpty(etOtp3PhoneVerification.getText().toString())) {
                etOtp3PhoneVerification.setText(textView.getText().toString());
            } else if (TextUtils.isEmpty(etOtp4PhoneVerification.getText().toString())) {
                etOtp4PhoneVerification.setText(textView.getText().toString());
            }
        }
    }

    public static void removeText(AppCompatActivity appCompatActivity, EditText etMobileNumberRegisterPhone) {
        if (appCompatActivity instanceof RegisterPhoneActivity) {
            String string = etMobileNumberRegisterPhone.getText().toString();
            if (!TextUtils.isEmpty(string)) {
                etMobileNumberRegisterPhone.setText(string.substring(0, string.length() - 1));
            }
        } else if (appCompatActivity instanceof PhoneVerificationActivity) {

            EditText etOtp1PhoneVerification = appCompatActivity.findViewById(R.id.etOtp1PhoneVerification);
            EditText etOtp2PhoneVerification = appCompatActivity.findViewById(R.id.etOtp2PhoneVerification);
            EditText etOtp3PhoneVerification = appCompatActivity.findViewById(R.id.etOtp3PhoneVerification);
            EditText etOtp4PhoneVerification = appCompatActivity.findViewById(R.id.etOtp4PhoneVerification);

            if (!TextUtils.isEmpty(etOtp4PhoneVerification.getText().toString())) {
                etOtp4PhoneVerification.setText("");
            } else if (!TextUtils.isEmpty(etOtp3PhoneVerification.getText().toString())) {
                etOtp3PhoneVerification.setText("");
            } else if (!TextUtils.isEmpty(etOtp2PhoneVerification.getText().toString())) {
                etOtp2PhoneVerification.setText("");
            } else if (!TextUtils.isEmpty(etOtp1PhoneVerification.getText().toString())) {
                etOtp1PhoneVerification.setText("");
            }

        }

    }
}
