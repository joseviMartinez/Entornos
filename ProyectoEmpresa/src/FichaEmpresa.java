import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FichaEmpresa extends JFrame {

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Direccion;
	private JTextField Precio;
	private JTextField Fecha;
	private Clientes cliente;
		//ComboBox para guardar clientes
		private JComboBox<Clientes> clientes;
		private JTextField Numero;
		private JTextField Puerta;
		private JTextField Letra;
		
		//Lanza la aplicación
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						FichaEmpresa frame = new FichaEmpresa();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	/**
	 * Create the frame.
	 */
	public FichaEmpresa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		clientes = new JComboBox<Clientes>();
		clientes.setBounds(71, 33, 277, 20);
		contentPane.add(clientes);
		
		JLabel lblFicha = new JLabel("Ficha");
		lblFicha.setBounds(173, 11, 46, 14);
		contentPane.add(lblFicha);
		
		Nombre = new JTextField();
		Nombre.setBounds(71, 78, 277, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(173, 64, 46, 14);
		contentPane.add(lblNombre);
		
		Direccion = new JTextField();
		Direccion.setBounds(70, 117, 124, 20);
		contentPane.add(Direccion);
		Direccion.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(71, 103, 63, 14);
		contentPane.add(lblDireccion);
		
		Precio = new JTextField();
		Precio.setBounds(71, 162, 86, 20);
		contentPane.add(Precio);
		Precio.setColumns(10);
		
		Fecha = new JTextField();
		Fecha.setBounds(173, 162, 126, 20);
		contentPane.add(Fecha);
		Fecha.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(71, 148, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblFechaenvio = new JLabel("FechaEnvio");
		lblFechaenvio.setBounds(173, 148, 94, 14);
		contentPane.add(lblFechaenvio);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Aquí realizaremos los siguientes pasos
				//1.- Comprobaremos que todos los campos están completados
				if ( Nombre.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}

				else if ( Direccion.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}

				else if ( Precio.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}

				else if ( Fecha.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}
				else if ( Numero.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}
				else if ( Puerta.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}
				else if ( Letra.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}

				else{
				//2.- Crearemos un nuevo objeto delincuente
				//delin=new delincuente();
				Clientes cliente=new Clientes();
				
				cliente.guardarNombre(Nombre.getText());
				cliente.guardarDireccion(Direccion.getText());
				cliente.guardarprecio(Float.parseFloat(Precio.getText()));
				cliente.guardarfecha(Integer.parseInt(Fecha.getText()));
				cliente.guardarnumero(Integer.parseInt(Numero.getText()));
				cliente.guardarpuerta(Integer.parseInt(Puerta.getText()));
				cliente.guardarletra(Letra.getText());


				//3.- Lo almacenaremos en el ComboBox
				clientes.addItem(cliente);
				}
			}
		});
		btnGuardar.setBounds(71, 208, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientes.getItemAt(clientes.getSelectedIndex());
				
				cliente.guardarNombre(Nombre.getText());
				cliente.guardarDireccion(Direccion.getText());
				cliente.guardarprecio(Float.parseFloat(Precio.getText()));
				cliente.guardarfecha(Integer.parseInt(Fecha.getText()));
				cliente.guardarnumero(Integer.parseInt(Numero.getText()));
				cliente.guardarpuerta(Integer.parseInt(Puerta.getText()));
				cliente.guardarletra(Letra.getText());
			}
		});
		btnModificar.setBounds(182, 208, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientes.removeItem(clientes.getItemAt(clientes.getSelectedIndex()));
			}
		});
		btnBorrar.setBounds(290, 208, 89, 23);
		contentPane.add(btnBorrar);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(215, 103, 46, 14);
		contentPane.add(lblNumero);
		
		Numero = new JTextField();
		Numero.setBounds(215, 117, 38, 20);
		contentPane.add(Numero);
		Numero.setColumns(10);
		
		Puerta = new JTextField();
		Puerta.setBounds(263, 117, 46, 20);
		contentPane.add(Puerta);
		Puerta.setColumns(10);
		
		JLabel lblPuerta = new JLabel("Puerta");
		lblPuerta.setBounds(263, 103, 46, 14);
		contentPane.add(lblPuerta);
		
		Letra = new JTextField();
		Letra.setBounds(317, 117, 38, 20);
		contentPane.add(Letra);
		Letra.setColumns(10);
		
		JLabel lblLetra = new JLabel("Letra");
		lblLetra.setBounds(319, 103, 46, 14);
		contentPane.add(lblLetra);
	
		clientes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			cliente=clientes.getItemAt(clientes.getSelectedIndex());
			
			Nombre.setText(String.valueOf(cliente.CogerNombre()));
			Direccion.setText(String.valueOf(cliente.cogerDireccion()));
			Precio.setText(String.valueOf(cliente.cogerprecio()));
			Fecha.setText(String.valueOf(cliente.cogerfecha()));
			Numero.setText(String.valueOf(cliente.cogernumero()));
			Puerta.setText(String.valueOf(cliente.cogerpuerta()));
			Letra.setText(String.valueOf(cliente.cogerletra()));
		}
	});		
}
}