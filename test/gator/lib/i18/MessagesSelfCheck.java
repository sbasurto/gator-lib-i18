package gator.lib.i18;

import java.util.ResourceBundle;

public final class MessagesSelfCheck {
    public static void main(String[] args) {
        ResourceBundle spanish = ResourceBundle.getBundle("gator.lib.i18.Messages_es");
        ResourceBundle english = ResourceBundle.getBundle("gator.lib.i18.Messages_en");
        assert "INICIO".equals(spanish.getString("HOME"));
        assert "Carta Cupo".equals(spanish.getString("Capacity Letter"));
        assert "Generar archivo SAAI".equals(spanish.getString("Generate SAAI File"));
        assert "Clave temporal de acceso".equals(spanish.getString("Temporary access key"));
        assert "Cantidad contada".equals(spanish.getString("Counted Quantity"));
        assert "Seleccionar empaque RFId".equals(spanish.getString("Select RFId Packing"));
        assert "El SID debe existir en la ubicación".equals(spanish.getString("The SID must exists in location"));
        assert "CONFIRMED".equals(english.getString("CONFIRMADO"));
    }
}
