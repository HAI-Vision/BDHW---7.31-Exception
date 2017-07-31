package entity;

import myexception.HeightAgeException;
import myexception.HighSalaryException;
import myexception.IdCardException;
import myexception.LowAgeException;
import myexception.LowSalaryException;
import myexception.NullException;

public class Employee {
	
	private String number;
	private String name;
	private int age;
	private double salary;
	private String id;
	private static int employee_sum = 0;
	private static double employee_salary_sum = 0;
	
	public Employee(){
		
	}
	
	/**
	 * 构造器：设置编号 姓名 年龄 工资 身份证号码
	 * @param number 编号
	 * @param name 姓名
	 * @param age 年龄
	 * @param salary 工资
	 * @param id 身份证号码
	 * @throws NullException 姓名为null或为空字符串，抛出空异常
	 * @throws LowAgeException 年龄小于18，抛出年龄低异常
	 * @throws HeightAgeException 年龄大于60 抛出年龄高异常
	 * @throws LowSalaryException 工资低于600，抛出工资低异常
	 * @throws IdCardException 身份证不是18位，抛出身份证非法异常
	 */
	public Employee(String number, String name, int age, double salary, String id) throws NullException, LowAgeException, HeightAgeException, LowSalaryException, IdCardException {
		if(name == null || name.equals("")) {
			throw new NullException("姓名为null或为空字符串");
		}
		if(age < 18){
			throw new LowAgeException("异常：年龄小于18");
		}else if(age > 60){
			throw new HeightAgeException("异常：年龄大于60");
		}
		if(salary < 600){
			throw new LowSalaryException("构造时 工资低异常");
		}
		if(id.length() != 18){
			throw new IdCardException("身份证非法构造异常");
		}
		this.number = number;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.id = id;
		
		Employee.employee_salary_sum +=salary;
		Employee.employee_sum++;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getEmployee_sum() {
		return employee_sum;
	}

	public void setEmployee_sum(int employee_sum) {
		this.employee_sum = employee_sum;
	}

	public double getEmployee_salary_sum() {
		return employee_salary_sum;
	}

	public void setEmployee_salary_sum(double employee_salary_sum) {
		this.employee_salary_sum = employee_salary_sum;
	}
	
	/**
	 * 增加工资
	 * @param addSalary
	 * @throws HighSalaryException 当增加后的工资大于100000时 抛出工资高异常
	 */
	public void addSalary(double addSalary) throws HighSalaryException {
		double t = getSalary()+addSalary;
		if(t > 100000){
			throw new HighSalaryException("异常！ 增加后的工资大于100000");
		}
		setSalary(t);
	}
	
	/**
	 * 减少工资
	 * @param minusSalary
	 * @throws LowSalaryException 当减少后的工资低于最低工资600时 抛出工资低异常
	 */
	public void minusSalary(double minusSalary) throws LowSalaryException{
		double t = getSalary() - minusSalary;
		if(t < 600){
			throw new LowSalaryException("异常！减少后的工资低于规定最低工资600元");
		}
		setSalary(t);
	}
	
	/**
	 * 显示员工工资总额方法
	 * @throws NullException 当工资总额为0时 抛出空异常
	 */
	public void showTotalSalary() throws NullException{
		if(getEmployee_salary_sum() == 0) {
			throw new NullException("抛出空异常 工资总额为0");
		}
		System.out.println("当前员工工资总额："+getEmployee_salary_sum()+" 元");
	}
	
	/**
	 * 显示员工人数
	 * @throws NullException 当员工人数为0时 抛出空异常
	 */
	public void showTotalEmployee() throws NullException{
		if(getEmployee_sum() == 0){
			throw new NullException("抛出空异常 员工人数为0");
		}
		System.out.println("当前共有员工： "+getEmployee_sum()+" 人");
	}
}
