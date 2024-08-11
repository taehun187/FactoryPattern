package com.taehun.factory.factory;

import com.taehun.factory.button.Button;
import com.taehun.factory.button.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}