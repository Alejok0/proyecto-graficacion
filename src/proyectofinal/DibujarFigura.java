package proyectofinal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DibujarFigura extends JPanel {

private int lados = 0;

private double distanciaVertice = 0;
private double anguloRotacion = 0;

private int grosor = 1;
private Color color = Color.BLACK;

private int tamaño = 10;

private int[] puntoInicial;

private int[] posicion;

public DibujarFigura() {
	super();
	this.lados = 3;
}

public DibujarFigura(int lados, double anguloRotacion, int tamaño, int grosor, Color color) {
	this.lados = lados;
	this.anguloRotacion = anguloRotacion;
	this.grosor = grosor;
	this.color = color;
	this.tamaño = tamaño;

	this.distanciaVertice = (360 / lados);
	this.puntoInicial = new int[]{tamaño, tamaño};
	this.posicion = new int[]{getWidth(), getHeight()};
}

@Override
public void setBackground(Color bg) {
	super.setBackground(Color.WHITE);
}

private ArrayList<Double> getPuntosEnX() {
	ArrayList<Double> listaPuntos = new ArrayList<Double>();
	double punto_actual;

	for (int numero_punto = 1; numero_punto <= getLados(); numero_punto++) {
		//Se calcula su posicion actual (incluyendo su rotacion)
		punto_actual = Math.cos(grados_a_radianes(getDistanciaVertice() * numero_punto + getAnguloRotacion()));
		punto_actual += -Math.sin(grados_a_radianes(getDistanciaVertice() * numero_punto + getAnguloRotacion()));

		//Se asigna el tamaño
		punto_actual = punto_actual * puntoInicial[0];
		punto_actual += getWidth() / 2;

		listaPuntos.add(punto_actual);
	}

	return listaPuntos;
}

private ArrayList<Double> getPuntosEnY() {
	ArrayList<Double> listaPuntos = new ArrayList<Double>();
	double punto_actual;

	for (int numero_punto = 1; numero_punto <= getLados(); numero_punto++) {
		//Se calcula su posicion actual (incluyendo su rotacion)
		punto_actual = Math.sin(grados_a_radianes(getDistanciaVertice() * numero_punto + getAnguloRotacion()));
		punto_actual += Math.cos(grados_a_radianes(getDistanciaVertice() * numero_punto + getAnguloRotacion()));

		//Se asigna el tamaño
		punto_actual = punto_actual * puntoInicial[1];
		punto_actual += getHeight() / 2;

		listaPuntos.add(punto_actual);
	}

	return listaPuntos;
}

private double grados_a_radianes(double grados) {
	return grados * (Math.PI / 180);
}

@Override
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D) g;

	// Dibujar el triángulo con los valores actuales de tamaño
	int[] xPoints = convertirArrayListAArray(getPuntosEnX());
	int[] yPoints = convertirArrayListAArray(getPuntosEnY());

	// Establecer el grosor de borde en 3 píxeles
	g2d.setStroke(new BasicStroke(getGrosor()));
	g2d.setColor(Color.BLACK);

	Polygon polygon = new Polygon(xPoints, yPoints, getLados());
	g2d.drawPolygon(polygon);

	g2d.setColor(getColor());
	g.fillPolygon(polygon);
}

public static int[] convertirArrayListAArray(ArrayList<Double> lista) {
	int[] array = new int[lista.size()];
	for (int i = 0; i < lista.size(); i++) {
		array[i] = (int) lista.get(i).doubleValue();
	}
	return array;
}

public int getLados() {
	return lados;
}

public void setLados(int lados) {
	this.lados = lados;
}

public double getDistanciaVertice() {
	return distanciaVertice;
}

public void setDistanciaVertice(double distanciaVertice) {
	this.distanciaVertice = distanciaVertice;
}

public double getAnguloRotacion() {
	return anguloRotacion;
}

public void setAnguloRotacion(double anguloRotacion) {
	this.anguloRotacion = anguloRotacion;
}

public int getGrosor() {
	return grosor;
}

public void setGrosor(int grosor) {
	this.grosor = grosor;
}

public Color getColor() {
	return color;
}

public void setColor(Color color) {
	this.color = color;
}

}
