public class H21_CODING {
    private String pname;
    private String dept;
    //Get methods
    public String getProfName(){
        return pname;
    }
    public String getDeptName(){
        return dept;
    }
    //Set methods
    public void setProfName(String name){
        this.pname = name;
    }
    public void setDeptName(String dept){
        this.dept = dept;
    }
}

class College{
    public static void main(String[] args){
        H21_CODING p = new H21_CODING();
        p.setProfName("Ical");
        p.setDeptName("CSE");
        System.out.println("Professor Name: "+ p.getProfName());
        System.out.println("Department: "+ p.getDeptName());
    }
}
