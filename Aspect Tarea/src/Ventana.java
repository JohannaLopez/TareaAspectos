import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	private JButton boton1; 
	private JButton boton2;
	private JButton boton3;
	
	Color[] colors;
	
	
	public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        colors = new Color[3];
        colors[0] = Color.yellow;
        colors[1] = Color.blue;
        colors[2] = Color.red;
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes        
    }
	
	private void configurarVentana() {
		 this.setTitle("Tarea Aspectos");                   // colocamos titulo a la ventana
		 this.setSize(310, 210);                                 // colocamos tamanio a la ventana (ancho, alto)
	     this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
	     this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
	     this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

	private void inicializarComponentes() {
		boton1 = new JButton();	
		boton2 = new JButton();
		boton3 = new JButton();
		boton1.setText(getColourName(colors[0]));   // colocamos un texto al boton		
		boton1.setBounds(50, 20, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)		 
		boton2.setText(getColourName(colors[1]));   // colocamos un texto al boton
		boton2.setBounds(50, 60, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)		  
		boton3.setText(getColourName(colors[2]));   // colocamos un texto al boton
		boton3.setBounds(50, 100, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
		boton1.addActionListener((new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			accionBoton1(e,colors[0]);
		}  
		}));
		boton2.addActionListener((new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			accionBoton2(e,colors[1]);
		}  
		}));
		boton3.addActionListener((new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				accionBoton3(e,colors[2]);
		}  
		}));		
		this.add(boton1);
		this.add(boton2);
		this.add(boton3);
	}
	
	private void accionBoton1(ActionEvent e, Color color){
		this.getContentPane().setBackground( color );
	}
	
	private void accionBoton2(ActionEvent e, Color color){		
		this.getContentPane().setBackground(color );
	}	
		
	private void accionBoton3(ActionEvent e, Color color){		
		this.getContentPane().setBackground( color );
	}
	
	
	private String getColourName(Color color) {
	    String name = "UNKNOWN";	    
	        if (color.equals(Color.yellow)){
	            name = "yellow";
	        }else if (color.equals(Color.blue)){
	        	name = "blue";
	        }else if (color.equals(Color.red)){
	        	name = "red";
	        }	    
	    return name;
	}
	
}
