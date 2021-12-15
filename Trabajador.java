
public class Trabajador {
	//Se crean los atributos
		private String nombre;
		private String ciudad;
		private float SalarioBruto;
		private int ContratoTemporal;
		
		//constructor
		public Trabajador(String nombre, String ciudad, float salarioBruto, int contratoTemporal) {
			super();
			this.nombre = nombre;
			this.ciudad = ciudad;
			this.SalarioBruto = salarioBruto;
			this.ContratoTemporal = contratoTemporal; 
	}
//getters y setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCiudad() {
			return ciudad;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		public float getSalarioBruto() {
			return SalarioBruto;
		}

		public void setSalarioBruto(float salarioBruto) {
			SalarioBruto = salarioBruto;
		}

		public float getContratoTemporal() {
			return ContratoTemporal;
		}

		public void setContratoTemporal(int contratoTemporal) {
			ContratoTemporal = contratoTemporal;
		}
		
		@Override
		public String toString() {
			return " nombre= "+nombre+" ,ciudad="+ciudad+" ,salario bruto="+SalarioBruto+" ,contrato temporal="+ContratoTemporal;
		}
}
