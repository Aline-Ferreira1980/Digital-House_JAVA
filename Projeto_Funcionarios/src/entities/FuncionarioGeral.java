package entities;

public class FuncionarioGeral {
	
	private Double salary;
	private String vacation;
	private Integer timeWork;
	
	public Double getSalary() {
		return salary;
	}


	public void querySalary() {
		System.out.println("Your salary: R$" + getSalary());
	}
	
	public String askVacation() {
		if (timeWork > 120) {
			System.out.println("Voc� j� tem quanto tempo de empresa? ");
						
			System.out.println("Voc� n�o pode tirar f�rias");
		}else {
			if (timeWork< 335) {
				System.out.println("Voc� pode tirar f�rias!");
			}
		}
		return vacation;
			
	}
}
