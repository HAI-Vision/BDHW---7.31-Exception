package test;

import entity.Employee;
import myexception.HeightAgeException;
import myexception.HighSalaryException;
import myexception.IdCardException;
import myexception.LowAgeException;
import myexception.LowSalaryException;
import myexception.NullException;

public class Test {
	
	public static void main(String[] args) {
		try {
//			// 1测试 测试 姓名为null或为空字符串 抛出空异常   
//			System.out.println("测试1 姓名为null或为空字符串 抛出空异常 ");
//			Employee emp1 = new Employee("1", "", 21, 700, "130722201700000001");

//			// 2测试 年龄小于18 抛出年龄低异常
//			System.out.println("测试2 年龄小于18 抛出年龄低异常");
//			Employee emp2 = new Employee("2", "w2", 16, 700, "130722201700000002");
			
//			// 3测试 年龄大于60 抛出年龄高异常
//			System.out.println("测试3 年龄大于60 抛出年龄高异常");
//			Employee emp3 = new Employee("3", "w3", 61, 800, "130722201700000003");

//			// 4测试 工资低于600，抛出工资低异常
//			System.out.println("测试4 工资低于600，抛出工资低异常");
//			Employee emp4 = new Employee("4", "w4", 24, 500, "130722201700000004");
		
//			// 5测试 身份证不是18位，抛出身份证非法异常
//			System.out.println("测试5 身份证不是18位，抛出身份证非法异常");
//			Employee emp5 = new Employee("5", "w5", 25, 800, "1307222017000000051");
			
			// 6测试 增加工资 addSalary() 当增加后的工资大于100000时 抛出工资高异常
			System.out.println("测试6 增加工资 addSalary() 当增加后的工资大于100000时 抛出工资高异常");
			Employee emp6 = new Employee("6", "w6", 26, 800, "130722201700000006");
			try {
				emp6.addSalary(100000);
			} catch (HighSalaryException e) {
				e.printStackTrace();
			}

			// 7测试 减少工资 minusSalary() 当减少后的工资低于600时 抛出工资低异常
			System.out.println("测试7 减少工资 minusSalary() 当减少后的工资低于600时 抛出工资低异常");
			Employee emp7 = new Employee("7", "w7", 27, 800, "130722201700000007");
			try {
				emp7.minusSalary(500);
			} catch (LowSalaryException e) {
				e.printStackTrace();
			}
			
			// 8测试 显示员工工资总额 showTotalSalary() 当工资总额为0时 抛出空异常
			System.out.println("测试8 显示员工工资总额 showTotalSalary() 当工资总额为0时 抛出空异常");
			Employee emp8 = new Employee("8", "w8", 28, 800, "130722201700000008");
			emp8.showTotalEmployee();
			emp8.showTotalSalary();

		} catch (NullException | LowAgeException | HeightAgeException | LowSalaryException | IdCardException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("over");
	}
}
