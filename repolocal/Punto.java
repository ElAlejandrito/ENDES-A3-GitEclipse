package figuras;
/**
 * Clase Punto
 * @version 03-2024
 * @author Alejandro
 * since 04-03-2024
 */
public class Punto {
	//variables
	private double x;
	private double y;
		//inicializa las variables x e y con valores predeterminados de 0
	public Punto(){
		x = 0;
		y= 0;
	}
		//asigna los valores de los parámetros a las variables x e y de la clase Punto
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
		//asigna los valores de las variables x e y del parámetro a las variables x e y de la clase Punto
	public Punto(Punto p){
		x = p.x;
		y = p.y;
	}
		/**
		 * Método que devuelve el valor de la variable x de la clase donde se define el método
		 * @return
		 */
	public double getX(){
		return x;
	}
		/**
		 * Método que devuelve el valor de la variable y de la clase donde se define el método
		 * @return
		 */
	public double getY(){
		return y;
	}
		/**
		 * Método que establece el valor de la variable x de la clase donde se define el método al valor del parámetro x
		 * @param x
		 */
	public void setX(double x){
		this.x = x;
	}
		/**
		 * Método que  establece el valor de la variable y de la clase donde se define el método al valor del parámetro y
		 * @param y
		 */
	public void setY(double y){
		this.y = y;
	}
		/**
		 * Método que calcula la distancia entre dos puntos en un plano cartesiano utilizando la fórmula de la distancia euclidiana.
		 * @param p
		 * @return
		 */
	public double distancia(Punto p){
		return Math.sqrt (Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
	}
		/**
		 * Método que calcula el punto simétrico de un punto dado respecto al eje y en un plano cartesiano y devuelve un objeto Punto que representa el punto simétrico
		 * @return
		 */
	public Punto simetrico(){
		Punto nuevoP = new Punto (this.x * -1, this.y);	
		return nuevoP ;
	}
		/**
		 * Método que compara dos puntos en un plano cartesiano y devuelve true si los puntos tienen las mismas coordenadas
		 * @param p
		 * @return
		 */
	public boolean compara(Punto p){
		if (p.x == x && p.y == y)
			return true;
		else
			return false;
	}
		/**
		 * Método que evuelve una representación en forma de cadena de texto de las coordenadas x e y de un objeto Punto
		 */
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
}