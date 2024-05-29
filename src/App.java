

public class App {
    public static void main(String[] args) throws Exception {
        // tính tuổi hiện tại
        Person person = new Person();
        person.namsinh = 2004;
        int tuoi = person.PredictAge();
        System.out.printf("Tuoi cua ban la %d tuoi%n",tuoi);

        //tính chu vi và diện tích hình tròn
        Circle hinhtron1 = new Circle();
        hinhtron1.bankinh = 4;
        double chuvi = hinhtron1.Perimeter();
        System.out.printf("%nChu vi hinh tron la: %f",chuvi);
        double dientich = hinhtron1.Area();
        System.out.printf("%nDien tich hinh tron la: %f%n",dientich);

        //tính tốc độ của xe
        Car mycar = new Car();
        int toLan1 = mycar.upTo20();
        System.out.printf("%nToc do cua xe trong lan 1 tang %d km/h",toLan1);
        int toLan2 = mycar.upTo40();
        System.out.printf("%nToc do cua xe trong lan 2 tang %d km/h",toLan2);
        int toLan3 = mycar.upTo60();
        System.out.printf("%nToc do cua xe trong lan 3 tang %d km/h",toLan3);
        int toLan4 = mycar.upTo20();
        System.out.printf("%nToc do cua xe trong lan 4 tang %d km/h%n",toLan4);
        //chuyển số phút
        TimeCoversionAPP chuyendoi = new TimeCoversionAPP();
        int giosangphut = chuyendoi.covertHoursToMinutes(2);
        System.out.printf("%n%d phut", giosangphut);
        int ngaysangphut = chuyendoi.covertDaysToMinutes(3);
        System.out.printf("%n%d phut", ngaysangphut);
    }
}
