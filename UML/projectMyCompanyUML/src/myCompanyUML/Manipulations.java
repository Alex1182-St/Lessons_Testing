package myCompanyUML;

public class Manipulations {

    public static void main(String[] args) {

    Employee Employee1 = new Employee("Petro","Sydorenko","yurist");
    Employee Employee2 = new Employee("Ivan","Proday-Pivo","driver");
    Employee Employee3 = new Employee("Mykola","Vakula","manager");

    Room Room1 = new Room (2);
    Room Room2 = new Room (1);

    Department Dept2 = new Department("Drivers");
    Department Dept1 = new Department("Sales department");

    ServerAccount ServerAccount1 = new ServerAccount("manager1",50);
    ServerAccount ServerAccount2 = new ServerAccount("manager2",50);

    Employee1.setPosition("yurist-consult");
    Employee2.setPosition("truck driver");
    Employee3.setPosition("sales-manager");

    Employee1.setRoom(Room1);
    Employee2.setRoom(Room2);
    Employee3.setRoom(Room2);

    Employee1.setDepartment(Dept1);
    Employee2.setDepartment(Dept2);
    Employee3.setDepartment(Dept1);
    Dept1.addEmployee(Employee1);
    Dept1.addEmployee(Employee3);
    Dept2.addEmployee(Employee2);

    Employee1.setAccount(ServerAccount1);
    Employee3.setAccount(ServerAccount2);


    System.out.println("Прізвище" + Employee1.getSurname()+"Посада"+ Employee1.getPosition() + "Відділ" +Employee1.getDepartment());
    mInfoTextView.setText("Кількість працівників у відділі Sales departmen:" + Dept1.size()); //???? что тут не так??????

    }
}
