import java.util.ArrayList;

public class Employees {
    String fname,sname,email,term,phonenumber,salary;

                            public Employees(String fname, String sname, String email, String term, String phonenumber, String salary) {
                this.fname = fname;
                this.sname = sname;
                this.email = email;
                this.term = term;
                this.phonenumber = phonenumber;
                this.salary = salary;
    }

                @Override
                public String toString() {
                    return "Employees{" +
                            "fname='" + fname + '\'' +
                            ", sname='" + sname + '\'' +
                            ", email='" + email + '\'' +
                            ", term='" + term + '\'' +
                            ", phonenumber='" + phonenumber + '\'' +
                            ", salary='" + salary + '\'' +
                            '}';
                }

    public static void main(String[] args) {
        ArrayList<Employees>Employees;
        Employees=new ArrayList<>();

        Employees emp1=new Employees("liz","lung'ania","@liz.com","2 years","0799023456","100000");
        Employees emp2=new Employees("Tina","Mulaku","@mulaku.com","1 year","0799023556","95000");
        Employees emp3=new Employees("Brian","ken","@ken.com","2 years","0799023458","50000");
        Employees emp4=new Employees("Jane","Doe","@jane.com","10 months","0799023356","67000");
        Employees emp5=new Employees("John","Doe","@doe.com","2 years","0799021256","230000");
        Employees emp6=new Employees("liz","Semerian","@semerian.com","1 years 8 months","0799028956","840000");
        Employees emp7=new Employees("Rose","Enane","@enane.com","1.5 years","0799024556","70000");
        Employees emp8=new Employees("Joy","line","@line.com","5 months","0756023456","40000");
        Employees emp9=new Employees("eric","mugure","@mugure.com","8 months","0706023456","60000");
        Employees emp10=new Employees("berit","chanzu","@chanzu.com","2 months","0879023456","20000");

                Employees.add(emp1);
                Employees.add(emp2);
                Employees.add(emp3);
                Employees.add(emp4);
                Employees.add(emp5);
                Employees.add(emp6);
                Employees.add(emp7);
                Employees.add(emp8);
                Employees.add(emp9);
                Employees.add(emp10);

        System.out.println(Employees.toString());
    }
}

