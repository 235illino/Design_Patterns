import Creational.Factory_Method.Creator.DocumentGenerator;
import Creational.Factory_Method.Creator.DocumentGeneratorContract;
import Creational.Factory_Method.Creator.DocumentGeneratorReport;

void main() {
    System.out.println("виберіть документ для друку:");
    System.out.println("введіть 1 для вибору Звіт (Report)");
    System.out.println("введіть 2 для вибору Договір (Contract)");
    Scanner scanner = new Scanner(System.in);
    var input = "";
    DocumentGenerator documentGenerator = null;
    while (!Objects.equals(input, "1") && !Objects.equals(input, "2")){
        input = scanner.nextLine();
        if(Objects.equals(input, "1")){
            documentGenerator = new DocumentGeneratorReport();
        } else if(Objects.equals(input, "2")){
            documentGenerator = new DocumentGeneratorContract();
        } else {
            System.out.println("Некоректний ввід, вводьте 1 або 2");
        }
    }
    documentGenerator.print();

}
