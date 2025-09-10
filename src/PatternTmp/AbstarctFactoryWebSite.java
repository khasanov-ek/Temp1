package PatternTmp;
/*
Фабричный метод используется для создания только одного продукта
Абстрактная фабрика - это создание семейств связанных или зависимых продуктов.
 */

public class AbstarctFactoryWebSite {

    public static void main(String[] args) {

        /*
        PhpDeveloper phpDeveloper = new PhpDeveloper();
        ManualTester manualTester = new ManualTester();
        ProjectManager projectManager = new ProjectManager();

        System.out.println("Creating project ....");
        phpDeveloper.writeCode();
        manualTester.testCode();
        projectManager.manageProject();
         */

    }
}

/*
class PhpDeveloper {
    public void writeCode() {
        System.out.println("PHP Developer writing php code .....");
    }
}

class  ManualTester {
    public void testCode() {
        System.out.println("Manual Tester testing code ......");
    }
}

class ProjectManager {
    public void manageProject() {
        System.out.println("Prjoject Manager manage website ....");
    }
}

 */

interface Developer {
    void writeCode();
}

interface Tester {
    void testCode();
}

interface  ProjectManager {
    void manageProject();
}

interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}