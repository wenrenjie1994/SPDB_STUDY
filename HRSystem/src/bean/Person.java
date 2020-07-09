package bean;

public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String id;
    /**
     * 毕业院校
     */
    private String school;
    /**
     * 当前所在的阶段
     * 0：已申请
     * 1：简历通过
     * 2：笔试通过
     * 3：体检通过
     * 4：背调通过
     * 5：已签约
     * 6：已入职
     */
    private String process;

    public Person() {
    }

    public Person(String name, String id, String school, String process) {
        this.name = name;
        this.id = id;
        this.school = school;
        this.process = process;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", school='" + school + '\'' +
                ", process=" + process +
                '}';
    }

    /**
     * 保存到txt文件的标准格式
     * @return
     */
    public String formatToFile() {
        return name + "," + id + "," + school + "," + process + "\n";
    }
}
