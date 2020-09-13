package factory_method.example.factory;

import factory_method.example.button.Button;
import factory_method.example.button.HtmlButton;

public class HtmlDialog extends Dialog {
    // HTML диалог

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
