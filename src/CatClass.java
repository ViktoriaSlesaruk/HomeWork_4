public class CatClass {
    String name;
    int age;
    String sex;
    boolean isVacсinated;
    String hostName;

    public CatClass(String name, int age, String sex, boolean isVacсinated, String hostName) {
        validateName(name);
        this.age = age;
        this.sex = sex;
        this.isVacсinated = isVacсinated;
        validateHostName(hostName);
    }

    public CatClass(String name, int age, String hostName) {
        validateName(name);
        this.age = age;
        validateHostName(hostName);
    }

    public CatClass(String name, int age, String sex, String hostName) {
        validateName(name);
        this.age = age;
        this.sex = sex;
        validateHostName(hostName);
    }

    public CatClass(String name, int age, boolean isVacсinated, String hostName) {
        validateName(name);
        this.age = age;
        this.isVacсinated = isVacсinated;
        validateHostName(hostName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isVacсinated() {
        return isVacсinated;
    }

    public void setVacсinated(boolean vacсinated) {
        isVacсinated = vacсinated;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        validateHostName(hostName);
    }

    public void validateName(String name) {
        if (name.length()>=3) {
            this.name = name;
        }
        else System.out.println("Too short name");
    }

    public void validateHostName(String name) {
        if (name.length()>=5) {
            this.hostName = name;
        }
        else {
            name = "DafaultName";
            System.out.println("Too short host name");
        }
    }

    public String toString() {
        return "CatClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", isVaccinated=" + isVacсinated +
                ", hostName='" + hostName + '\'' +
                '}';
    }
}