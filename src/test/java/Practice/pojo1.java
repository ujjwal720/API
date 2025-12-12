package Practice;

public class pojo1 {


    public pojo1(String name,String job){

        this.name=name;
        this.job=job;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String name;

    private String job;

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }



}
