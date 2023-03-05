import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Display {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/*..............................................*/
	public Display() {
		initialize();
	}
	
	
	/*..............................................*/
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(70, 130, 180));
		frame.getContentPane().setLayout(null);
		frame.setBounds(0, 0, 434, 222);
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("conversor de temperatura");
        model.addElement("conversor de moneda");
        
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(0, 0, 434, 145);
		frame.getContentPane().add(panel);
		
		JComboBox<?> comboBox = new JComboBox<>(model);
		comboBox.setBounds(134, 151, 179, 22);
		comboBox.setFocusable(false);
		comboBox.setEditable(true);
		comboBox.setRenderer(new menuSeleccion.menuDesplegable());
		frame.getContentPane().add(comboBox);
			
		
		
	}
	
}
