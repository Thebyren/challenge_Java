import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

public class menuSeleccion {
    

    // Clase interna para personalizar el renderizador de lista
    public static class menuDesplegable extends BasicComboBoxRenderer {
		private static final long serialVersionUID = 1L;
		public void ColorPanel(Color color) {
			super.setBackground(Color.DARK_GRAY);
		}

		@Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            setBackground(Color.LIGHT_GRAY);
            setPreferredSize( new Dimension(40, 25));
            return this;
        }
    }
}

