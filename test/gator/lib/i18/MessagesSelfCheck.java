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
        assert "Autorice este acceso desde Gator Mobile.".equals(spanish.getString("Approve this access from Gator Mobile."));
        assert "Cantidad contada".equals(spanish.getString("Counted Quantity"));
        assert "Seleccionar empaque RFId".equals(spanish.getString("Select RFId Packing"));
        assert "El SID debe existir en la ubicación".equals(spanish.getString("The SID must exists in location"));
        assert "Diferencia de cantidad".equals(spanish.getString("Quantity Difference"));
        assert "Reporte para mostrar los SID de surtido.".equals(spanish.getString("Report to show picking SIDs."));
        assert "Movimientos en Cuenta".equals(spanish.getString("Account Movements"));
        assert "CONFIRMED".equals(english.getString("CONFIRMADO"));
    }
}
