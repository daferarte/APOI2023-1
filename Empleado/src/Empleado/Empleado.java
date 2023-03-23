/**
 * @author Daniel F. Arteaga
 * @version 1.0
 * @class Empleado
 * Clase que maneja los empleados de la empresa
 * con los atributos de nombre, apellido, salario, sexo
 * asociacion de fecha de nacimiento y fecha de vinculacion
 */
package Empleado;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private double salario;
	/**
	 * @var sexo
	 * 1 = masculino
	 * 2 = femenino
	 */
	private int sexo;
	
	/**
	 * Asociaciones
	 */
	
	private Fecha fNacimiento;
	private Fecha fIngreso;
	
	/**
	 * @Method DarSalario
	 * Metodo para retornar salario del empleado
	 * @return this.salario
	 * Variable global que asigna el salario del empleado
	 */
	public double DarSalario() {
		return this.salario;
	}
	
	/**
	 * @Method DuplicarSalario
	 * Metodo para duplicar el salario
	 */
	public void DuplicarSalario() {
		//Forma larga de asignacion
		//this.salario=this.salario*2;
		//Forma corta de asignacion
		this.salario*=2;
	}
	
	/**
	 * @Method CambiarSalario
	 * metodo para cambiar el salario segun la desposicion
	 * del empleador
	 * @param nuevoSalario
	 * Es la variable con el valor del nuevo salario
	 */
	public void CambiarSalario(double nuevoSalario) {
		this.salario=nuevoSalario;
	}
	
	/**
	 * @Method SalarioAnual
	 * Calcula el salario anual del empleado
	 * @return this.salario*=12;
	 * Multiplica el salario del empleado por 12 meses
	 * que tiene el año
	 */
	public double SalarioAnual() {
		return this.salario*=12;
	}
	
	/**
	 * @Method MiProblema
	 * Metodo temporal de ejemplo para obtener el año de la clase fecha
	 */
	public void MiProblema() {
		int valor=fIngreso.DarAnio();
	}
	
	/**
	 * @Method CalcularImpuesto
	 * Calcula el impuesto al salario anual
	 * @return calculo del impuesto.
	 */
	public double CalcularImpuesto() {
		double salarioAnual = this.SalarioAnual();
		return ((salarioAnual*19.5)/100);
	}

}

















