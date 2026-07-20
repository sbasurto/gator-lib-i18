package gator.lib.i18;

import java.util.ResourceBundle;

public final class MessagesSelfCheck {
    public static void main(String[] args) {
        ResourceBundle spanish = ResourceBundle.getBundle("gator.lib.i18.Messages_es");
        ResourceBundle english = ResourceBundle.getBundle("gator.lib.i18.Messages_en");
        assert "INICIO".equals(spanish.getString("HOME"));
        assert "CONFIRMED".equals(english.getString("CONFIRMADO"));
    }
}
