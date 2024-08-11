package com.taehun.factory.factory;

import com.taehun.factory.button.Button;
import com.taehun.factory.button.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}