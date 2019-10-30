package com.shuozi.keyboardpopup;

public class KeyboardPopupHelper {

    public static boolean dismiss(KeyboardPopupWindow keyboardPopupWindow){
        if (keyboardPopupWindow != null && keyboardPopupWindow.isShowing()) {
            keyboardPopupWindow.dismiss();
            return true;
        }
        return false;
    }
}
