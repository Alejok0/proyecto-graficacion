package proyectofinal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class FigurasUI extends javax.swing.JFrame {

String[] colors = {"AZUL", "CIAN", "GRIS OSCURO", "GRIS", "VERDE", "GRIS CLARO", "MAGENTA", "NARANJA", "ROSADO", "ROJO", "BLANCO", "AMARILLO"};

DefaultComboBoxModel<String> colorComboBoxModel = new DefaultComboBoxModel<>(colors);

public FigurasUI() {
	this.setLocationRelativeTo(null);
	initComponents();

	DibujarFigura figura = generarFigura();
	contenedorFigura.add(figura);

	actualizarContenido();
}

private void dibujarFigura() {
	limpiarContenido();

	DibujarFigura figura = generarFigura();
	contenedorFigura.add(figura);

	actualizarContenido();
}

private DibujarFigura generarFigura() {
	return new DibujarFigura(getCantidadLados(), getAngulo(), getTamaño(), getGrosor(), getColor());
}

private int getCantidadLados() {
	return Integer.parseInt(txtLados.getText());
}

private double getAngulo() {
	return sldRotar.getValue();
}

private int getTamaño() {
	return sldTamaño.getValue();
}

private int getGrosor() {
	return sldGrosor.getValue();
}

private Color getColor() {
	Color color = null;

	switch (colorComboBoxModel.getSelectedItem().toString()) {
		case "AZUL":
			color = Color.BLUE;
			break;
		case "CIAN":
			color = Color.CYAN;
			break;
		case "GRIS OSCURO":
			color = Color.DARK_GRAY;
			break;
		case "GRIS":
			color = Color.GRAY;
			break;
		case "VERDE":
			color = Color.GREEN;
			break;
		case "GRIS CLARO":
			color = Color.LIGHT_GRAY;
			break;
		case "MAGENTA":
			color = Color.MAGENTA;
			break;
		case "NARANJA":
			color = Color.ORANGE;
			break;
		case "ROSADO":
			color = Color.PINK;
			break;
		case "ROJO":
			color = Color.RED;
			break;
		case "BLANCO":
			color = Color.WHITE;
			break;
		case "AMARILLO":
			color = Color.YELLOW;
			break;
		default:
			System.out.println("Color no encontrado.");
			break;
	}

	return color;
}

public void limpiarContenido() {
	Component componente = contenedorFigura.getComponent(0);
	contenedorFigura.remove(componente);
	actualizarContenido();
}

public void actualizarContenido() {
	contenedorFigura.revalidate();
	contenedorFigura.repaint();
}

@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    contenedorFlexible = new javax.swing.JScrollPane();
    contenedorPrincipal = new javax.swing.JPanel();
    contenedorEntradas = new javax.swing.JPanel();
    contenedorLados = new javax.swing.JPanel();
    lblLados = new javax.swing.JLabel();
    txtLados = new javax.swing.JTextField();
    contenedorColor = new javax.swing.JPanel();
    lblColor = new javax.swing.JLabel();
    jcbColor = new javax.swing.JComboBox<>();
    contenedorRotar = new javax.swing.JPanel();
    lblRotar = new javax.swing.JLabel();
    sldRotar = new javax.swing.JSlider();
    contenedorTamaño = new javax.swing.JPanel();
    lblTamaño = new javax.swing.JLabel();
    sldTamaño = new javax.swing.JSlider();
    contenedorGrosor = new javax.swing.JPanel();
    lblGrosor = new javax.swing.JLabel();
    sldGrosor = new javax.swing.JSlider();
    contenedorFigura = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    contenedorFlexible.setBorder(null);

    contenedorPrincipal.setPreferredSize(new java.awt.Dimension(550, 398));
    contenedorPrincipal.setLayout(new javax.swing.BoxLayout(contenedorPrincipal, javax.swing.BoxLayout.LINE_AXIS));

    contenedorEntradas.setPreferredSize(new java.awt.Dimension(270, 400));
    contenedorEntradas.setLayout(new javax.swing.BoxLayout(contenedorEntradas, javax.swing.BoxLayout.PAGE_AXIS));

    contenedorLados.setMinimumSize(new java.awt.Dimension(217, 32));

    lblLados.setText("Digite la cantidad de lados");
    lblLados.setPreferredSize(new java.awt.Dimension(150, 30));
    contenedorLados.add(lblLados);

    txtLados.setText("4");
    txtLados.setPreferredSize(new java.awt.Dimension(40, 30));
    txtLados.addInputMethodListener(new java.awt.event.InputMethodListener() {
      public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
      }
      public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
        txtLadosInputMethodTextChanged(evt);
      }
    });
    txtLados.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtLadosKeyTyped(evt);
      }
    });
    contenedorLados.add(txtLados);

    contenedorEntradas.add(contenedorLados);

    contenedorColor.setMinimumSize(new java.awt.Dimension(217, 32));

    lblColor.setText("Seleccione un color");
    lblColor.setPreferredSize(new java.awt.Dimension(150, 30));
    contenedorColor.add(lblColor);

    jcbColor.setModel(colorComboBoxModel);
    jcbColor.setSelectedIndex(0);
    jcbColor.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        jcbColorItemStateChanged(evt);
      }
    });
    contenedorColor.add(jcbColor);

    contenedorEntradas.add(contenedorColor);

    contenedorRotar.setMinimumSize(new java.awt.Dimension(217, 32));

    lblRotar.setText("Escoja los grados a rotar");
    lblRotar.setPreferredSize(new java.awt.Dimension(150, 30));
    contenedorRotar.add(lblRotar);

    sldRotar.setMaximum(360);
    sldRotar.setToolTipText("");
    sldRotar.setValue(45);
    sldRotar.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        sldRotarStateChanged(evt);
      }
    });
    contenedorRotar.add(sldRotar);

    contenedorEntradas.add(contenedorRotar);

    contenedorTamaño.setMinimumSize(new java.awt.Dimension(217, 32));

    lblTamaño.setText("Escoja el tamaño de la figura");
    lblTamaño.setPreferredSize(new java.awt.Dimension(150, 30));
    contenedorTamaño.add(lblTamaño);

    sldTamaño.setMaximum(200);
    sldTamaño.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        sldTamañoStateChanged(evt);
      }
    });
    contenedorTamaño.add(sldTamaño);

    contenedorEntradas.add(contenedorTamaño);

    contenedorGrosor.setMinimumSize(new java.awt.Dimension(217, 32));

    lblGrosor.setText("Escoja el grosor de linea");
    lblGrosor.setPreferredSize(new java.awt.Dimension(150, 30));
    contenedorGrosor.add(lblGrosor);

    sldGrosor.setMaximum(30);
    sldGrosor.setToolTipText("");
    sldGrosor.setValue(6);
    sldGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        sldGrosorStateChanged(evt);
      }
    });
    contenedorGrosor.add(sldGrosor);

    contenedorEntradas.add(contenedorGrosor);

    contenedorPrincipal.add(contenedorEntradas);

    contenedorFigura.setBackground(new java.awt.Color(255, 255, 255));
    contenedorFigura.setForeground(new java.awt.Color(0, 0, 0));
    contenedorFigura.setLayout(new javax.swing.BoxLayout(contenedorFigura, javax.swing.BoxLayout.LINE_AXIS));
    contenedorPrincipal.add(contenedorFigura);

    contenedorFlexible.setViewportView(contenedorPrincipal);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(contenedorFlexible, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(contenedorFlexible)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtLadosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtLadosInputMethodTextChanged
		if (getCantidadLados() >= 3) {
					dibujarFigura();
		}
  }//GEN-LAST:event_txtLadosInputMethodTextChanged

  private void sldRotarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldRotarStateChanged
		if (getCantidadLados() >= 3) {
					dibujarFigura();
		}
  }//GEN-LAST:event_sldRotarStateChanged

  private void sldTamañoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldTamañoStateChanged
		if (getCantidadLados() >= 3) {
					dibujarFigura();
		}
  }//GEN-LAST:event_sldTamañoStateChanged

  private void sldGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldGrosorStateChanged
		if (getCantidadLados() >= 3) {
					dibujarFigura();
		} 
  }//GEN-LAST:event_sldGrosorStateChanged

  private void jcbColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbColorItemStateChanged
		if (evt.getStateChange() == 1) {
			dibujarFigura();
		}
  }//GEN-LAST:event_jcbColorItemStateChanged

  private void txtLadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadosKeyTyped
		if (!(txtLados.getText().isBlank() || txtLados.getText().isEmpty())
						&& Integer.parseInt(txtLados.getText()) >= 3) {
			dibujarFigura();
		}
  }//GEN-LAST:event_txtLadosKeyTyped

public static void main(String args[]) {
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try {
		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			if ("Nimbus".equals(info.getName())) {
				javax.swing.UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		}
	} catch (ClassNotFoundException ex) {
		java.util.logging.Logger.getLogger(FigurasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(FigurasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
		java.util.logging.Logger.getLogger(FigurasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
		java.util.logging.Logger.getLogger(FigurasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	public void run() {
		new FigurasUI().setVisible(true);
	}
	});
}
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel contenedorColor;
  private javax.swing.JPanel contenedorEntradas;
  private javax.swing.JPanel contenedorFigura;
  private javax.swing.JScrollPane contenedorFlexible;
  private javax.swing.JPanel contenedorGrosor;
  private javax.swing.JPanel contenedorLados;
  private javax.swing.JPanel contenedorPrincipal;
  private javax.swing.JPanel contenedorRotar;
  private javax.swing.JPanel contenedorTamaño;
  private javax.swing.JComboBox<String> jcbColor;
  private javax.swing.JLabel lblColor;
  private javax.swing.JLabel lblGrosor;
  private javax.swing.JLabel lblLados;
  private javax.swing.JLabel lblRotar;
  private javax.swing.JLabel lblTamaño;
  private javax.swing.JSlider sldGrosor;
  private javax.swing.JSlider sldRotar;
  private javax.swing.JSlider sldTamaño;
  private javax.swing.JTextField txtLados;
  // End of variables declaration//GEN-END:variables
}
