package factory_method.example.factory;

import factory_method.example.button.Button;
import factory_method.example.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
