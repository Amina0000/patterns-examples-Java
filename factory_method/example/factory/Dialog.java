package factory_method.example.factory;

import factory_method.example.button.Button;

public abstract class Dialog {
    // базовый класс фабрики

    public void renderWindow() {
        // ..   остальной код диалога

        Button okButton = createButton();
        okButton.render();
    }

    // подклассы будут переопределять этот метод, чтобы создавать конкретные объекты продуктов

    public abstract Button createButton();
}
