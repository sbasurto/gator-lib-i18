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
		assert "Agrupador de precios por cliente".equals(spanish.getString("Customer Price Grouping"));
		assert "Agrupador de precios base por producto".equals(spanish.getString("Product Price Grouping"));
		assert "Incremento sobre costo (sólo grupos de precio) (%)".equals(spanish.getString("Price increase over cost (price groups only) (%)"));
		assert "Ventas Detalle".equals(spanish.getString("Sales Detail"));
		assert "Diario".equals(spanish.getString("Daily"));
		assert "Semanal".equals(spanish.getString("Weekly"));
		assert "Mensual".equals(spanish.getString("Monthly"));
		assert "Anual".equals(spanish.getString("Annual"));
		assert "Acumulado".equals(spanish.getString("Accumulated"));
		assert "Compras Detalle".equals(spanish.getString("Purchase Detail"));
		assert "Sin familia".equals(spanish.getString("No family"));
		assert "Descripción".equals(spanish.getString("Description"));
		assert "Familia".equals(spanish.getString("Family"));
		assert "Precio".equals(spanish.getString("Price"));
		assert "Costo".equals(spanish.getString("Cost"));
		assert "Columnas".equals(spanish.getString("Columns"));
		assert "Filtros".equals(spanish.getString("Filters"));
		assert "Aplicar".equals(spanish.getString("Apply"));
		assert "Valor a buscar".equals(spanish.getString("Value to find"));
		assert "Agregar filtro".equals(spanish.getString("Add filter"));
		assert "Debe permanecer visible al menos una columna".equals(spanish.getString("At least one column must remain visible"));
		assert "Ir a la página".equals(spanish.getString("Go to page"));
		assert "Description".equals(english.getString("Description"));
		assert "Family".equals(english.getString("Family"));
		assert "Price".equals(english.getString("Price"));
		assert "Cost".equals(english.getString("Cost"));
        assert "CONFIRMED".equals(english.getString("CONFIRMADO"));
    }
}
